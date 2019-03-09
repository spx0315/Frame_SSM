package com.spx0315.dao;

import com.spx0315.pojo.User;

import java.util.List;

public interface UserDao {
    int addUser(User user);

    int delUserById(int id);

    int updateUser(User user);

    User queryById(int id);

    List<User> queryAllUser();

}
