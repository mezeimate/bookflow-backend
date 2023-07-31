package com.bookflow.path;

import jakarta.enterprise.inject.Vetoed;

@Vetoed
public class UserPath {

    public static final String USER_REST_BASE_PATH = "/user";

    public static final String POST_LOGIN = "/login";
    public static final String POST_REGISTER = "/register";
    public static final String LOGOUT = "/logout";
}
