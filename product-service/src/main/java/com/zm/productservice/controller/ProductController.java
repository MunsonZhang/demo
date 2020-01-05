package com.zm.productservice.controller;

import com.zm.productservice.rpcService.RpcUserService;
import com.zm.productservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/product")
@RestController
public class ProductController {

//    @Autowired
//    RpcUserService userService;
//
//    @GetMapping("/user/{id}")
//    public String getUser(@PathVariable int id){
//        String msg = userService.getUser(id);
//        return msg;
//    }

    @Autowired
    UserService userService;

    @GetMapping("/user/{id}")
    public String getUser(@PathVariable int id){
        String msg = userService.getUser(id);
        return msg;
    }

}
