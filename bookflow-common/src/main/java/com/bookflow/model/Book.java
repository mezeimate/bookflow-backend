package com.bookflow.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AUTHOR_ID")
    private Author author;

    @Column(name = "PUBLICATION_YEAR")
    private OffsetDateTime publicationYear;

    @Column(name = "LOANABLE_PIECE")
    private int loanablePiece;

    @Column(name = "BORROWED_PIECE")
    private int borrowedPiece;

}
