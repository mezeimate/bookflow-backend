package com.bookflow.model.user;

import com.bookflow.model.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "USER")
@Data
@EqualsAndHashCode(callSuper = true)
public class User extends AbstractEntity {

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
