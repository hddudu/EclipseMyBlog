package com.hongdu.controller.admin;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hongdu.service.BloggerService;

/**
 * 管理员博主Controller层
 * @author dudu
 *
 */
@Controller
@RequestMapping("/admin/blogger")//需要身份认证
public class BloggerAdminController {

    @Resource
    private BloggerService bloggerService;
}
