package com.bokflow.userservice.jwt;

import com.bokflow.userservice.config.ConfigurationService;
import com.bokflow.userservice.data.TokenData;
import com.bookflow.model.enums.JwtClaimEnum;
import com.bookflow.model.user.User;
import io.smallrye.jwt.build.Jwt;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.time.Instant;

@ApplicationScoped
public class JwtService {

    @Inject
    ConfigurationService configurationService;

    public TokenData generateToken(User user) {
        Instant expireDate = Instant.now().plusSeconds(3600);

        String token = Jwt.issuer(configurationService.getJwtIssuer())
                .preferredUserName(user.getUsername())
                .claim(JwtClaimEnum.EMAIL.getValue(), user.getEmail())
                .groups(user.getRole().name()) // TODO
                .expiresAt(expireDate) //1hour
                .sign(JwtService.class.getClassLoader().getResource("private-key.pem").getPath());

        return new TokenData(token, expireDate);
    }

}