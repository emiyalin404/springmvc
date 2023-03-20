package com.syscom.lingan.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class YesController extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("好耶");
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("yes");
        return modelAndView;
    }
}
