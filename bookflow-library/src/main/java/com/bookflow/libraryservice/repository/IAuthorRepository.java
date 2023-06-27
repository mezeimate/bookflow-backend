package com.bookflow.libraryservice.repository;

import com.bookflow.model.Author;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

/**
 * Repository for {@link Author}.
 *
 * @since 0.0.1-SNAPSHOT
 * @author mezeim
 */
@ApplicationScoped
public class IAuthorRepository implements PanacheRepository<Author> {
}
