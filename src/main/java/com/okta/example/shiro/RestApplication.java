package com.okta.example.shiro;

import org.apache.shiro.web.jaxrs.ShiroFeature;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/")
public class RestApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {

        Set<Class<?>> classes = new HashSet<>();

        // register Shiro
        classes.add(ShiroFeature.class);

        // register resources
        classes.add(SecureResource.class);

        return classes;
    }
}