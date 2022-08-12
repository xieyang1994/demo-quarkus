package com.example.controller;

import com.example.dao.UserBaseRepository;
import com.example.entity.UserEntity;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/test")
public class DemoController {

    @Inject
    UserBaseRepository userBaseRepository;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }


    @GET
    @Path("/get/{name}")
    public UserEntity select(@PathParam("name") String name) {
        return userBaseRepository.find("name", name).firstResult();
    }

    @Transactional
    @GET
    @Path("/delete/{name}")
    public String delete(@PathParam("name") String name) {
        userBaseRepository.delete("name", name);
        return "success";
    }

    @Transactional
    @GET
    @Path("/insert/{name}")
    public String insert(@PathParam("name") String name) {
        UserEntity user = new UserEntity();
        user.setName(name);
        userBaseRepository.persist(user);
        return "success";
    }

}