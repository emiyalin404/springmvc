package com.syscom.lingan.dao;

import com.syscom.lingan.To.RoleTo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RoleMapper {

    //查詢指定type的角色信息，以及該角色下的用戶基本信息
    RoleTo qyeryRoleAndUser(@Param("typeId") String type);
}
