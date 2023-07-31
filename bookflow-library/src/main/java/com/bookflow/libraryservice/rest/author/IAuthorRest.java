package com.bookflow.libraryservice.rest.author;

import com.bookflow.dto.QueryRequest;
import com.bookflow.path.LibraryPath;
import com.bookflow.model.library.Author;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

/**
 * Rest interface for {@link Author}.
 *
 * @author mezeim
 * @since 0.0.1-SNAPSHOT
 */
@Path(LibraryPath.AUTHOR_REST_BASE_PATH)
public interface IAuthorRest {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    List<Author> postAuthorsQuery(QueryRequest request);

}
