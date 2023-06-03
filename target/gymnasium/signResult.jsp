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
    <script type="text/javascript" src="/gymnasium/bootstrap/jquery-3.5.1.js"></script>
    <script type="text/javascript" src="/gymnasium/bootstrap/js/bootstrap.js"></script>
    <link rel="stylesheet" type="text/css" href="/gymnasium/bootstrap/css/bootstrap.css" />
    <meta charset="utf-8">
    <title>注册结果页面</title>
</head>
<body>

<c:if test="${empty errorMessage}">
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-5">
            <legend class="text-center">注册成功，欢迎${userName}！<br/> 2秒后自动跳转到登录页面</legend>
        </div>
        <div class="col-md-3"></div>
    </div>

    <meta http-equiv="refresh" content="2;url=/gymnasium/loginPage.jsp">
</c:if>

<c:if test="${not empty errorMessage}">
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-5">
            <legend class="text-center">注册失败，${errorMessage}<br> 2秒后自动跳转到登录页面！</legend>
        </div>
        <div class="col-md-3"></div>
    </div>
    <meta http-equiv="refresh" content="2;url=/gymnasium/loginPage.jsp">
</c:if>

</body>
</html>
