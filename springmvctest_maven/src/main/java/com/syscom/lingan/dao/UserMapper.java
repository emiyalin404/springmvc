package com.syscom.lingan.dao;

import com.syscom.lingan.To.UserTo;
import com.syscom.lingan.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int addUser(User user);
    //接口 查詢所有的user
    List<User> queryAllUser();
    //查詢所有的User信息，以及對應的Role信息
    List<UserTo>queryAllUserAndRole();
}
