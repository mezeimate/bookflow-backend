package com.bookflow.libraryservice.action;

import com.bookflow.dto.QueryRequest;
import com.bookflow.libraryservice.service.AuthorService;
import com.bookflow.model.library.Author;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

import java.util.List;

/**
 * @since 0.0.1-SNAPSHOT
 * @author mezeim
 */
@Dependent
public class AuthorAction {

    @Inject
    AuthorService authorService;

    public List<Author> postAuthorsQuery(QueryRequest request) {
        return authorService.findAllAuthor(request.getPageIndex(), request.getPageSize());
    }
}
