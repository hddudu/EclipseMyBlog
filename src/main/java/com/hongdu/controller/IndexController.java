package com.hongdu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hongdu.entity.Blog;
import com.hongdu.entity.PageBean;
import com.hongdu.service.BlogService;
import com.hongdu.utils.StringUtil;

/**
 * 首页Controller
 * @author dudu
 *
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @Resource
    private BlogService blogService;
    
    @RequestMapping("/index")//请求主页
    public ModelAndView index(@RequestParam(value="page",required=false)String page) throws Exception{
        ModelAndView mav = new ModelAndView();
        if(StringUtil.isEmpty(page)) {
            page = "1";
        }
        PageBean pageBean = new PageBean(Integer.parseInt(page), 10);//每页10条,默认为第一页
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("start", pageBean.getStart());
        map.put("size", pageBean.getPageSize());
        List<Blog> blogList = blogService.list(map);
        mav.addObject("blogList", blogList);//添加渲染数据模型信息
        mav.addObject("pageTitle", "java开源博客系统");
        mav.addObject("mainPage", "/foreground/blog/list.jsp");//添加渲染动态页面数据
        mav.setViewName("mainTemp");//跳转的视图jsp页面
        return mav;
    }
    
}
