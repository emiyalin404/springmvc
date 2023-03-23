package com.syscom.lingan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {
//    @RequestMapping("hello.html")
//    protected ModelAndView hello(User user) {
//        System.out.println(user.toString());
//
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("hello");
//        return modelAndView;
//    }

    @RequestMapping("hello.html")
    protected ModelAndView hello(User user) {
        System.out.println(user.toString());

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");

        modelAndView.addObject("name",user.getName());
        return modelAndView;
    }



}
