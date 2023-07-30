package com.bokflow.userservice.service;

import com.bokflow.userservice.repository.UserRepository;
import com.bookflow.exception.IncorrectCredentialsException;
import com.bookflow.model.user.User;
import com.bookflow.validator.RepositoryValidateService;
import jakarta.enterprise.inject.Model;
import jakarta.inject.Inject;

@Model
public class UserService extends RepositoryValidateService {

    @Inject
    UserRepository userRepository;

    public void persistAndFlush(User user) {
        validateVoid(userRepository::persistAndFlush, user);
    }

    public boolean checkPassword(String username, String password) {
        return validate(userRepository::checkPassword, username, password);
    }

    public User findByUsername(String username) {
        User user;
        try {
            user = validate(userRepository::findByUsername, username);
        } catch (RuntimeException e) {
            throw new IncorrectCredentialsException();
        }
        return user;
    }
}
