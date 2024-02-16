package com.restAPI.restAPI.api.controller;

import com.restAPI.restAPI.api.model.User;
import com.restAPI.restAPI.service.UserService;
import com.restAPI.restAPI.wrapper.UserIdRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping(path="/hello")
    public String hello() {
        return "Hello from spring boot";
    }

    @PostMapping(path="/getUser")
    public User getUser(@RequestBody UserIdRequest request) {
        // Extract the id from the request object
        Integer id = request.getId();

        // Call your userService to get the user based on the extracted id
        return userService.getUser(id).orElse(null);
    }
}
