package com.bookflow.libraryservice.service;

import com.bookflow.libraryservice.repository.ILibraryRepository;
import com.bookflow.model.Book;
import jakarta.enterprise.inject.Model;
import jakarta.inject.Inject;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {

    @Inject
    ILibraryRepository libraryRepository;

    public Book findByISBN(String isbn) {
        return libraryRepository.findByISBN(isbn);
    }
}
