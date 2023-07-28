package com.bookflow.libraryservice.service;

import com.bookflow.libraryservice.repository.BookRepository;
import com.bookflow.model.library.Book;
import jakarta.enterprise.inject.Model;
import jakarta.inject.Inject;

/**
 * @since 0.0.1-SNAPSHOT
 * @author mezeim
 */
@Model
public class BookService {

    @Inject
    BookRepository libraryRepository;

    public Book findByISBN(String isbn) {
        return libraryRepository.findById(isbn);
    }

    public void persistAndFlush(Book book) {
        libraryRepository.persistAndFlush(book);
    }
}
