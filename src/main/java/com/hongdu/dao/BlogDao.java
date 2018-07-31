package com.hongdu.dao;

import java.util.List;
import java.util.Map;

import com.hongdu.entity.Blog;

/**
 * 博客Dao接口
 * @author dudu
 *
 */
public interface BlogDao {

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
