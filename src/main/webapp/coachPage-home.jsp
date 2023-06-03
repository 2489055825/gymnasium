<%--
  Created by IntelliJ IDEA.
  User: liusu
  Date: 2023/5/27
  Time: 23:22
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
    <title>教练首页</title>
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
    <ul class="nav nav-pills nav-justified">
        <li class="active"><a href="personInformation">教练信息</a></li>
        <li><a href="myCourse">我的健身课程</a></li>
        <li><a href="myTraineeDiary">察看学员健身日记</a></li>
    </ul>
</nav>
<div class="row">
    <div class="col-md-3"></div>
    <div class="col-md-5">
        <legend class="text-center">教练信息</legend>
        <form class="form-horizontal">
            <div class="form-group">
                <label class="col-sm-3 control-label">姓名</label>
                <div class="col-sm-9">
                    <input type="text" class="form-control" value="${coach.name}" placeholder="待填写" readonly>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-3 control-label">性别</label>
                <div class="col-sm-9">
                    <input type="text" class="form-control" value="${coach.sex} placeholder="待填写" readonly>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-3 control-label">年龄</label>
                <div class="col-sm-9">
                    <input type="text" class="form-control" value="${coach.age} placeholder="待填写" readonly>
                </div>
            </div>

            <div class="form-group">
                <label class="col-sm-3 control-label">个人简介</label>
                <div class="col-sm-9">
                    <input type="text" class="form-control" value="${coach.personIntroduction} placeholder="null" readonly>
                </div>
            </div>

            <br/>
            <div class="form-group">
                <div class="col-sm-offset-5 col-sm-5" >
                    <a href="<c:url value="/coachPage-updateInformation.jsp"/>"><button type="button" class="btn btn-primary">修改信息</button></a>
                </div>
            </div>
        </form>
    </div>
    <div class="col-md-3"></div>
</div>
</body>
</html>
