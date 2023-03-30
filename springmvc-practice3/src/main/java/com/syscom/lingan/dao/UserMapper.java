package com.syscom.lingan.dao;

import com.syscom.lingan.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    //查詢所有的User
    List<User> queryAllUser();


}
