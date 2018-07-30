package com.hongdu.dao;

import java.util.List;
import java.util.Map;

import com.hongdu.entity.Link;

/**
 * 友情链接Dao接口
 * @author dudu
 *
 */
public interface LinkDao {

    /**
     * 查找友情链接信息
     * @param map
     * @return
     */
    public List<Link> list(Map<String, Object> map);
}
