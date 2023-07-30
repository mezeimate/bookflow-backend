package com.bokflow.userservice.currentuser;

import com.bokflow.userservice.service.UserService;
import com.bookflow.model.user.User;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import org.eclipse.microprofile.jwt.JsonWebToken;

@Dependent
public class CurrentUserData {

    @Inject
    UserService userService;

    @Inject
    JsonWebToken jsonWebToken;

    public User getLoggedInUser() {
        return userService.findByUsername(jsonWebToken.getName());
    }

    public String getLoggedInUserId() {
        return userService.findByUsername(jsonWebToken.getName()).getId();
    }
}
