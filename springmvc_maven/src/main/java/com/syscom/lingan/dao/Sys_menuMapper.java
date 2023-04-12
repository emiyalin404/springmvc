package com.syscom.lingan.dao;

import com.syscom.lingan.entity.Sys_menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface Sys_menuMapper {
    List<Sys_menu>queryallmenu();
}
