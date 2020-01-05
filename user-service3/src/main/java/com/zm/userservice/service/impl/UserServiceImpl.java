package com.zm.userservice.service.impl;

import com.zm.userservice.mapper.UserMapper;
import com.zm.userservice.po.User;
import com.zm.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public void insertUser(User user) {
        userMapper.save(user);
    }

    @Override
    public void deleteUser(int id) {
        userMapper.deleteById(id);
    }

    @Override
    public void updateUser(User user) {
        userMapper.save(user);
    }

    @Override
    public List<User> getUsers() {
        return (List<User>) userMapper.findAll();
    }

    @Override
    public User getUserById(int id) {
        User user;
        Optional<User> opt = userMapper.findById(id);
        if(opt.isPresent()){
            user = opt.get();
        }else{
            user = new User();
        }
        return user;
    }
}
