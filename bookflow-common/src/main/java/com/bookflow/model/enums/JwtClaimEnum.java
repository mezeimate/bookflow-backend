package com.bookflow.model.enums;

import lombok.Getter;

@Getter
public enum JwtClaimEnum {

    ISSUER("book-flow"),
    EMAIL("email");

    private final String value;

    private JwtClaimEnum(String value) {
        this.value = value;
    }
}
