<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  
  <body>
       <!-- 直接转发请求servlet，带回从数据库查询的数据再转发到另一个页面 -->
  	   <jsp:forward page="/IndexServlet"></jsp:forward>
  </body>
</html>