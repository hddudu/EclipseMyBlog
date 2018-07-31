package com.hongdu.service;

import java.util.List;
import java.util.Map;

import com.hongdu.entity.Blog;
import com.hongdu.entity.Link;

/**
 * 博客Service接口
 * @author dudu
 *
 */
public interface BlogService {
   
    /**
     * 根据日期月份分组查询
     * @return
     */
    public List<Blog> countList();
    
    /**
     * 分页查询博客
     * @param map
     * @return
     */
    public List<Blog> list(Map<String, Object> map );
    
    /**
     * 获取总记录数
     * @param map
     * @return
     */
    public Long getTotal(Map<String, Object> map);
}
