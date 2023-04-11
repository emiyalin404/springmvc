package com.syscom.lingan.dao;

import com.syscom.lingan.To.ProductTo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    List<ProductTo> queryAllProductAndBase_param();
}
