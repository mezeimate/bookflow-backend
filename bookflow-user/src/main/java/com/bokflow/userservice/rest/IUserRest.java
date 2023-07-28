package com.bokflow.userservice.rest;

import com.bokflow.userservice.common.UserPath;
import com.bookflow.dto.PostUserRequest;
import com.bookflow.model.user.User;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 * Rest interface for User
 *
 * @author mezeim
 * @since 0.0.1-SNAPSHOT
 */
@Path(UserPath.USER_REST_BASE_PATH)
public interface IUserRest {

    @POST
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    User postRegistrationUser(@Valid PostUserRequest request);
}
