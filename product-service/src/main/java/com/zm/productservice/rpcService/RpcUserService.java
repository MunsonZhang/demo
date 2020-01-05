package com.zm.productservice.rpcService;

import com.zm.productservice.rpcService.impl.RpcUserServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="userservice",fallback = RpcUserServiceImpl.class)
public interface RpcUserService {

    @RequestMapping(value="/user/query/{id}",method = RequestMethod.GET)
    public String getUser(@PathVariable int id);

    @GetMapping(value="/user/query2")
    public String getUser2();

    @GetMapping(value="/user/query3")
    public String getUser3();
}
