package com.bokflow.userservice.config;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class ConfigurationService {

    @ConfigProperty(name = "mp.jwt.verify.issuer")
    String IWT_ISSUER;

    public String getJwtIssuer() {
        return this.IWT_ISSUER;
    }
}
