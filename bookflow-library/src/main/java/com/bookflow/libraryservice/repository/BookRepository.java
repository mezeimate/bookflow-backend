package com.bookflow.libraryservice.repository;

import com.bookflow.model.library.Book;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

/**
 * Repository for {@link Book}.
 *
 * @since 0.0.1-SNAPSHOT
 * @author mezeim
 */
@ApplicationScoped
public class BookRepository implements PanacheRepositoryBase<Book, String> {

}
