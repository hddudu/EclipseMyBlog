package com.hongdu.service;

import java.util.List;
import java.util.Map;

import com.hongdu.entity.Link;

/**
 * 友情链接Service接口
 * @author dudu
 *
 */
public interface LinkService {
   
    /**
     * @param map
     * @return
     */
    public List<Link> list(Map<String, Object> map);
}
