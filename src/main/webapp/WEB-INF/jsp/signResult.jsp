<%@ page import="org.springframework.ui.Model" %><%--
  Created by IntelliJ IDEA.
  User: liusu
  Date: 2023/5/26
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>注册结果页面</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
%>
    <h1>注册成功</h1>
    <h1>欢迎，${userName}！</h1>
    <h1>两秒后自动跳转到登录页面,登录页面还没写</h1>

<c:if test="${not empty errorMessage}">
    <p>${errorMessage}</p>
</c:if>

</body>
</html>
