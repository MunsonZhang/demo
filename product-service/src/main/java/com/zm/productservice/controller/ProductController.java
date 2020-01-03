package com.zm.productservice.controller;

import com.zm.productservice.rpcService.RpcUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RequestMapping("/product")
@RestController
public class ProductController {

    @Autowired
    RpcUserService userService;

    @GetMapping("/user/{id}")
    public Optional getUser(@PathVariable int id){
        Optional opt = userService.getUser(id);
        return opt;
    }

}
