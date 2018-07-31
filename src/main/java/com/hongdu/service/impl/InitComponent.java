package com.hongdu.service.impl;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import com.hongdu.entity.Blog;
import com.hongdu.entity.BlogType;
import com.hongdu.entity.Blogger;
import com.hongdu.entity.Link;
import com.hongdu.service.BlogService;
import com.hongdu.service.BlogTypeService;
import com.hongdu.service.BloggerService;
import com.hongdu.service.LinkService;

/**
 * Servlet容器上下文监听器
 * @author dudu
 * ApplicationContextAware : Spring中提供了ApplicationContext
 *
 */
@Component
public class InitComponent implements ServletContextListener,ApplicationContextAware {
    
    private static ApplicationContext applicationContext;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
//        System.out.println("............" + applicationContext);
        //............Root WebApplicationContext: startup date [Mon Jul 30 19:27:03 CST 2018]; root of context hierarchy
        ServletContext application = sce.getServletContext();
        BloggerService bloggerService = (BloggerService) applicationContext.getBean("bloggerService");
        Blogger blogger = bloggerService.find();
        blogger.setPassword(null);//密码涉及安全性需要特别处理
        application.setAttribute("blogger", blogger);
        
        LinkService linkService = (LinkService) applicationContext.getBean("linkService");
        List<Link> linkList = linkService.list(null);//查询所有的友情链接信息
        application.setAttribute("linkList", linkList);
        
        //把按照日志类别归档博客信息存到application中
        BlogTypeService blogTypeService = (BlogTypeService) applicationContext.getBean("blogTypeService");
        List<BlogType> blogTypeCountList = blogTypeService.countList();
        application.setAttribute("blogTypeCountList", blogTypeCountList);
        
        //把按照日志日期归档博客信息存到application中
        BlogService blogService = (BlogService) applicationContext.getBean("blogService");
        List<Blog> blogCountList = blogService.countList();
        application.setAttribute("blogCountList", blogCountList);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

}
