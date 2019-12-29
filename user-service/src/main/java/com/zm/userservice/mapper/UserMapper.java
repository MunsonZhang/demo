package com.zm.userservice.mapper;

import com.zm.userservice.po.User;
import org.springframework.data.repository.CrudRepository;

public interface UserMapper extends CrudRepository<User,Integer> {
}
