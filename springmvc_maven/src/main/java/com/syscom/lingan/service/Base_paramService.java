package com.syscom.lingan.service;

import com.syscom.lingan.To.Base_paramTo;

public interface Base_paramService {
    //查詢指定的角色信息，以及該稅別下的商品的基本信息
    Base_paramTo queryBase_paramAndProduct(String TAG);
}
