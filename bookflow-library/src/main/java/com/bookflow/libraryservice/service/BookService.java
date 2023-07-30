package com.bookflow.libraryservice.service;

import com.bookflow.libraryservice.repository.BookRepository;
import com.bookflow.model.library.Book;
import com.bookflow.validator.RepositoryValidateService;
import jakarta.enterprise.inject.Model;
import jakarta.inject.Inject;

/**
 * @since 0.0.1-SNAPSHOT
 * @author mezeim
 */
@Model
public class BookService extends RepositoryValidateService {

    @Inject
    BookRepository libraryRepository;

    public Book findByISBN(String isbn) {
        return validate(libraryRepository::findById, isbn);
    }

    public void persistAndFlush(Book book) {
        validateVoid(libraryRepository::persistAndFlush, book);
    }
}
