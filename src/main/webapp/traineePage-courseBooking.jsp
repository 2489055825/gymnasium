<%--
  Created by IntelliJ IDEA.
  User: liusu
  Date: 2023/6/3
  Time: 3:54
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
    <title>课程预订</title>
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
        <li><a href="traineePage-home.jsp">学员信息</a></li>
        <li><a href="traineePage-myDiary.jsp">健身日记</a></li>
        <li><a href="traineePage-comments.jsp">我的点评</a></li>
        <li><a href="traineePage-myOrders.jsp">我的订单</a></li>
        <li class="active"><a href="trainPage-courseBooking.jsp">课程预定</a></li>
    </ul>

</nav>

<div class="row">


    <div class="col-md-12">
        <legend class="text-center">课程预订</legend>

        <table class="table table-bordered table-striped">
            <tr><th>课程ID</th><th>课程名</th><th>教练ID</th><th>课程时长</th><th>课程目的</th>
                <th>课程介绍</th><th>预订</th></tr>
            <c:forEach var="course" items="${courseList}">
            <tr>
                <td>${course.courseID}</td>
                <td>${course.courseName}</td>
                <td>${course.coachID}</td>
                <td>${course.courseHour}</td>
                <td>${course.purpose}</td>
                <td>${course.courseIntroduction}</td>
                <td>
                    <a href="insertOrders?courseID=${course.courseID}">
                    <span class="glyphicon glyphicon-minus" aria-hidden="true"></span>预订
                    </a>
                </td>
            </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
