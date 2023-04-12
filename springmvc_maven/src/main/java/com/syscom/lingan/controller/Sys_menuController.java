package com.syscom.lingan.controller;

import com.syscom.lingan.entity.Sys_menu;
import com.syscom.lingan.service.Sys_menuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Sys_menuController {
    @Autowired
    private Sys_menuService sys_menuService;
    @RequestMapping("queryallmenu")
    public List<Sys_menu>queryallmenu(){
        return sys_menuService.queryallmenu();
    }
}
