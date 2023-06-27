package com.bookflow.libraryservice.rest;

import com.bookflow.dto.PostBookRequest;
import com.bookflow.libraryservice.common.LibraryPath;
import com.bookflow.model.Book;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

/**
 * Rest interface for {@link Book}.
 *
 * @author mezeim
 * @since 0.0.1-SNAPSHOT
 */
@Path(LibraryPath.BOOK_REST_BASE_PATH)
public interface IBookRest {

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path(LibraryPath.ID)
    Book getBook(@QueryParam(LibraryPath.ID) String isbn);

    @POST
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    Book postBook(PostBookRequest postBookRequest);
}
