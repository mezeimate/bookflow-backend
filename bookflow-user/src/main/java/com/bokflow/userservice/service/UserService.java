package com.bokflow.userservice.service;

import com.bokflow.userservice.repository.UserRepository;
import com.bookflow.model.user.User;
import jakarta.enterprise.inject.Model;
import jakarta.inject.Inject;

@Model
public class UserService {

    @Inject
    UserRepository userRepository;

    public void persistAndFlush(User user) {
        userRepository.persistAndFlush(user);
    }
}
