package com.bookflow.libraryservice.rest;

import com.bookflow.model.Book;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path("/library")
@Tag(name = "Library Rest VÉGPONTOK !!!!!!!!")
public interface ILibraryRest {

    @GET
    @Produces({MediaType.TEXT_PLAIN})
    Book getByIsbn();
}
