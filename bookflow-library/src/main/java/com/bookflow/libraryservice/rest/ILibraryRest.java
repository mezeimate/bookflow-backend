package com.bookflow.libraryservice.rest;

import com.bookflow.model.Book;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 * Rest interface for {@link Book}.
 *
 * @author mezeim
 * @since 0.0.1-SNAPSHOT
 */
@Path("/library")
public interface ILibraryRest {

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    Book getByIsbn();
}
