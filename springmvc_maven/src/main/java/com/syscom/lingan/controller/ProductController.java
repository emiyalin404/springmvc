package com.syscom.lingan.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.syscom.lingan.To.ProductTo;
import com.syscom.lingan.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("queryAllProductAndBase_param")
    public List<ProductTo> queryAllProductAndBase_param(){

        System.out.println(productService.queryAllProductAndBase_param()+"000000");
        return productService.queryAllProductAndBase_param();
    }
}
