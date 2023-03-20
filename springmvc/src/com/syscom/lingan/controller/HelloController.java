package com.syscom.lingan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HelloController {
@RequestMapping("/hello.html")
    protected ModelAndView hello() {
        System.out.println("12321312312");

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
