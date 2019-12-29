package com.zm.userservice.service;

import com.zm.userservice.po.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void insertUser(User user);

    void deleteUser(int id);

    void updateUser(User user);

    List<User> getUsers();

    Optional<User> getUserById(int id);
}
