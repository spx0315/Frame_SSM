package com.spx0315.controller;

import com.spx0315.pojo.User;
import com.spx0315.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/allUser")
    public List<User> list(){
        List<User> list = userService.queryAllUser();
        return list;
    }
//
//    @RequestMapping("toAddUser")
//    public String toAddUser(){
//        return "addUser";
//    }
//
//    @RequestMapping("/addUser")
//    public String addUser(User user){
//        userService.addUser(user);
//        return "redict:/user/allUser";
//    }
//
//    @RequestMapping("/del/{userId}")
//    public String delUser(@PathVariable("userId") int id){
//        userService.delUserById(id);
//        return "redict:/user/allUser";
//    }
//    @RequestMapping("toUpdateUser")
//    public String toUpdateUser(Model model,int id){
//        model.addAllAttributes("user",userService.queryById(id));
//        return "updateUser";
//    }
//
//    @RequestMapping("/updateUser")
//    public String updateUser(Model model,User user){
//        userService.updateUser(user);
//        user=userService.queryById(user.getId());
//        model.addAllAttributes("user",user);
//        return "redict:/user/allUser"
//    }
}
