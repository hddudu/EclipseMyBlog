package com.hongdu.controller;

import java.util.Arrays;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hongdu.entity.Blog;
import com.hongdu.entity.Blogger;
import com.hongdu.service.BlogService;
import com.hongdu.service.BloggerService;
import com.hongdu.utils.CryptographyUtil;
import com.hongdu.utils.StringUtil;

/**
 * 博客Controller层
 * @author dudu
 *
 */
@Controller
@RequestMapping("/blog")//blog表示请求的前面的一个路径
public class BlogController {

    @Resource
    private BlogService blogService;
    //PathVariable是用来获得请求url中的动态参数的
    //将URL的模板变量映射到功能处理方法的参数上
    /**
     * 请求博客详细信息
     * @param id
     * @param request
     * @return
     */
    @RequestMapping("/articles/{id}")//动态接收传值数据
    public ModelAndView details(@PathVariable("id")Integer id, HttpServletRequest request){
        ModelAndView mav = new ModelAndView();
        Blog blog = blogService.findById(id);
        String keywords = blog.getKeyWord();
        if(StringUtil.isNotEmpty(keywords)) {
            String[] arr = keywords.split(" ");
            mav.addObject("keywords", StringUtil.filterWhite(Arrays.asList(arr)));
        } else {
            mav.addObject("keywords", null);
        }
        
        blog.setClickHit(blog.getClickHit() + 1);
        blogService.update(blog);
        mav.addObject("pageCode", this.getUpAndDownPageCode(blogService.getLastBlog(id), blogService.getNextBlog(id), request.getServletContext().getContextPath()));
        mav.addObject("blog", blog);
        mav.addObject("mainPage", "/foreground/blog/view.jsp");
        mav.addObject("pageTitle", blog.getTitle());
        mav.setViewName("mainTemp");
        return mav;
    }
    
    /**
     * 获取上一篇和下一篇博客
     * @param lastBlog
     * @param nextBlog
     * @param projectConnection 工程的上下文路径 /Blog
     * @return
     */
    private String getUpAndDownPageCode(Blog lastBlog, Blog nextBlog, String projectContext){
        StringBuffer pageCode = new StringBuffer();
        if(lastBlog == null || lastBlog.getId() == null) {
            pageCode.append("<p>上一篇： 没有了</p>");
        } else {
            //有博客的情况
            pageCode.append("<p>上一篇： <a href='" + projectContext + "/blog/articles/" + lastBlog.getId() +".html'>"+ lastBlog.getTitle() +"</a></p>");
        }
        
        if(nextBlog == null || nextBlog.getId() == null) {
            pageCode.append("<p>下一篇： 没有了</p>");
        } else {
            //有博客的情况
            pageCode.append("<p>下一篇： <a href='" + projectContext + "/blog/articles/" + nextBlog.getId() +".html'>"+ nextBlog.getTitle() +"</a></p>");
        }
        return pageCode.toString();
    }
    
}
