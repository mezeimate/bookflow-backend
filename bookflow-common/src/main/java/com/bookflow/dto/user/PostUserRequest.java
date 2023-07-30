package com.bookflow.dto.user;

import jakarta.enterprise.inject.Vetoed;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Vetoed
@Data
public class PostUserRequest {

    @NotNull
    @NotEmpty
    @Size(max = 50)
    @Column(name = "USERNAME")
    private String username;

    @NotNull
    @NotEmpty
    @Size(max = 100)
    @Column(name = "EMAIL")
    private String email;

    @NotNull
    @NotEmpty
    @Size(max = 60)
    @Column(name = "PASSWORD")
    private String password;

}
