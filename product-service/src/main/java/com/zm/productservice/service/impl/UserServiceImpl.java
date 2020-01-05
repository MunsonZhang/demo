package com.zm.productservice.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zm.productservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@EnableHystrix
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getUserFallBack")
    @Override
    public String getUser(int id) {
//        String msg = restTemplate.getForObject("http://userservice/user/query3",String.class);
        String msg = restTemplate.getForObject("http://userservice/user/query/{id}",String.class,new Object[]{id});
        return msg;
    }

    public String getUserFallBack(int id){
        return "请稍后片刻";
    }
}
