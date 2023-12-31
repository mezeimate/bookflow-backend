package com.bookflow.model;

import io.smallrye.common.constraint.NotNull;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Entity
@Table(name = "AUTHOR")
@Data
@EqualsAndHashCode(callSuper = true)
public class Author extends AbstractEntity {

    @NotNull
    @Size(max = 100)
    @Column(name = "NAME")
    private String name;
}
