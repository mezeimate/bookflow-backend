package com.bookflow.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.OffsetDateTime;

@Entity
@Table(name = "BOOK")
@Data
public class Book {

    @Id
    @NotNull
    @Size(max = 13)
    private String isbn;

    @NotNull
    @Size(max = 255)
    @Column(name = "TITLE")
    private String title;

    @NotNull
    @Size(max = 100)
    @Column(name = "AUTHOR")
    private String author;

    @Column(name = "PUBLICATION_YEAR")
    private OffsetDateTime publicationYear;

    @Column(name = "LOANABLE_PIECE")
    private int loanablePiece;

    @Column(name = "BORROWED_PIECE")
    private int borrowedPiece;

}
