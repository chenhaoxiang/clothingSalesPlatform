<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/index.css">

<title>唯依网</title>

<script type="text/javascript">
	$(function() {
		$("#sousu").click(function() {
			if ($.trim($(".form-control").val()) == "") {
				alert("请输入您需要商品的关键字进行查询！");
			}
			$("#sousuForm").attr("action", "");
			$("#sousuForm").submit();
		});
	});
	
</script>

</head>

<body>
	<div class="rightDiv">
		<font class="userFont"> <c:if
				test="${!empty requestScope.user}" var="userBoo">
				欢迎你:${user.name}! &nbsp;|&nbsp;
				<font class="dingdanFont"> <a
					href='<c:url value="#"></c:url>'>我的订单</a> &nbsp;|&nbsp; <a
					href='<c:url value="#"></c:url>'>购物车 <span class="badge">${user.number}</span>
				</a> &nbsp;|&nbsp; <a href='<c:url value="#"></c:url>'>帮助中心</a>
					&nbsp;|&nbsp; <a href='<c:url value="#"></c:url>'>卖家中心</a>
					&nbsp;&nbsp; </font>
			</c:if> <c:if test="${!userBoo}" var="userBoo">
				<a href='<c:url value="#"></c:url>'>登录</a>/<a
					href='<c:url value="/jsps/register.jsp"></c:url>'>注册</a> &nbsp;|&nbsp;
				<font class="dingdanFont"> <a
					href='<c:url value="#"></c:url>'>我的订单</a> &nbsp;|&nbsp; <a
					href='<c:url value="#"></c:url>'>购物车 <span class="badge">0</span>
				</a> &nbsp;|&nbsp; <a href='<c:url value="#"></c:url>'>帮助中心</a>
					&nbsp;|&nbsp; <a href='<c:url value="#"></c:url>'>卖家中心</a>
					&nbsp;&nbsp; </font>
			</c:if> </font>

	</div>
	<hr>
	<div>
		<span class="biaoti">唯依网aaaa &nbsp; &nbsp; | &nbsp; &nbsp;因你而唯一 </span>
		<!-- 搜索框 -->
		<div class="col-lg-6">
			<div class="input-group">
				<form id="sousuForm">
					<input type="text" class="form-control" name="sousuguanjianzi">
				</form>
				<span class="input-group-btn">
					<button class="btn btn-default" type="button" id="sousu">搜索一下</button>
				</span>
			</div>
			<!-- /input-group -->
		</div>
		<!-- /.col-lg-6 -->
	</div>
		
	<br/>
	<br/><br/>


	<nav class="navbar navbar-default" role="navigation">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="index.jsp">首页</a>
		</div>
		<div>
			<ul class="nav navbar-nav">
				<c:forEach items="${types1}" var="type1">
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
						 	${type1.name}
							<b class="caret">
							</b>
						</a>
						<ul class="dropdown-menu">
							<c:forEach items="${types2}" var="type2">
								<c:if test="${type2.parentId==type1.id}">
									<li><a href="#">${type2.name}</a>
									</li>
									<hr/>
									<c:forEach items="${types3}" var="type3">
										<c:if test="${type3.parentId==type2.id}">
											<li><a href="#">${type3.name}</a>
											</li>
										</c:if>
									</c:forEach>
								</c:if>
							</c:forEach>
						</ul>
					</li>
				</c:forEach>
			
				<li class="dropdown"><a href="#">iOS</a>
				</li>
				<li><a href="#">SVN</a>
				</li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"> Java </a>
					<ul class="dropdown-menu">
						<li><a href="#">jmeter</a>
						</li>
						<li><a href="#">EJB</a>
						</li>
						<li><a href="#">Jasper Report</a>
						</li>
						<li class="divider"></li>
						<li><a href="#">分离的链接</a>
						</li>
						<li class="divider"></li>
						<li><a href="#">另一个分离的链接</a>
						</li>
					</ul>
				</li>
			</ul>
		</div>
	</div>
	</nav>




</body>
</html>
