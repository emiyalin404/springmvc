package com.syscom.lingan.controller;

import com.syscom.lingan.To.MenuInfoTo;
import com.syscom.lingan.service.MenuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MenuInfoController {
    @Autowired
    private MenuInfoService menuInfoService;

    @RequestMapping("QuerymenuInfo")
    public List<MenuInfoTo>QuerymenuInfo(){
        return menuInfoService.QuerymenuInfo();
    }
}
