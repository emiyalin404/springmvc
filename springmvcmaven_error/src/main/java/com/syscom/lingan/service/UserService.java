package com.syscom.lingan.service;

import com.syscom.lingan.To.UserTo;
import com.syscom.lingan.entity.User;

import java.util.List;

public interface UserService {

    //新增一個user
    int addUser(User user);

    //查詢所有User
    List<User>queryAllUser();

    //查詢所有User信息，以及對應的Role信息
    List<UserTo>queryAllUserAndRole();
}
