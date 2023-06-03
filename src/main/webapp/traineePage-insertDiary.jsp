<%--
  Created by IntelliJ IDEA.
  User: liusu
  Date: 2023/6/2
  Time: 20:54
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
    <title>增加新的健身日记</title>
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
        <legend class="text-center">新增日记</legend>
        <form class="form-horizontal" style="margin-left: 50px;" action="insertDiary" method="POST">
        <!--        主体内容-->
            <div class="form-group">
                <label for="sex" class="col-sm-3 control-label">身份</label>
                <div class="col-sm-9">
                    <select id="sex" name="sex" class="form-control" style="width:535px; ">
                        <option value="男">男</option>
                        <option value="女">女</option>
                    </select>
                </div>
            </div>
        <br/><br/>

            <div class="form-group">
                <label for="diaryDetail">日记内容</label>
                <input type="text" class="form-control" id="diaryDetail" name="diaryDetail" placeholder="待填写">
            </div>
            <br/>
            <div class="form-group">
                <div class="col-sm-offset-5 col-sm-5" >
                    <button type="submit" class="btn btn-primary">确认添加</button>
                </div>
            </div>
        </form>
        <!--            end内容-->
    </div>
    <div class="col-md-3"></div>
</div>
</body>
</html>
