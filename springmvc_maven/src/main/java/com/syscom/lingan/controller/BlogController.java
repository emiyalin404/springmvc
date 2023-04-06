package com.syscom.lingan.controller;


import com.syscom.lingan.entity.Blog;
import com.syscom.lingan.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlogController {
    @Autowired
    private BlogService blogService;
    @RequestMapping("queryBlog")
    public List<Blog> queryBlog(@RequestBody Blog blog){
        return blogService.queryBlog(blog);
    }
}
