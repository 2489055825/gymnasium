<%--
  Created by IntelliJ IDEA.
  User: liusu
  Date: 2023/6/3
  Time: 5:30
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
    <title>教练的健身课程界面</title>
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
        <li class="active"><a href="myCourse">我的健身课程</a></li>
        <li ><a href="myTraineeDiary">察看学员健身日记</a></li>
    </ul>

</nav>
<div class="row">
    <div class="col-md-12">
        <legend class="text-center">我的课程</legend>
        <table class="table table-bordered table-striped">
            <tr><th>课程ID</th><th>课程名</th><th>课程时长</th><th>健身目的</th><th>课程介绍</th>
                <th>删除</th></tr>
            <c:forEach var="course" items="${courseList}">
            <tr>
                <td>${course.courseID}</td>
                <td>${course.courseName}</td>
                <td>${course.courseHour}</td>
                <td>${course.purpose}</td>
                <td>${course.courseIntroduction}</td>
                <%--                --%>
                <%--                <td><a href="#">--%>
                <%--                    <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>--%>
                <%--                    修改 </a></td>--%>
                <td>
                    <a href="deleteCourse?courseID=${course.courseID}">
                    <span class="glyphicon glyphicon-minus" aria-hidden="true"></span>删除
                    </a>
                </td>
            </tr>
            </c:forEach>
        </table>

        <br/>
        <div class="form-group">
            <div class="col-sm-offset-5 col-sm-5" >
                <a href="<c:url value="/coachPage-insertCourse.jsp"/>"><button type="button" class="btn btn-primary">添加课程</button></a>
            </div>
        </div>
        <br/>
        <br/><br/>
    </div>
</div>
</body>
</html>
