package com.hongdu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hongdu.entity.Blog;
import com.hongdu.entity.PageBean;
import com.hongdu.service.BlogService;
import com.hongdu.utils.PageUtil;
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
    public ModelAndView index(@RequestParam(value="page",required=false)String page,@RequestParam(value="typeId",required=false)String typeId,@RequestParam(value="releaseDateStr",required=false)String releaseDateStr,HttpServletRequest request) throws Exception{
        ModelAndView mav = new ModelAndView();
        if(StringUtil.isEmpty(page)) {
            page = "1";
        }
        PageBean pageBean = new PageBean(Integer.parseInt(page), 10);//每页10条,默认为第一页
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("start", pageBean.getStart());
        map.put("size", pageBean.getPageSize());
        map.put("typeId", typeId);
        map.put("releaseDateStr", releaseDateStr);
        List<Blog> blogList = blogService.list(map);
        
        //提取图片
        for(Blog blog : blogList) {
            List<String> imageList = blog.getImageList();
            String blogInfo = blog.getContent();
            Document doc = null;
            if(blogInfo != null){
                doc = Jsoup.parse(blogInfo);//博客信息就是一个Html
                Elements jpgs = doc.select("img[src$=.jpg]");
                for(int i = 0; i < jpgs.size(); i++) {
                    Element jpg = jpgs.get(i);
                    imageList.add(jpg.toString());
                    //只能放三张缩略图
                    if(i == 2) {
                        break;
                    }
                }
            }
            
        }
        
        mav.addObject("blogList", blogList);//添加渲染数据模型信息
        StringBuffer param = new StringBuffer();//param参数:
        if(StringUtil.isNotEmpty(typeId)) {
            param.append("typeId=" + typeId + "&");
        }
        if(StringUtil.isNotEmpty(releaseDateStr)) {
            param.append("releaseDateStr=" + releaseDateStr + "&");
        }
        mav.addObject("pageCode", PageUtil.getPagination(request.getContextPath()+"/index.html", blogService.getTotal(map), Integer.parseInt(page), 10, param.toString()));
        mav.addObject("pageTitle", "java开源博客系统");
        mav.addObject("mainPage", "/foreground/blog/list.jsp");//添加渲染动态页面数据
        mav.setViewName("mainTemp");//跳转的视图jsp页面
        return mav;
    }
    
    /**
     * 源码下载
     * @return
     * @throws Exception
     */
    @RequestMapping("/download")
    public ModelAndView download() throws Exception {
        ModelAndView mav = new ModelAndView();
        mav.addObject("mainPage", "/foreground/system/download.jsp");
        mav.addObject("pageTitle", "本站源码下载_java开源博客系统");
        mav.setViewName("mainTemp");
        return mav;
    }
    
}
