package com.zm.userservice.controller;

import com.zm.userservice.dto.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/query")
    public String getUser(User user){
        System.out.println(user);
        return user.getName();
    }
}
