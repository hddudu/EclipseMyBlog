<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="data_list">
	<div class="data_list_title">
		<img alt="最新博客" src="${pageContext.request.contextPath}/static/images/about_icon.png">
		关于博主
	</div>
	
	<div style="padding:30px;"><!-- 博主简介 -->
		${blogger.profile }
	</div>
</div>