package com.jaisoft.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

public class ConfigClientController {

    @Value("\${user.role}")
    private final String role = null;

    @Value("\${user.password}")
    private final String password = null;

    @GetMapping(value = "/role/{username}",produces = [MediaType.TEXT_PLAIN_VALUE])
     String getRole(@PathVariable("username") final String username ){
        return String.format("Hello  " + username + "  your password is  =  " + password + ", your role is = " + role)
    }
    
}
