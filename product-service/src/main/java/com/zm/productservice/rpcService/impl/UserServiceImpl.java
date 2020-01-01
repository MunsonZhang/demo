package com.zm.productservice.rpcService.impl;

import com.zm.productservice.dto.User;
import com.zm.productservice.rpcService.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

//@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {
    @Override
    public Optional getUser(int id) {
        System.out.println("getUser");
        return Optional.empty();
    }

    @Override
    public Optional getUser2() {
        System.out.println("getUser2");
        return Optional.empty();
    }

    @Override
    public Optional getUser3() {
        System.out.println("getUser3");
        return Optional.empty();
    }
}
