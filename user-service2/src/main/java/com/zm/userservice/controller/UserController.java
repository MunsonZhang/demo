package com.zm.userservice.controller;

import com.zm.userservice.po.User;
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
    public String getUser(@PathVariable int id){
        System.out.println("在service2里");
        User user = userService.getUserById(id);
        return user.toString();
    }

    @GetMapping("/query2")
    public String getUser2(){
        System.out.println("在service2里");
        User user = userService.getUserById(43422);
        return user.toString();
    }

    @GetMapping("/query3")
    public String getUser3(){
        System.out.println("在service2里");
        User user = userService.getUserById(43425);
        return user.toString();
    }
}
