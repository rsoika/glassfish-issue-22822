package com.imixs.lib;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
 

/**
 * This class will not be scanned by microprofile OpenAPI in Glassfish/Payara
 * 
 * @author rsoika
 *
 */
@Path("/hello-war")
public class InternalTracedResource {
 
    @GET
    public String helloWorld() {
        return "Hello World from app!";
    }
}