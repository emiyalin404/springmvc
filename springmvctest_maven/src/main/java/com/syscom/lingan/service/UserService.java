package com.syscom.lingan.service;

import com.syscom.lingan.To.UserTo;
import com.syscom.lingan.entity.User;

import java.util.List;

public interface UserService {
    //新增一個user
    int addUser(User user);
    //查詢所有user
    List<User>queryAllUser();

    List<UserTo>queryAllUserAndRole();
}
