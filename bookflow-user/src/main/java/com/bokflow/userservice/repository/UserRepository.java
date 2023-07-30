package com.bokflow.userservice.repository;

import com.bookflow.model.user.User;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserRepository implements PanacheRepositoryBase<User, String> {

    public boolean checkPassword(String username, String password) {
        return find("username = ?1 and password = ?2", username, password).count() > 0;
    }

    public User findByUsername(String username) {
        return find("username", username).firstResult();
    }
}
