package com.hongdu.entity;

/**
 * 友情链接实体
 * @author dudu
 *
 */
public class Link {

    private Integer id;//编号
    private String linkName;//链接名称
    private String linkUrl;//链接Url
    private String orderNumber;//排序数字
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getLinkName() {
        return linkName;
    }
    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }
    public String getLinkUrl() {
        return linkUrl;
    }
    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }
    public String getOrderNumber() {
        return orderNumber;
    }
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
}
