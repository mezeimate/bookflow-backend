package com.bookflow.libraryservice.rest;

import com.bookflow.dto.PostBookRequest;
import com.bookflow.libraryservice.action.BookAction;
import com.bookflow.model.Book;
import jakarta.enterprise.inject.Model;
import jakarta.inject.Inject;

/**
 * @since 0.0.1-SNAPSHOT
 * @author mezeim
 */
@Model
public class BookRest implements IBookRest {

    @Inject
    BookAction bookAction;

    @Override
    public Book getBook(String isbn) {
        return bookAction.getBook(isbn);
    }

    @Override
    public Book postBook(PostBookRequest postBookRequest) {
        return bookAction.postBook(postBookRequest);
    }
}
