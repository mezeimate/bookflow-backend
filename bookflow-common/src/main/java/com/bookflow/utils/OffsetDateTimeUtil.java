package com.bookflow.utils;

import jakarta.enterprise.inject.Vetoed;

import java.time.Instant;
import java.time.OffsetDateTime;

@Vetoed
public class OffsetDateTimeUtil {

    public static OffsetDateTime convertInstantToOffSetDateTime(Instant instant) {
        return OffsetDateTime.ofInstant(instant, OffsetDateTime.now().getOffset());
    }
}
