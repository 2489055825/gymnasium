<%--
  Created by IntelliJ IDEA.
  User: liusu
  Date: 2023/5/26
  Time: 11:10
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
    <title>注册页面</title>
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

    <div class="col-md-5" >
        <legend class="text-center" >用户注册</legend>
        <form class="form-horizontal" action="signAndLogin/sign" method="post">
            <div class="form-group">
                <label for="name" class="col-sm-3 control-label">用户名</label>
                <div class="col-sm-9">
                    <input type="text" class="form-control" id="name" name="name" placeholder="请输入用户名">
                </div>
            </div>
            <br/>
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
            <br/>

            <div class="form-group">
                <label for="identity" class="col-sm-3 control-label">身份</label>
                <div class="col-sm-9">
                    <select id="identity" name="identity" class="form-control" style="width:330px; ">
                        <option value="trainee">学员</option>
                        <option value="coach">教练</option>
                    </select>
                </div>
            </div>

            <p class="text-muted text-center"><small>已经有账户了？</small><a href="/gymnasium/loginPage.jsp">点此登录</a>
            </p>

            <br/>
            <div class="form-group">
                <div class="col-sm-offset-5 col-sm-5" >
                    <button type="submit" class="btn btn-primary">注册</button>
                </div>
            </div>
        </form>

    </div>
    <div class="col-md-3"></div>
</div>
</body>
</html>
