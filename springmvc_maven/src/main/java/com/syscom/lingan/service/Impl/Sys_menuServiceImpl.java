package com.syscom.lingan.service.Impl;

import com.syscom.lingan.dao.Sys_menuMapper;
import com.syscom.lingan.entity.Sys_menu;
import com.syscom.lingan.service.Sys_menuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class Sys_menuServiceImpl implements Sys_menuService {
    @Autowired
    private Sys_menuMapper sys_menuMapper;

    public List<Sys_menu>queryallmenu(){
        return sys_menuMapper.queryallmenu();
    }
}
