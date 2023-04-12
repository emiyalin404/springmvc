package com.syscom.lingan.service.Impl;

import com.syscom.lingan.To.MenuInfoTo;
import com.syscom.lingan.dao.MenuInfoMapper;
import com.syscom.lingan.service.MenuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuInfoImpl implements MenuInfoService {

    @Autowired
    private MenuInfoMapper menuInfoMapper;
    @Override
    public List<MenuInfoTo> QuerymenuInfo() {
        System.out.println("1111111222222");

        return menuInfoMapper.QuerymenuInfo();
    }
}
