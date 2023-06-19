package com.bookflow.libraryservice;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/library")
public class ExampleResource {
    
    @GET
    @Produces({MediaType.TEXT_PLAIN})
    public String hello() {
        return "library";
    }
}
