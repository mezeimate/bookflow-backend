package com.bokflow.userservice.action;

import com.bokflow.userservice.currentuser.CurrentUserData;
import com.bokflow.userservice.data.TokenData;
import com.bokflow.userservice.jwt.JwtService;
import com.bokflow.userservice.service.UserService;
import com.bookflow.dto.user.GetCurrentUserResponse;
import com.bookflow.dto.user.PostLoginRequest;
import com.bookflow.dto.user.PostUserLoginResponse;
import com.bookflow.dto.user.PostUserRequest;
import com.bookflow.exception.IncorrectCredentialsException;
import com.bookflow.model.user.User;
import com.bookflow.utils.OffsetDateTimeUtil;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;
import org.modelmapper.ModelMapper;

@Dependent
public class UserAction {

    @Inject
    UserService userService;

    @Inject
    ModelMapper modelMapper;

    @Inject
    JwtService jwtService;

    @Inject
    CurrentUserData currentUserData;

    @Transactional
    public User postRegistrationUser(PostUserRequest request) {
        User user = modelMapper.map(request, User.class);
        userService.persistAndFlush(user);
        return user;
    }

    public PostUserLoginResponse postLoginUser(PostLoginRequest request) {
        String username = request.getUsername();
        User user = userService.findByUsername(username);

        String token;
        TokenData tokenData;
        if (user.getUsername().equals(username) && user.getPassword().equals(request.getPassword())) {
            tokenData = jwtService.generateToken(user);
            token = tokenData.getToken();
        } else {
            throw new IncorrectCredentialsException();
        }

        PostUserLoginResponse response = modelMapper.map(user, PostUserLoginResponse.class);
        response.setSessionToken(token);
        response.setExpireDate(OffsetDateTimeUtil.convertInstantToOffSetDateTime(tokenData.getExpireDate()));
        return response;
    }

    public GetCurrentUserResponse getCurrentUser() {
        return modelMapper.map(currentUserData.getLoggedInUser(), GetCurrentUserResponse.class);
    }

    public Response logout() {

        return Response.accepted().build();
    }
}
