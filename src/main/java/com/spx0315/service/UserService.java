package com.spx0315.service;

import com.spx0315.pojo.User;

import java.util.List;

public interface UserService {
    int addUser(User user);

    int delUserById(int id);

    int updateUser(User user);

    User queryById(int id);

    List<User> queryAllUser();

}
