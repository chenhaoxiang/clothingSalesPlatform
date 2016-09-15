<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  
  <body>
  	<!-- 测试验证码是否正常 -->
  	真实验证码为:${code}<br/>
  	验证码:<img src='<c:url value='/CodeServlet'></c:url>'>
  </body>
</html>
