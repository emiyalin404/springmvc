package com.syscom.lingan.service.Impl;

import com.syscom.lingan.To.RoleTo;
import com.syscom.lingan.dao.RoleMapper;
import com.syscom.lingan.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    public RoleTo queryRoleAndUser(String type) {
        return roleMapper.queryRoleAndUser(type);
    }
}
