<%--
  Created by IntelliJ IDEA.
  User: liusu
  Date: 2023/5/27
  Time: 23:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<div class="form-container">
    <h2>用户登录</h2>
    <form action="signAndLogin/login" method="post" >
        <div class="form-group">
            <label for="account">账号:</label>
            <input type="text" id="account" name="account" required>
        </div>
        <div class="form-group">
            <label for="password">密码:</label>
            <input type="password" id="password" name="password" required>
        </div>
        <div class="form-group">
            <button type="submit">登录</button>
        </div>
    </form>
</div>
</body>
</html>
