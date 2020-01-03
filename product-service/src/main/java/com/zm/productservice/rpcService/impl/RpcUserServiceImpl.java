package com.zm.productservice.rpcService.impl;

import com.zm.productservice.rpcService.RpcUserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Component
public class RpcUserServiceImpl implements RpcUserService {
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
