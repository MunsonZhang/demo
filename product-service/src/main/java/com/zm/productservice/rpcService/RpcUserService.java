package com.zm.productservice.rpcService;

import com.zm.productservice.rpcService.impl.RpcUserServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;

@FeignClient(name="userservice",fallback = RpcUserServiceImpl.class)
public interface RpcUserService {

    @RequestMapping(value="/user/query/{id}",method = RequestMethod.GET)
    public Optional getUser(@PathVariable int id);

    @GetMapping(value="/user/query2")
    public Optional getUser2();

    @GetMapping(value="/user/query3")
    public Optional getUser3();
}
