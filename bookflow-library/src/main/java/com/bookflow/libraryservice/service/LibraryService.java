package com.bookflow.libraryservice.service;

import com.bookflow.libraryservice.repository.ILibraryRepository;
import com.bookflow.model.Book;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class LibraryService {

    @Inject
    ILibraryRepository libraryRepository;

    public Book findByISBN(String isbn) {
        return libraryRepository.findByISBN(isbn);
    }
}
