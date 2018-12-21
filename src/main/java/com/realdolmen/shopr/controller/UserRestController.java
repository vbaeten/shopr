package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.UserService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.util.List;

import static javax.ws.rs.core.Response.Status.OK;

@Path("users")
public class UserRestController {
    @Inject
    private UserService userService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUsers() {
        List<User> users = userService.findAllUsers();

        return Response.status(OK).entity(users).build();
    }

    @GET
    @Path("{userId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUsers(@PathParam("userId") int userId) {
        User user = userService.findUserById(userId);

        return Response.status(OK).entity(user).build();
    }

    @GET
    @Path("find")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUsers(@QueryParam("name") String name) {
        User user = userService.findUserByName(name);

        return Response.status(OK).entity(user).build();
    }

    @PUT
    @Path("{locationId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateName(@PathParam("locationId") int id, @QueryParam("newName") String newName) {
        userService.updateName(id, newName);

        return Response.status(OK).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response insert(User user) {
        userService.insert(user);

        return Response.status(OK).build();
    }
}
