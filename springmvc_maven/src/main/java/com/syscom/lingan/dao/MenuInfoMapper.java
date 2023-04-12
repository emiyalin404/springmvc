package com.syscom.lingan.dao;

import com.syscom.lingan.To.MenuInfoTo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuInfoMapper {
    List<MenuInfoTo> QuerymenuInfo();
}