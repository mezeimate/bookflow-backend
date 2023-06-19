package com.bookflow.libraryservice.rest;

import com.bookflow.libraryservice.action.LibraryAction;
import com.bookflow.model.Book;
import jakarta.enterprise.inject.Model;
import jakarta.inject.Inject;

@Model
public class LibraryRest implements ILibraryRest {

    @Inject
    LibraryAction libraryAction;

    @Override
    public Book getByIsbn() {
        return libraryAction.getBookByISBN("1");
    }
}
