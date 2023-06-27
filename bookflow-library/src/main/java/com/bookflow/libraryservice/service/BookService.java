package com.bookflow.libraryservice.service;

import com.bookflow.libraryservice.repository.IBookRepository;
import com.bookflow.model.Book;
import jakarta.enterprise.inject.Model;
import jakarta.inject.Inject;

/**
 * @since 0.0.1-SNAPSHOT
 * @author mezeim
 */
@Model
public class BookService {

    @Inject
    IBookRepository libraryRepository;

    public Book findByISBN(String isbn) {
        return libraryRepository.findById(isbn);
    }

    public Book findByAuthor(String author) {
        return libraryRepository.findByAuthor(author);
    }

    public void persist(Book book) {
        libraryRepository.persist(book);
    }
}
