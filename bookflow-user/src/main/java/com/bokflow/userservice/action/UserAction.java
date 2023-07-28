package com.bokflow.userservice.action;

import com.bokflow.userservice.service.UserService;
import com.bookflow.dto.PostUserRequest;
import com.bookflow.model.user.User;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import org.modelmapper.ModelMapper;

@Dependent
public class UserAction {

    @Inject
    UserService userService;

    @Inject
    ModelMapper modelMapper;

    public User postRegistrationUser(PostUserRequest request) {
        User user = modelMapper.map(request, User.class);
        userService.persistAndFlush(user);
        return user;
    }
}
