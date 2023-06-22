package com.bookflow.libraryservice.action;

import com.bookflow.libraryservice.service.LibraryService;
import com.bookflow.model.Book;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

/**
 * @since 0.0.1-SNAPSHOT
 * @author mezeim
 */
@Dependent
public class LibraryAction {

    @Inject
    LibraryService libraryService;

    public Book getBookByISBN(String isbn) {
        Book byAuthor = libraryService.findByAuthor("mm");
        return libraryService.findByISBN(isbn);
    }
}
