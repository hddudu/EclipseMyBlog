<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap3/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap3/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/blog.css">
<script src="${pageContext.request.contextPath}/static/bootstrap3/js/jquery-1.11.2.min.js"></script>
<script src="${pageContext.request.contextPath}/static/bootstrap3/js/bootstrap.min.js"></script>
<title>hongdu博主主页</title>
<style type="text/css">
	body{
		padding-top:10px;
		padding-bottom:40px;
	}
</style>
</head>
<body>
<!-- 整一个大容器 -->
<div class="container">
	<!-- 标题部分  -->
	<div class="row">
		<div class="col-md-4">
			<img alt="hongdu开源博客系统" src="${pageContext.request.contextPath}/static/images/logo.png">
		</div>
		<div class="col-md-8">
			<iframe style="float:right;" width="420" scrolling="no" height="60" frameborder="0" allowtransparency="true" src="http://i.tianqi.com/index.php?c=code&id=12&icon=1&num=5&site=12"></iframe>
		</div>
	</div>
	<!-- 导航栏部分 -->
	<div class="row">
		<div class="col-md-12" style="padding-top:10px;">
			<nav class="navbar navbar-default">
			  <div class="container-fluid">
			    <!-- Brand and toggle get grouped for better mobile display -->
			    <div class="navbar-header">
			      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
			        <span class="sr-only">Toggle navigation</span>
			        <span class="icon-bar"></span>
			        <span class="icon-bar"></span>
			        <span class="icon-bar"></span>
			      </button>
			      <a class="navbar-brand" href="#"><font color="black"><strong>首页</strong></font></a>
			    </div>
			
			    <!-- Collect the nav links, forms, and other content for toggling -->
			    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			      <ul class="nav navbar-nav">
			        <li><a href="#"><font color="black"><strong>关于博主</strong></font></a></li>
			        <li><a href="#"><font color="black"><strong>本站源码下载</strong></font></a></li>
			      </ul>
			      <form class="navbar-form navbar-right">
			        <div class="form-group">
			          <input type="text" class="form-control" placeholder="请输入要查询的关键字">
			        </div>
			        <button type="submit" class="btn btn-default">搜索</button>
			      </form>
			    </div><!-- /.navbar-collapse -->
			  </div><!-- /.container-fluid -->
			</nav>
		</div>
	</div>
	<!-- 最新博客部分 -->
	<div class="row">
		<div class="col-md-9">
			<div class="data_list">
				<div class="data_list_title">
					<img alt="最新博客" src="${pageContext.request.contextPath}/static/images/list_icon.png">
					最新博客
				</div>
			
				<div class="datas">
					<ul>
						<li style="margin-bottom:30px">
							<span class="date"><a href="${pageContext.request.contextPath}/blog/articles/52.html">2016年02月15日</a> </span>
							<span class="title"><a href="${pageContext.request.contextPath}/blog/articles/52.html">使用CXF开发WebService客户端</a> </span>
							<span class="summary">摘要: 前面一讲开发了webservice服务器端接口，今天的话，我们来开发webservice客户端，让大家来体验下过程；首先建一个Maven项目，项目名字，WS_Client；然后我们要用CXF给我们提供的工具wsdl2java 来根据请求的url生成客户端代码；wsdl2java工具在CXF开发包里；开发下载地...</span>
							<span class="img">
								<a href="/blog/articles/52.html"><img src="${pageContext.request.contextPath}/static/userImages/a.png" alt="a.png"></a>
						  		&nbsp;&nbsp;
					  		
						  		<a href="/blog/articles/52.html"><img alt="QQ鎴浘20160215203213.jpg" src="${pageContext.request.contextPath}/static/userImages/b.png" title="b.png" width="667" height="264" style="width: 667px; height: 264px;"></a>
						  		&nbsp;&nbsp;
					  		
						  		<a href="/blog/articles/52.html"><img alt="QQ鎴浘20160215203317.jpg" src="${pageContext.request.contextPath}/static/userImages/rbt.jpg" title="c.png"></a>
						  		&nbsp;&nbsp;
							</span>
							<span class="info">发表于2016-2-15 21：6 阅读(71) 评论(5)</span>
							<hr style="height:5px;border:none;border-top:1px dashed gray;padding-bottom:  10px;" />
						</li>
						
						<li style="margin-bottom: 30px">
							  	<span class="date"><a href="/blog/articles/63.html">2016年02月29日</a></span>
							  	<span class="title"><a href="/blog/articles/63.html">我的某个徒弟的博客开通啦</a></span>
							  	<span class="summary">摘要:  http://www.liuyu.space/  在我的指导下，我的一个即将找工作的学徒搞了好几天。终于把博客系统搭建好了。真心祝愿他找份好工作，以后事业有成；...</span>
							  	<span class="img">
							  		
								  		<a href="/blog/articles/63.html"><img src="${pageContext.request.contextPath}/static/userImages/3.jpg" style="width: 667px; height: 264px;" title="3.jpg" width="667" height="264"></a>
								  		&nbsp;&nbsp;
							  		
								  		<a href="/blog/articles/63.html"><img src="${pageContext.request.contextPath}/static/userImages/dm.jpg" style="width: 667px; height: 264px;" title="4.jpg" width="667" height="264"></a>
								  		&nbsp;&nbsp;
							  		
							  	</span>
							  	<span class="info">发表于 2016-02-29 20:23 阅读(4020) </span>
							  </li>

							<hr style="height:5px;border:none;border-top:1px dashed gray;padding-bottom:  10px;" />
					</ul>
				</div>
				
			</div>
		</div>
		<!-- 博主信息模块 -->
		<div class="col-md-3">
			<div class="data_list">
				<div class="data_list_title">
					<img src="${pageContext.request.contextPath}/static/images/user_icon.png"/>
					博主信息
				</div>
				<div class="user_image">
					<img src="${pageContext.request.contextPath}/static/userImages/c.png"/>
				</div>
				<div class="nickName">Java1234_hongdu</div>
				<div class="userSign">(知识改变命运，技术改变世界)</div>
			</div>
			
			<div class="data_list">
				<div class="data_list_title">
					<img src="${pageContext.request.contextPath}/static/images/byType_icon.png"/>
					按日志类别
				</div>
				<div class="datas">
					<ul>
							<li><span><a href="/index.html?typeId=1">Java核心基础(126)</a></span></li>
						
							<li><span><a href="/index.html?typeId=30">Layui(1)</a></span></li>
						
							<li><span><a href="/index.html?typeId=2">Mysql(2)</a></span></li>
						
							<li><span><a href="/index.html?typeId=28">Dubbo(7)</a></span></li>
						
							<li><span><a href="/index.html?typeId=32">IDEA(0)</a></span></li>
						
							<li><span><a href="/index.html?typeId=22">SpringBoot(10)</a></span></li>
						
							<li><span><a href="/index.html?typeId=26">Git(1)</a></span></li>
						
							<li><span><a href="/index.html?typeId=31">SpringCloud(1)</a></span></li>
						
							<li><span><a href="/index.html?typeId=3">Tomcat(5)</a></span></li>
						
							<li><span><a href="/index.html?typeId=29">支付宝接口(3)</a></span></li>
						
							<li><span><a href="/index.html?typeId=27">NodeJs(1)</a></span></li>
						
							<li><span><a href="/index.html?typeId=7">shiro(1)</a></span></li>
						
							<li><span><a href="/index.html?typeId=10">jsoup(6)</a></span></li>
						
							<li><span><a href="/index.html?typeId=25">活动(8)</a></span></li>
						
							<li><span><a href="/index.html?typeId=11">hibernate(1)</a></span></li>
						
							<li><span><a href="/index.html?typeId=18">EhCache缓存框架(4)</a></span></li>
						
							<li><span><a href="/index.html?typeId=9">webservice(10)</a></span></li>
						
							<li><span><a href="/index.html?typeId=24">elasticsearch(27)</a></span></li>
						
							<li><span><a href="/index.html?typeId=21">Redis(17)</a></span></li>
						
							<li><span><a href="/index.html?typeId=12">maven(4)</a></span></li>
						
							<li><span><a href="/index.html?typeId=4">IT之路(22)</a></span></li>
						
							<li><span><a href="/index.html?typeId=13">activiti(26)</a></span></li>
						
							<li><span><a href="/index.html?typeId=20">centos(23)</a></span></li>
						
							<li><span><a href="/index.html?typeId=17">log4j日志(8)</a></span></li>
						
							<li><span><a href="/index.html?typeId=5">随心生活(16)</a></span></li>
						
							<li><span><a href="/index.html?typeId=14">java爬虫技术(14)</a></span></li>
						
							<li><span><a href="/index.html?typeId=15">网站SEO(2)</a></span></li>
						
							<li><span><a href="/index.html?typeId=16">httpclient(7)</a></span></li>
						
							<li><span><a href="/index.html?typeId=19">htmlunit(10)</a></span></li>
						
					</ul>
				</div>
			</div>
			
			<div class="data_list">
				<div class="data_list_title">
					<img src="${pageContext.request.contextPath}/static/images/byDate_icon.png"/>
					按日志日期
				</div>
				<div class="datas">
					<ul>
						
							<li><span><a href="/index.html?releaseDateStr=2018年07月">2018年07月(1)</a></span></li>
						
							<li><span><a href="/index.html?releaseDateStr=2018年06月">2018年06月(4)</a></span></li>
						
							<li><span><a href="/index.html?releaseDateStr=2018年05月">2018年05月(4)</a></span></li>
						
							<li><span><a href="/index.html?releaseDateStr=2018年04月">2018年04月(3)</a></span></li>
						
							<li><span><a href="/index.html?releaseDateStr=2018年03月">2018年03月(7)</a></span></li>
						
							<li><span><a href="/index.html?releaseDateStr=2018年02月">2018年02月(7)</a></span></li>
						
							<li><span><a href="/index.html?releaseDateStr=2018年01月">2018年01月(13)</a></span></li>
						
							<li><span><a href="/index.html?releaseDateStr=2017年12月">2017年12月(3)</a></span></li>
						
							<li><span><a href="/index.html?releaseDateStr=2017年11月">2017年11月(10)</a></span></li>
						
							<li><span><a href="/index.html?releaseDateStr=2017年10月">2017年10月(1)</a></span></li>
						
							<li><span><a href="/index.html?releaseDateStr=2017年09月">2017年09月(9)</a></span></li>
						
							<li><span><a href="/index.html?releaseDateStr=2017年08月">2017年08月(12)</a></span></li>
						
							<li><span><a href="/index.html?releaseDateStr=2017年07月">2017年07月(19)</a></span></li>
						
							<li><span><a href="/index.html?releaseDateStr=2017年06月">2017年06月(21)</a></span></li>
						
							<li><span><a href="/index.html?releaseDateStr=2017年05月">2017年05月(1)</a></span></li>
						
							<li><span><a href="/index.html?releaseDateStr=2017年04月">2017年04月(12)</a></span></li>
						
							<li><span><a href="/index.html?releaseDateStr=2017年03月">2017年03月(13)</a></span></li>
						
							<li><span><a href="/index.html?releaseDateStr=2017年02月">2017年02月(12)</a></span></li>
						
							<li><span><a href="/index.html?releaseDateStr=2017年01月">2017年01月(14)</a></span></li>
						
							<li><span><a href="/index.html?releaseDateStr=2016年12月">2016年12月(8)</a></span></li>
						
							<li><span><a href="/index.html?releaseDateStr=2016年11月">2016年11月(25)</a></span></li>
						
							<li><span><a href="/index.html?releaseDateStr=2016年10月">2016年10月(16)</a></span></li>
						
							<li><span><a href="/index.html?releaseDateStr=2016年09月">2016年09月(13)</a></span></li>
						
							<li><span><a href="/index.html?releaseDateStr=2016年08月">2016年08月(20)</a></span></li>
						
							<li><span><a href="/index.html?releaseDateStr=2016年07月">2016年07月(12)</a></span></li>
						
							<li><span><a href="/index.html?releaseDateStr=2016年06月">2016年06月(36)</a></span></li>
						
							<li><span><a href="/index.html?releaseDateStr=2016年05月">2016年05月(10)</a></span></li>
						
							<li><span><a href="/index.html?releaseDateStr=2016年04月">2016年04月(19)</a></span></li>
						
							<li><span><a href="/index.html?releaseDateStr=2016年03月">2016年03月(14)</a></span></li>
						
							<li><span><a href="/index.html?releaseDateStr=2016年02月">2016年02月(23)</a></span></li>
						
							<li><span><a href="/index.html?releaseDateStr=2016年01月">2016年01月(1)</a></span></li>
						
					</ul>
				</div>
			</div>
			
			<div class="data_list">
				<div class="data_list_title">
					<img src="${pageContext.request.contextPath}/static/images/link_icon.png"/>
					友情链接
				</div>
				<div class="datas">
					<ul>
						
							<li><span><a href="http://www.java1234.com/" target="_blank">Java知识分享网</a></span></li>
						
							<li><span><a href="http://pan.java1234.com/" target="_blank">百度云搜索引擎</a></span></li>
						
							<li><span><a href="http://www.easyicon.net/" target="_blank">小图标下载</a></span></li>
						
							<li><span><a href="http://www.uugai.com/" target="_blank">免费logo在线制作</a></span></li>
						
					</ul>
				</div>
			</div>
			
			
		</div>
	</div>
	
	<div class="row">
		<div class="col-md-12" >
			<div align="center" style="padding-top: 120px" >
				<span style="float: left;">Powered by <a  href="http://blog.java1234.com" target="_blank">Java1234</a> V3.0</span>
				  Copyright © 2012-2016 Java_hongdu
			</div>
		</div>
	</div>
	
	
</div>
</body>
</html>