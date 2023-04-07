package com.syscom.lingan.service.Impl;

import com.syscom.lingan.To.Base_paramTo;
import com.syscom.lingan.dao.Base_paramMapper;
import com.syscom.lingan.service.Base_paramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Base_paramServiceImpl implements Base_paramService {
    @Autowired
    private Base_paramMapper base_paramMapper;
    @Override
    public Base_paramTo queryBase_paramAndProduct(String TAG) {
        return base_paramMapper.queryBase_paramAndProduct(TAG);
    }
}
