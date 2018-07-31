package com.hongdu.service;

import java.util.List;

import com.hongdu.entity.BlogType;

/**
 * 博客类型service接口
 * @author dudu
 *
 */
public interface BlogTypeService {
    /**
     * 查询所有博客类型以及对应的博客数量
     * @return
     */
    public List<BlogType> countList();
    
    /**
     * 通过id查询博客类型实体
     * @param id
     * @return
     */
    public BlogType findById(Integer id);
}
