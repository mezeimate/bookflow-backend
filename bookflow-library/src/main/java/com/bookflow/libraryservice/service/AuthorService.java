package com.bookflow.libraryservice.service;

import com.bookflow.libraryservice.repository.IAuthorRepository;
import com.bookflow.model.Author;
import jakarta.enterprise.inject.Model;
import jakarta.inject.Inject;

import java.util.List;

/**
 * @author mezeim
 * @since 0.0.1-SNAPSHOT
 */
@Model
public class AuthorService {

    @Inject
    IAuthorRepository authorRepository;

    public Author findById(String authorId) {
        return authorRepository.findById(authorId);
    }

    public List<Author> findAllAuthor(int index, int size) {
        return authorRepository.findAllAuthor(index, size);
    }

}
