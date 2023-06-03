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
    <script type="text/javascript" src="/gymnasium/bootstrap/jquery-3.5.1.js"></script>
    <script type="text/javascript" src="/gymnasium/bootstrap/js/bootstrap.js"></script>
    <link rel="stylesheet" type="text/css" href="/gymnasium/bootstrap/css/bootstrap.css" />
    <meta charset="utf-8">
    <title>用户登录</title>
</head>
<body class="container">
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <a class="navbar-brand" href="#">健身房管理系统</a>
        </div>
        <!-- Collect the nav links, forms, and other content for toggling -->

    </div><!-- /.container-fluid -->
</nav>
<div class="row">
    <div class="col-md-3"></div>

    <div class="col-md-5">
        <legend class="text-center">用户登录</legend>
        <form class="form-horizontal" action="/gymnasium/signAndLogin/login" method="post">
            <div class="form-group">
                <label for="account" class="col-sm-3 control-label">账号</label>
                <div class="col-sm-9">
                    <input type="text" class="form-control" id="account" name="account" placeholder="请输入账号">
                </div>
            </div>
            <br/>
            <div class="form-group">
                <label for="password" class="col-sm-3 control-label">密码</label>
                <div class="col-sm-9">
                    <input type="password" class="form-control" id="password" name="password" placeholder="请输入密码">
                </div>
            </div>

            <p class="text-muted text-center"><small>还没有账户？</small><a href="signPage.jsp">点此注册</a>
            </p>

            <br/>
            <div class="form-group">
                <div class="col-sm-offset-5 col-sm-5" >
                    <button type="submit" class="btn btn-primary">登录</button>
                </div>
            </div>
        </form>

    </div>
    <div class="col-md-3"></div>
</div>


<%--<div class="form-container">--%>
<%--    <h2>用户登录</h2>--%>
<%--    <form action="signAndLogin/login" method="post" >--%>
<%--        <div class="form-group">--%>
<%--            <label for="account">账号:</label>--%>
<%--            <input type="text" id="account" name="account" required>--%>
<%--        </div>--%>
<%--        <div class="form-group">--%>
<%--            <label for="password">密码:</label>--%>
<%--            <input type="password" id="password" name="password" required>--%>
<%--        </div>--%>
<%--        <div class="form-group">--%>
<%--            <button type="submit">登录</button>--%>
<%--        </div>--%>
<%--    </form>--%>
<%--</div>--%>
</body>
</html>
