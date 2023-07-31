package com.bookflow.model.enums;

import lombok.Getter;

@Getter
public enum JwtClaimEnum {

    ISSUER("book-flow"),
    EMAIL("email");

    private final String value;

    JwtClaimEnum(String value) {
        this.value = value;
    }
}
