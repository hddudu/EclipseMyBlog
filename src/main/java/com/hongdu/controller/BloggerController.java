package com.hongdu.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hongdu.entity.Blogger;
import com.hongdu.service.BloggerService;
import com.hongdu.utils.CryptographyUtil;

/**
 * 博主Controller层
 * @author dudu
 *
 */
@Controller
@RequestMapping("/blogger")//blogger表示请求的前面的一个路径
public class BloggerController {

    @Resource
    private BloggerService bloggerService;
    
    /**
     * @param blogger
     * @param request
     * @return
     */
    @RequestMapping("/login")
    public String login(Blogger blogger, HttpServletRequest request){
        //shiro进行身份认证
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(blogger.getUserName(), CryptographyUtil.md5(blogger.getPassword(), "123456"));
        try {
            subject.login(token);
            return "redirect:/admin/main.jsp";
        } catch (Exception e) {
            e.printStackTrace();
            //回显blogger博主信息
            request.setAttribute("blogger", blogger);
            request.setAttribute("errorInfo", "用户名或者密码错误!");
            return "login";
        }
    }
    
    @RequestMapping("/aboutMe")
    public ModelAndView aboutMe() throws Exception {
        ModelAndView mav = new ModelAndView();
        mav.addObject("mainPage", "/foreground/blogger/info.jsp");
        mav.addObject("pageTitle", "关于博主_java开源博客系统");
        mav.setViewName("mainTemp");
        return mav;
    }
    
}
