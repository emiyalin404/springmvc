package com.syscom.lingan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @RequestMapping("hello")
    public ModelAndView hello(@RequestParam("username") String name){
        System.out.println("原來是"+name+"阿，笑死");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        return  modelAndView;
    }
}
