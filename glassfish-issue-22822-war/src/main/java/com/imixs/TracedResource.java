package com.imixs;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
 

/**
 * This class will be scanned correctly by microprofile OpenAPI in Glassfish/Payara
 * 
 * @author rsoika
 *
 */
@Path("/hello-war")
public class TracedResource {
 
    @GET
    public String helloWorld() {
        return "Hello World from app!";
    }
}