package com.bokflow.userservice.rest;

import com.bokflow.userservice.action.UserAction;
import com.bokflow.userservice.common.UserPath;
import com.bookflow.dto.user.GetCurrentUserResponse;
import com.bookflow.dto.user.PostLoginRequest;
import com.bookflow.dto.user.PostUserLoginResponse;
import com.bookflow.dto.user.PostUserRequest;
import com.bookflow.model.user.User;
import com.bookflow.validator.RestValidateService;
import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.inject.Model;
import jakarta.inject.Inject;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Model
public class UserRest extends RestValidateService implements IUserRest {

    @Inject
    UserAction userAction;

    @Override
    public User postRegistrationUser(PostUserRequest request) {
        return validate(userAction::postRegistrationUser, request);
    }

    @Override
    public PostUserLoginResponse postLoginUser(PostLoginRequest request) {
        return validate(userAction::postLoginUser, request);
    }

    @Override
    @RolesAllowed("USER")
    public GetCurrentUserResponse getCurrentUser() {
        return userAction.getCurrentUser();
    }

    @Override
    @RolesAllowed("USER")
    @Path(UserPath.LOGOUT)
    public Response logout() {
        return userAction.logout();
    }

}
