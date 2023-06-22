package com.bookflow.libraryservice.rest;

import com.bookflow.libraryservice.action.LibraryAction;
import com.bookflow.model.Book;
import jakarta.enterprise.inject.Model;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * @since 0.0.1-SNAPSHOT
 * @author mezeim
 */
@Model
public class LibraryRest implements ILibraryRest {

    @Inject
    LibraryAction libraryAction;

    @Override
    public Book getByIsbn() {
        return libraryAction.getBookByISBN("1a");
    }
}
