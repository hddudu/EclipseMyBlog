package com.hongdu.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hongdu.dao.LinkDao;
import com.hongdu.entity.Link;
import com.hongdu.service.LinkService;

@Service("linkService")
public class LinkServiceImpl implements LinkService {

    @Resource
    private LinkDao linkDao;
    
    @Override
    public List<Link> list(Map<String, Object> map) {
        return linkDao.list(map);
    }

}
