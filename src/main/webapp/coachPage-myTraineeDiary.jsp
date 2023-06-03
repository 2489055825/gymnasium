<%--
  Created by IntelliJ IDEA.
  User: liusu
  Date: 2023/6/3
  Time: 6:25
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
    <title>查看学员健身日记</title>
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
        <li ><a href="personInformation">教练信息</a></li>
        <li><a href="myCourse">我的健身课程</a></li>
        <li class="active"><a href="myTraineeDiary">察看学员健身日记</a></li>
    </ul>

</nav>
<div class="row">
    <div class="col-md-12">
        <legend class="text-center">我的学员健身日记</legend>
        <table class="table table-bordered table-striped">
            <tr><th>日记ID</th><th>课程ID</th><th>学员ID</th><th>写作日期</th><th>日记详情</th></tr>
            <c:forEach var="diary" items="${diaryList}">
            <tr>
                <td>${diary.diaryID}</td>
                <td>${diary.courseID}</td>
                <td>${diary.traineeID}</td>
                <td>${diary.diaryDate}</td>
                <td>${diary.diaryDetail}</td>
            </tr>
            </c:forEach>
        </table>
        <br/>
        <br/>
        <br/><br/>
    </div>
</div>
</body>
</html>
