package com.bookflow.libraryservice.repository;

import com.bookflow.model.Book;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

/**
 * Repository for {@link Book}.
 *
 * @since 0.0.1-SNAPSHOT
 * @author mezeim
 */
@ApplicationScoped
public class IBookRepository implements PanacheRepositoryBase<Book, String> {

    public Book findByAuthor(String author) {
        return find("author", author).firstResult();
    }
}
