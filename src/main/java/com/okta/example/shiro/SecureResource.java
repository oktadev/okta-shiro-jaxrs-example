package com.okta.example.shiro;

import org.apache.shiro.authz.annotation.RequiresAuthentication;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.SecurityContext;

@Path("/")
@Produces({"application/json","plain/text"})
public class SecureResource {

    @GET
    @RequiresAuthentication
    public String showUser(@Context SecurityContext securityContext) {
        return "Current User: " + securityContext.getUserPrincipal().getName() + "  -  " + securityContext.isUserInRole("Everyone");
    }
}
