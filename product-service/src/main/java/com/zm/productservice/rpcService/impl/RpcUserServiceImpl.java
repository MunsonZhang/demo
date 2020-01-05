package com.zm.productservice.rpcService.impl;

import com.zm.productservice.rpcService.RpcUserService;
import org.springframework.stereotype.Component;


@Component
public class RpcUserServiceImpl implements RpcUserService {
    @Override
    public String getUser(int id) {
        System.out.println("getUser");
        return "当前网络繁忙，请稍后再试";
    }

    @Override
    public String getUser2() {
        System.out.println("getUser2");
        return "当前网络繁忙，请稍后再试";
    }

    @Override
    public String getUser3() {
        System.out.println("getUser3");
        return "当前网络繁忙，请稍后再试";
    }
}
