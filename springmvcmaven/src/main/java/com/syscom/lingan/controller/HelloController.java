package com.syscom.lingan.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.syscom.lingan.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
//    方法一
//    @RequestMapping("hello")
//    public ModelAndView hello(User user){
//        System.out.println("原來是"+user.toString());
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("hello");
//        modelAndView.addObject("msg",user);
//        return  modelAndView;
//    }


    //    方法二-------常用
//    @RequestMapping("hello")
//    public String hello(User user, Model module){
//        System.out.println("原來是"+user.toString());
//
//        module.addAttribute(user);
//        return "hello";
//    }

    //    方法三---- 一般不會使用
//    @RequestMapping("hello")
//    public String hello(User user, ModelMap map){
//        System.out.println("原來是"+user.toString());
//
//        map.addAttribute(user);
//        return "hello";
//    }

//post請求
//       @PostMapping ("hello")
//    public String hello(User user, ModelMap map){
//        System.out.println("原來是"+user.toString());
//
//        map.addAttribute(user);
//        return "hello";
//    }

    //ResponseBody-----如果是要傳入JSON資料就會使用到
//    @ResponseBody
//    @RequestMapping (value = "hello", produces = "application/json;charset=utf-8") //<--轉中文 (一般不會這樣做)
//    public String hello() throws JsonProcessingException {
//    ObjectMapper mapper =new ObjectMapper();
//    User user=new User(1,"笑死",21,"男");
//
//    String str=mapper.writeValueAsString(user);
//    return str;
//    }

    @ResponseBody
    @RequestMapping ("hello")
    public String hello() throws JsonProcessingException {
        ObjectMapper mapper =new ObjectMapper();
        User user=new User(1,"笑死",21,"男");

        String str=mapper.writeValueAsString(user);
        return str;
    }
}
