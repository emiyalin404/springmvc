package com.syscom.lingan.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.syscom.lingan.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

//    @RequestMapping ("hello")
//    public String hello() throws JsonProcessingException {
//        ObjectMapper mapper =new ObjectMapper();
//        User user=new User(1,"笑死",21,"男");
//
//        String str=mapper.writeValueAsString(user);
//        return str;
//    }
}
