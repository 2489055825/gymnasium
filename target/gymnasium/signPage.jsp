<%--
  Created by IntelliJ IDEA.
  User: liusu
  Date: 2023/5/26
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
<body>
<div class="form-container">
    <h2>用户注册</h2>
    <form action="signAndLogin/sign" method="post">
        <div class="form-group">
            <label for="name">用户名:</label>
            <input type="text" id="name" name="name" required>
        </div>
        <div class="form-group">
            <label for="account">账号:</label>
            <input type="text" id="account" name="account" required>
        </div>
        <div class="form-group">
            <label for="password">密码:</label>
            <input type="password" id="password" name="password" required>
        </div>

        <div class="form-group">
            <label for="identity">密码:</label>
            <input type="text" id="identity" name="identity" required>
        </div>
        <div class="form-group">
            <button type="submit">注册</button>
        </div>
    </form>
</div>
</body>
</body>
</html>
