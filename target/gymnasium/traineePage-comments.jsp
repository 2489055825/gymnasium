<%--
  Created by IntelliJ IDEA.
  User: liusu
  Date: 2023/6/3
  Time: 2:05
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
    <title>我的点评</title>
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
        <li><a href="personInformation">学员信息</a></li>
        <li><a href="myDiary">健身日记</a></li>
        <li class="active"><a href="myComments">我的点评</a></li>
        <li><a href="myOrders">我的订单</a></li>
        <li><a href="courseBooking">课程预订</a></li>
    </ul>

</nav>

<div class="row">


    <div class="col-md-12">
        <legend class="text-center">我的点评</legend>

        <table class="table table-bordered table-striped">
            <tr><th>订单ID</th><th>教练名</th><th>课程名</th><th>订单评级</th><th>订单详情</th><th>添加订单评价</th>
                <th>修改</th></tr>
            <c:forEach var="orders" items="${ordersList}">
            <tr>
                <td>${orders.orderID}</td>
                <td>${orders.coachID}</td>
                <td>${orders.courseID}</td>
                <td>${orders.orderRank}</td>
                <td>${orders.orderDetail}</td>
                <td>
                    <a href="/gymnasium/traineePage-insertOrdersComments.jsp?orderID=${orders.orderID}">
                    <span aria-hidden="true"></span>评价
                    </a>
                </td>

                <td>
                    <a href="/gymnasium/traineePage-insertOrdersComments.jsp?orderID=${orders.orderID}">
                    <span aria-hidden="true"></span>修改
                    </a>
                </td>
            </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
