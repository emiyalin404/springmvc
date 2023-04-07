package com.syscom.lingan.controller;

import com.syscom.lingan.To.UserTo;
import com.syscom.lingan.entity.User;
import com.syscom.lingan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("addUser")
    public int addUser(@RequestBody User user){
        return userService.addUser(user);
    }
    @RequestMapping("queryAllUser")
    public List<User> queryAllUser(){
        return  userService.queryAllUser();
    }

    @RequestMapping("queryAllUserAndRole")
    public List<UserTo>queryAllUserAndRole(){
    return userService.queryAllUserAndRole();
    }
}
