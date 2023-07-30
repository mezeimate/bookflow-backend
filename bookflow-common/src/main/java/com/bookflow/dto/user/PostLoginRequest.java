package com.bookflow.dto.user;

import jakarta.enterprise.inject.Vetoed;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Vetoed
@Data
public class PostLoginRequest {

    @NotNull
    @NotEmpty
    @Size(max = 50)
    private String username;

    @NotNull
    @NotEmpty
    @Size(max = 60)
    private String password;
}
