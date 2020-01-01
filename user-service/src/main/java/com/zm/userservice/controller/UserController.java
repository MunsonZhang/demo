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
    public Optional getUser(@PathVariable int id){
        System.out.println(id);
        Optional user = userService.getUserById(id);
        return user;
    }

    @GetMapping("/query2")
    public Optional getUser2(){
        System.out.println(43422);
        Optional user = userService.getUserById(43422);
        return user;
    }

    @GetMapping("/query3")
    public Optional getUser3(){
        System.out.println(43425);
        Optional user = userService.getUserById(43425);
        return user;
    }
}
