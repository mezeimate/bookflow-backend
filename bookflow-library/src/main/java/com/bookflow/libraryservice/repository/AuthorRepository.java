package com.bookflow.libraryservice.repository;

import com.bookflow.model.library.Author;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

/**
 * Repository for {@link Author}.
 *
 * @author mezeim
 * @since 0.0.1-SNAPSHOT
 */
@ApplicationScoped
public class AuthorRepository implements PanacheRepositoryBase<Author, String> {

    public Author findById(String authorId) {
        return find("id", authorId).firstResult();
    }

    public List<Author> findAllAuthor(int index, int size) {
        return findAll().page(index, size).list();
    }
}
