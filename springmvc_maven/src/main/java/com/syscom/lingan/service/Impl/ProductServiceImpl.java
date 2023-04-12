package com.syscom.lingan.service.Impl;

import com.syscom.lingan.To.ProductTo;
import com.syscom.lingan.dao.ProductMapper;
import com.syscom.lingan.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
@Autowired
    private ProductMapper productMapper;

    public List<ProductTo> queryAllProductAndBase_param(){
    return productMapper.queryAllProductAndBase_param();
    }
}
