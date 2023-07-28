package com.bookflow.model.library;

import com.bookflow.model.AbstractEntity;
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
