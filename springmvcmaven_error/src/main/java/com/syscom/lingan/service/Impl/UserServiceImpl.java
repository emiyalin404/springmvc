package com.syscom.lingan.service.Impl;

import com.syscom.lingan.To.UserTo;
import com.syscom.lingan.dao.UserMapper;
import com.syscom.lingan.entity.User;
import com.syscom.lingan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    public List<User> queryAllUser() {
        return userMapper.queryAllUser();
    }

    @Override
    public List<UserTo> queryAllUserAndRole() {
        return userMapper.queryAllUserAndRole();
    }
}
