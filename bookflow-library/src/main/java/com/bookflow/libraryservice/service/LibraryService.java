package com.bookflow.libraryservice.service;

import com.bookflow.libraryservice.repository.ILibraryRepository;
import com.bookflow.model.Book;
import jakarta.enterprise.inject.Model;
import jakarta.inject.Inject;

/**
 * @since 0.0.1-SNAPSHOT
 * @author mezeim
 */
@Model
public class LibraryService {

    @Inject
    ILibraryRepository libraryRepository;

    public Book findByISBN(String isbn) {
        return libraryRepository.findById(isbn);
    }

    public Book findByAuthor(String author) {
        return libraryRepository.findByAuthor(author);
    }
}
