package com.syscom.lingan.dao;

import com.syscom.lingan.entity.Blog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BlogMapper {

    //測試if
    //測試choose
    List<Blog> queryBlog(Blog blog);

}
