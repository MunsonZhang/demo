package com.zm.productservice.rpcService;

import com.zm.productservice.dto.User;
import com.zm.productservice.rpcService.impl.UserServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;

@FeignClient(name="userservice")
public interface UserService {

    @GetMapping(value="/user/query/{id}")
    public Optional getUser(@PathVariable int id);

    @GetMapping(value="/user/query2")
    public Optional getUser2();

    @GetMapping(value="/user/query3")
    public Optional getUser3();
}
