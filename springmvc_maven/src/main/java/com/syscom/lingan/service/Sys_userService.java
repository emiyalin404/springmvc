package com.syscom.lingan.service;

import com.syscom.lingan.entity.Sys_user;

import java.util.List;

public interface Sys_userService {
    //新增一個Sys_user
    int addSys_user(Sys_user sys_user);
    //刪除
    int deleteSys_user(Sys_user sys_user);
    //修改
    int updateSys_user(Sys_user sys_user);
    //查詢所有Sys_user
    List<Sys_user>queryAllSys_user();

    List<Sys_user>searchSys_user(Sys_user sys_user);

}
