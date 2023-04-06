package com.syscom.lingan.service;

import com.syscom.lingan.To.RoleTo;
import org.apache.ibatis.annotations.Param;

public interface RoleService {

    //查詢指定的type角色信息，以及該角色下的用戶的基本信息
    RoleTo queryRoleAndUser(@Param("typeId") String type);
}
