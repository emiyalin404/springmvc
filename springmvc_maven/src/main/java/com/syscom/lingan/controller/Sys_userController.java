package com.syscom.lingan.controller;

import com.syscom.lingan.entity.Sys_user;
import com.syscom.lingan.service.Sys_userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Sys_userController {
    @Autowired
    private Sys_userService sys_userService;

    @RequestMapping("addSys_user")
    public int addSys_user(@RequestBody Sys_user sys_user){
        System.out.println(sys_user);
        return sys_userService.addSys_user(sys_user);
    }

    @RequestMapping("updateSys_user")
    public int updateSys_user(@RequestBody Sys_user sys_user){
        return  sys_userService.updateSys_user(sys_user);
    }

    @RequestMapping("queryAllSys_user")
    public List<Sys_user> queryAllSys_user(){
        System.out.println(sys_userService.queryAllSys_user().get(10).getUserId()+"123123");
        return  sys_userService.queryAllSys_user();
    }

    @RequestMapping("searchSys_user")
    public List<Sys_user>searchSys_user(@RequestBody Sys_user sys_user){
        return  sys_userService.searchSys_user(sys_user);
    }

    @RequestMapping("deleteSys_user")
    public int deleteSys_user(@RequestBody Sys_user sys_user){
        return  sys_userService.deleteSys_user(sys_user);
    }

}
