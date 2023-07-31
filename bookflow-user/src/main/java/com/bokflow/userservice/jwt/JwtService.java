package com.bokflow.userservice.jwt;

import com.bokflow.userservice.data.TokenData;
import com.bookflow.model.enums.JwtClaimEnum;
import com.bookflow.model.user.User;
import io.smallrye.jwt.build.Jwt;
import jakarta.enterprise.context.ApplicationScoped;

import java.time.Instant;

@ApplicationScoped
public class JwtService {

    public TokenData generateToken(User user) {
        Instant expireDate = Instant.now().plusSeconds(3600);

        String token = Jwt.issuer(JwtClaimEnum.ISSUER.getValue())
                .preferredUserName(user.getUsername())
                .claim(JwtClaimEnum.EMAIL.getValue(), user.getEmail())
                .groups(user.getRole().name()) // TODO
                .expiresAt(expireDate) //1hour
                .sign(JwtService.class.getClassLoader().getResource("private-key.pem").getPath());

        return new TokenData(token, expireDate);
    }

}