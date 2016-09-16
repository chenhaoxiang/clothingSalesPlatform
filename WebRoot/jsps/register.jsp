<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>唯依网注册</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">

<link rel="shortcut icon" href="resources/images/favicon.ico" />

<link href="resources/style/style.css" rel="stylesheet" type="text/css" />

<script type="text/javascript" src="resources/js/jquery.js"></script>
<script type="text/javascript"
	src="resources/js/jquery.i18n.properties-1.0.9.js"></script>
<script type="text/javascript"
	src="resources/js/jquery-ui-1.10.3.custom.js"></script>
<script type="text/javascript" src="resources/js/jquery.validate.js"></script>
<script type="text/javascript" src="resources/js/page_regist.js?lang=zh"></script>

<script type="text/javascript">
  		var path = "<c:url value='/'/>";
</script>

</head>
<body class="loginbody">
	<div class="dataEye">
		<div class="loginbox registbox">
			<div class="logo-a">
				<h1>
					<a href='<c:url value="/index.jsp"></c:url>'> <font color="red">唯&nbsp;依&nbsp;网</font>
					</a>
				</h1>
			</div>
			<div class="login-content reg-content">
				<div class="loginbox-title">
					<h3>注册</h3>
				</div>
				<form id="signupForm">
					<div class="login-error"></div>
					<div class="row">
						<label class="field" for="email">注册邮箱</label> <input type="text"
							value="" class="input-text-user noPic input-click" name="email"
							id="email">
					</div>

					<div class="row">
						<label class="field" for="name">用户名</label> <input type="text"
							value="" class="input-text-user noPic input-click" name="name"
							id="name">
					</div>

					<div class="row">
						<label class="field" for="password">密码</label> <input
							type="password" value=""
							class="input-text-password noPic input-click" name="password"
							id="password">
					</div>
					<div class="row">
						<label class="field" for="passwordAgain">确认密码</label> <input
							type="password" value=""
							class="input-text-password noPic input-click"
							name="passwordAgain" id="passwordAgain">
					</div>
					<script type="text/javascript">
						/*
						var url = "agreement.jsp"; //转向网页的地址;
						var name = _name; //网页名称，可为空;
						var iWidth = 610; //弹出窗口的宽度;
						var iHeight = 600; //弹出窗口的高度;
						//获得窗口的垂直位置
						var iTop = (window.screen.availHeight - 30 - iHeight) / 2;
						//获得窗口的水平位置
						var iLeft = (window.screen.availWidth - 10 - iWidth) / 2;
						var params = 'width=' + iWidth + ',height=' + iHeight
								+ ',top=' + iTop + ',left=' + iLeft
								+ ',channelmode=yes'//是否使用剧院模式显示窗口。默认为 no
								+ ',directories=yes'//是否添加目录按钮。默认为 yes
								+ ',fullscreen=no' //是否使用全屏模式显示浏览器
								+ ',location=no'//是否显示地址字段。默认是 yes
								+ ',menubar=no'//是否显示菜单栏。默认是 yes
								+ ',resizable=no'//窗口是否可调节尺寸。默认是 yes
								+ ',scrollbars=yes'//是否显示滚动条。默认是 yes
								+ ',status=yes'//是否添加状态栏。默认是 yes
								+ ',titlebar=yes'//默认是 yes
								+ ',toolbar=no'//默认是 yes
						;
						*/
					</script>
					<div class="row tips">
						<input type="checkbox" id="checkBox"> <label>
							我已阅读并同意 <a href='<c:url value="agreement.jsp"></c:url>' target="_black">唯一网隐私政策、服务条款</a> </label>
					</div>
					<div class="row btnArea">
						<a class="login-btn" id="submit">注册</a>
					</div>
					
				</form>
			</div>
			<div class="go-regist">
				已有帐号,请<a href="#" class="link">登录</a>
			</div>
		</div>

		<div id="footer">
			<div class="dblock">
				<div class="inline-block copyright">
					<p>
						<a href="#">关于我们</a> | <a href="#">微博</a> | <a href="#">隐私政策</a> |
						<a href="#">人员招聘</a>
					</p>
					<p>&nbsp;&nbsp;&nbsp;&nbsp; © 2013 唯依网</p>
				</div>
			</div>
		</div>
	</div>
	<div class="loading">
		<div class="mask">
			<div class="loading-img">
				<img src="resources/images/loading.gif" width="31" height="31">
			</div>
		</div>
	</div>
</body>
</html>

