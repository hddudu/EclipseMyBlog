package com.hongdu.utils;

/**
 * 分页工具类
 * @author dudu
 *
 */
public class PageUtil {
    
    /**
     * 生成分页代码
     * @param targetUrl 目标地址
     * @param totalNum 总记录数
     * @param currentPage 当前页数
     * @param pageSize 每页大小
     * @param param 携带的其他参数
     * @return
     */
    public static String getPagination(String targetUrl, long totalNum, int currentPage, int pageSize, String param){
        long totalPage = totalNum % pageSize == 0 ? totalNum / pageSize : (totalNum / pageSize + 1);//总页数
        if(totalPage == 0) {
            return "未查询到数据";
        } else {
            StringBuffer pageCode = new StringBuffer();
            //首先就是首页
            pageCode.append("<li><a href='" + targetUrl + "?page=1&"+param+"'>首页</a></li>");
            if(currentPage > 1) {
                //上一页
                pageCode.append("<li><a href='" + targetUrl + "?page=" + (currentPage - 1) +"&"+param+"'>上一页</a></li>");
            } else {
               //上一页不可用
                pageCode.append("<li class='disabled'><a href='" + targetUrl + "?page=" + (currentPage - 1) +"&"+param+"'>上一页</a></li>");
            }
            //显示前面2页或者后面2页,假如当前是第5页,显示的是:3 4 5 6 7就是显示了这个5页,选中的页为激活状态
            for(int i = currentPage - 2; i <= currentPage + 2; i++) {
                if(i < 1 || i > totalPage) {
                    continue;
                }
                if(i == currentPage) {
                    pageCode.append("<li class='active'><a href='"+targetUrl+"?page="+i+"&"+param+"'>"+i+"</a></li>");
                } else {
                    pageCode.append("<li><a href='"+targetUrl+"?page="+i+"&"+param+"'>"+i+"</a></li>"); 
                }
            }
            if(currentPage < totalPage) {
                //下一页
                pageCode.append("<li><a href='"+targetUrl+"?page="+(currentPage+1)+"&"+param+"'>下一页</a></li>"); 
            } else {
                //下一页不可用
                pageCode.append("<li class='disabled'><a href='"+targetUrl+"?page="+(currentPage+1)+"&"+param+"'>下一页</a></li>");    
            }
            //到达尾页
            pageCode.append("<li><a href='"+targetUrl+"?page="+totalPage+"&"+param+"'>尾页</a></li>");
            return pageCode.toString();
        }
    }
}
