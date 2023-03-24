package com.syscom.lingan.controller;

import com.syscom.lingan.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HelloController {
    //post請求
    @PostMapping ("register")
    public String hello(User user, ModelMap map){

        if("00000".equals(user.getId()) && "西安凌安".equals(user.getName()) && "888888".equals(user.getPassword())){
            System.out.println("歡迎"+user.getName()+"登陸成功，您的用户號号為"+user.getId());
            map.addAttribute(user);
            return "wellcom";
        }
        else {
            System.out.println("对不起，用户名密码不正确，需要重新登录！");
            map.addAttribute(user);
            return "fail";
        }
    }
}
