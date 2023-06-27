package com.bookflow.libraryservice.service;

import com.bookflow.libraryservice.repository.IAuthorRepository;
import com.bookflow.libraryservice.repository.IBookRepository;
import com.bookflow.model.Author;
import com.bookflow.model.Book;
import jakarta.enterprise.inject.Model;
import jakarta.inject.Inject;

/**
 * @since 0.0.1-SNAPSHOT
 * @author mezeim
 */
@Model
public class AuthorService {

    @Inject
    IAuthorRepository authorRepository;

    public void persist(Author author) {
        authorRepository.persistAndFlush(author);
    }

}
