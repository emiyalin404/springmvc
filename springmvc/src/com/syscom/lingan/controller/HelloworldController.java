package com.syscom.lingan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloworldController {
    @RequestMapping("/helloworld.html")
    protected ModelAndView hellowrold(){
        System.out.println("隨便2312");

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("helloworld");
        return modelAndView;
    }

}
