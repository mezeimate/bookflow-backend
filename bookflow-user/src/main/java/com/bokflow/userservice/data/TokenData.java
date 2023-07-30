package com.bokflow.userservice.data;

import jakarta.enterprise.inject.Vetoed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Vetoed
@NoArgsConstructor
@AllArgsConstructor
public class TokenData {

    private String token;

    private Instant expireDate;
}
