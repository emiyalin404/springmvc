package com.syscom.lingan.dao;

import com.syscom.lingan.entity.Sys_user;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Sys_userMapper {
    int addSys_user(Sys_user sys_user);
    int updateSys_user(Sys_user sys_user);
    int deleteSys_user(Sys_user sys_user);
    List<Sys_user> queryAllSys_user();
    //查詢所有的User信息，以及對應的Role信息
    List<Sys_user> searchSys_user(Sys_user sys_user);

}
