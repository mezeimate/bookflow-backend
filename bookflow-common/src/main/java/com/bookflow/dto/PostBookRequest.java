package com.bookflow.dto;

import jakarta.enterprise.inject.Vetoed;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Vetoed
@Data
public class PostBookRequest {

    @NotNull
    @Size(max = 13)
    private String isbn;

    @NotNull
    @Size(max = 255)
    private String title;

    @Size(max = 40)
    private String authorId;

    @NotNull
    private int publicationYear;

    @NotNull
    private int loanablePiece;

    @NotNull
    private int borrowedPiece;

}
