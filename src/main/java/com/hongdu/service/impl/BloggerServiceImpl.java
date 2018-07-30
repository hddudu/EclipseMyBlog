package com.hongdu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hongdu.dao.BloggerDao;
import com.hongdu.entity.Blogger;
import com.hongdu.service.BloggerService;

/**
 * 博主Service实现类
 * @author dudu
 *
 */
@Service("bloggerService")
public class BloggerServiceImpl implements BloggerService {

    @Resource
    private BloggerDao bloggerDao;
    
    @Override
    public Blogger getByUserName(String userName) {
        return bloggerDao.getByUserName(userName);
    }

    @Override
    public Blogger find() {
        return bloggerDao.find();
    }

}
