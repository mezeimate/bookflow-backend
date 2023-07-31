package com.bokflow.userservice.rest;

import com.bookflow.dto.user.GetCurrentUserResponse;
import com.bookflow.dto.user.PostLoginRequest;
import com.bookflow.dto.user.PostUserLoginResponse;
import com.bookflow.dto.user.PostUserRequest;
import com.bookflow.model.user.User;
import com.bookflow.path.UserPath;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

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
    @Path(UserPath.POST_REGISTER)
    User postRegistrationUser(@Valid PostUserRequest request);

    @POST
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    @Path(UserPath.POST_LOGIN)
    PostUserLoginResponse postLoginUser(@Valid PostLoginRequest request);

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    GetCurrentUserResponse getCurrentUser();

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    Response logout();
}
