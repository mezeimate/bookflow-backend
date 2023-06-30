package com.bookflow.libraryservice.rest.author;

import com.bookflow.dto.QueryRequest;
import com.bookflow.libraryservice.action.AuthorAction;
import com.bookflow.model.Author;
import jakarta.enterprise.inject.Model;
import jakarta.inject.Inject;

import java.util.List;

/**
 * @since 0.0.1-SNAPSHOT
 * @author mezeim
 */
@Model
public class AuthorRest implements IAuthorRest {

    @Inject
    AuthorAction authorAction;

    @Override
    public List<Author> postAuthorsQuery(QueryRequest request) {
        return authorAction.postAuthorsQuery(request);
    }
}
