package com.zm.productservice.controller;

import com.zm.productservice.rpcService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RequestMapping("/product")
@RestController
public class ProductController {

    @Autowired
    UserService userService;

    @GetMapping("/user/{id}")
    public Optional getUser(@PathVariable int id){
        if(id == 43425) {
            return userService.getUser3();
        }else{
            return userService.getUser2();
        }
    }

}
