package com.hongdu.entity;

import java.util.Date;

/**
 * 博客实体
 * @author dudu
 *
 */
public class Blog {

    private Integer id;//编号
    private String title;//标题
    private String summary;//摘要
    private Date releaseDate;//发布日期
    private Integer clickHit;//点击次数
    private Integer replyHit;//回复次数
    private String content;//博客内容
    
    private BlogType blogType;//博客类型
    
    private String keyWord;//关键字 空格 隔开
    private Integer blogCount;//博客数量 非博客实际属性 主要是根据归档日期查询数量用到
    private String releaseDateStr;//发布日期的字符串 只取年和月
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }
    public Date getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
    public Integer getClickHit() {
        return clickHit;
    }
    public void setClickHit(Integer clickHit) {
        this.clickHit = clickHit;
    }
    public Integer getReplyHit() {
        return replyHit;
    }
    public void setReplyHit(Integer replyHit) {
        this.replyHit = replyHit;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public BlogType getBlogType() {
        return blogType;
    }
    public void setBlogType(BlogType blogType) {
        this.blogType = blogType;
    }
    public String getKeyWord() {
        return keyWord;
    }
    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }
    public Integer getBlogCount() {
        return blogCount;
    }
    public void setBlogCount(Integer blogCount) {
        this.blogCount = blogCount;
    }
    public String getReleaseDateStr() {
        return releaseDateStr;
    }
    public void setReleaseDateStr(String releaseDateStr) {
        this.releaseDateStr = releaseDateStr;
    }
    
    
}
