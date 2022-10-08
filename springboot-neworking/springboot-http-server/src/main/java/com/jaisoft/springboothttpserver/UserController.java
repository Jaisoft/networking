package com.jaisoft.springboothttpserver;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/")
public class UserController {


    @GetMapping(value = "/users")
    public ResponseEntity<User> list() {
        User user = new User();
        user.setName("Jaime");
        
        return new ResponseEntity(user, HttpStatus.OK);
    }

    
}
