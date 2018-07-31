package com.hongdu.dao;

import java.util.List;
import java.util.Map;

import com.hongdu.entity.BlogType;
import com.hongdu.entity.Link;

/**
 * 博客类型Dao接口
 * @author dudu
 *
 */
public interface BlogTypeDao {

    /**
     * 查询所有博客类型以及对应的博客数量
     * @return
     */
    public List<BlogType> countList();
}
