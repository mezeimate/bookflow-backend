package com.bookflow.libraryservice.action;

import com.bookflow.libraryservice.service.LibraryService;
import com.bookflow.model.Book;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class LibraryAction {

    @Inject
    LibraryService libraryService;

    public Book getBookByISBN(String isbn) {
        return libraryService.findByISBN(isbn);
    }
}
