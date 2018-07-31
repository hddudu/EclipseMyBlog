package com.hongdu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hongdu.dao.BlogTypeDao;
import com.hongdu.entity.BlogType;
import com.hongdu.service.BlogTypeService;

/**
 * 博客类型Service实现类
 * @author dudu
 *
 */
@Service("blogTypeService")
public class BlogTypeServiceImpl implements BlogTypeService {

    @Resource
    private BlogTypeDao blogTypeDao;
    
    @Override
    public List<BlogType> countList() {
        return blogTypeDao.countList();
    }

    @Override
    public BlogType findById(Integer id) {
        return blogTypeDao.findById(id);
    }

}
