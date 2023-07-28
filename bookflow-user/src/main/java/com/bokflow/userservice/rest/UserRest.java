package com.bokflow.userservice.rest;

import com.bokflow.userservice.action.UserAction;
import com.bookflow.dto.PostUserRequest;
import com.bookflow.model.user.User;
import jakarta.enterprise.inject.Model;
import jakarta.inject.Inject;

@Model
public class UserRest implements IUserRest {

    @Inject
    UserAction userAction;

    @Override
    public User postRegistrationUser(PostUserRequest request) {
        return userAction.postRegistrationUser(request);
    }
}
