package com.syscom.lingan.dao;

import com.syscom.lingan.To.Base_paramTo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Base_paramMapper {

    //查詢指定信息
    Base_paramTo queryBase_paramAndProduct(@Param("TAGparam") String TAX);
}
