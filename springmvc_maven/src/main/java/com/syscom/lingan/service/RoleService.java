package com.syscom.lingan.service;

import com.syscom.lingan.To.RoleTo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleService {
    //查詢指定type的角色信息，以及該角色下的用戶的基本信息
    RoleTo queryRoleAndUser(String type);
}
