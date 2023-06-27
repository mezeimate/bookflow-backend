package com.bookflow.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Entity
@Table(name = "AUTHOR")
@Data
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    public String id;

    @NotNull
    @Size(max = 100)
    @Column(name = "NAME")
    private String name;
}
