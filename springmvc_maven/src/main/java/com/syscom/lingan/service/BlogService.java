package com.syscom.lingan.service;


import com.syscom.lingan.entity.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> queryBlog(Blog blog);
}
