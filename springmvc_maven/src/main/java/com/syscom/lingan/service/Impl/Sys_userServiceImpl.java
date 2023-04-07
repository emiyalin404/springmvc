package com.syscom.lingan.service.Impl;

import com.syscom.lingan.dao.Sys_userMapper;

import com.syscom.lingan.entity.Sys_user;
import com.syscom.lingan.service.Sys_userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Sys_userServiceImpl implements Sys_userService {
    @Autowired
    private Sys_userMapper sys_userMapperuser;


    @Override
    public int addSys_user(Sys_user sys_user) {
        return sys_userMapperuser.addSys_user(sys_user);
    }

    @Override
    public int deleteSys_user(Sys_user sys_user) {
        return sys_userMapperuser.deleteSys_user(sys_user);
    }

    @Override
    public int updateSys_user(Sys_user sys_user) {
        return sys_userMapperuser.updateSys_user(sys_user);
    }

    @Override
    public List<Sys_user> queryAllSys_user() {
        return sys_userMapperuser.queryAllSys_user();
    }


    @Override
    public List<Sys_user> searchSys_user(Sys_user sys_user) {
        return sys_userMapperuser.searchSys_user(sys_user);
    }


}
