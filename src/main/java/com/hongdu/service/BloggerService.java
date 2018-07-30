package com.hongdu.service;

import com.hongdu.entity.Blogger;

/**
 * 博主Service接口
 * @author dudu
 *
 */
public interface BloggerService {
   
    /**
     * 通过用户名查询用户
     * @param userName
     * @return
     */
    public Blogger getByUserName(String userName);
    
    /**
     * 查询博主信息
     * @return
     */
    public Blogger find();
    
}
