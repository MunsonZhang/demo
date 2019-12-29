package com.zm.userservice.controller;

import com.zm.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/query/{id}")
    public Optional getUser(@PathVariable String id){
        System.out.println(id);
        Optional user = userService.getUserById(Integer.parseInt(id));
        return user;
    }
}
