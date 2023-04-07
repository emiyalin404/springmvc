package com.syscom.lingan.service.Impl;

import com.syscom.lingan.dao.BlogMapper;
import com.syscom.lingan.entity.Blog;
import com.syscom.lingan.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    public BlogMapper blogMapper;

    public List<Blog> queryBlog(Blog blog) {
        return blogMapper.queryBlog(blog) ;
    }

}
