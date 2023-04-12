package com.syscom.lingan.controller;

import com.syscom.lingan.To.Base_paramTo;
import com.syscom.lingan.service.Base_paramService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Base_paramController {
    @Autowired
    private Base_paramService base_paramService;

    @RequestMapping("queryBase_paramAndProduct")
    public Base_paramTo queryBase_paramAndProduct(@RequestParam("tax") String tax){
        System.out.println(base_paramService.queryBase_paramAndProduct(tax));
        return base_paramService.queryBase_paramAndProduct(tax);
    }

}
