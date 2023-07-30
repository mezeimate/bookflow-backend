package com.bookflow.dto.user;

import com.bookflow.model.enums.Role;
import jakarta.enterprise.inject.Vetoed;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Vetoed
@Data
public class GetCurrentUserResponse {

    @NotNull
    @NotEmpty
    @Size(max = 50)
    private String username;

    @NotNull
    @NotEmpty
    @Size(max = 100)
    private String email;

    @NotNull
    private Role role;
}
