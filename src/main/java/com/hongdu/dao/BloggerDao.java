package com.hongdu.dao;

import com.hongdu.entity.Blogger;

/**
 * 博主Dao接口
 * @author dudu
 *
 */
public interface BloggerDao {

    /**
     * 通过用户名查询用户
     * @param userName
     * @return
     */
    public Blogger getByUserName(String userName);
}
