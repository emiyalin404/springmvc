package com.syscom.lingan.controller;

import com.syscom.lingan.To.RoleTo;
import com.syscom.lingan.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {
    @Autowired
    private RoleService roleService;
    @RequestMapping("queryRoleAndUser")
    public RoleTo queryRoleAndUser(@RequestParam("type") String type){
        return roleService.queryRoleAndUser(type);
    }
}
