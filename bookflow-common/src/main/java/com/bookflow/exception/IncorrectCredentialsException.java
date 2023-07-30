package com.bookflow.exception;

import jakarta.enterprise.inject.Vetoed;

@Vetoed
public class IncorrectCredentialsException extends RuntimeException {

    public IncorrectCredentialsException() {
        super("Incorrect credentials!");
    }
}
