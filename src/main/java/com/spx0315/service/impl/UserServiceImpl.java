package com.spx0315.service.impl;

import com.spx0315.dao.UserDao;
import com.spx0315.pojo.User;
import com.spx0315.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("User")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public int delUserById(int id) {
        return userDao.delUserById(id);
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public User queryById(int id) {
        return userDao.queryById(id);
    }

    @Override
    public List<User> queryAllUser() {
        return userDao.queryAllUser();
    }

}
