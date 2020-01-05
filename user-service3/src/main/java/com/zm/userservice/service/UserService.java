package com.zm.userservice.service;

import com.zm.userservice.po.User;

import java.util.List;

public interface UserService {

    void insertUser(User user);

    void deleteUser(int id);

    void updateUser(User user);

    List<User> getUsers();

    User getUserById(int id);
}
