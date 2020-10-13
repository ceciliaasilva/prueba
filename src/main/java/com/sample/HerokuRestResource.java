package com.sample;

import com.sample.pojo.Person;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api")
public class HerokuRestResource {

    @GET
    @Path("/hello")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getHelloWorld() {
        Person person = new Person("Faraz", "Khan", "He's a herb. YER");
        return person;
    }
}
