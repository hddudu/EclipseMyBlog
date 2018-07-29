package com.hongdu.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hongdu.service.BloggerService;

/**
 * 博主Controller层
 * @author dudu
 *
 */
@Controller
@RequestMapping("/blogger")
public class BloggerController {

    @Resource
    private BloggerService bloggerService;
}
