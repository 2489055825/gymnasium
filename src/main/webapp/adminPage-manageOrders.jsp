<%--
  Created by IntelliJ IDEA.
  User: liusu
  Date: 2023/6/3
  Time: 13:43
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
    <title>订单管理</title>
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
        <li class="active"><a href="allTrainee">会员管理</a></li>
        <li><a href="manageCoach">员工管理</a></li>
        <li><a href="manageOrders">订单管理</a></li>
        <li><a href="manageTraineeDiary">日记管理</a></li>
    </ul>

</nav>
<div class="row">


    <div class="col-md-12">
        <legend class="text-center">会员订单</legend>

        <table class="table table-bordered table-striped">
            <tr><th>订单ID</th><th>学员ID</th><th>教练ID</th><th>课程ID</th><th>订单评价等级</th><th>订单详情</th><th>删除</th></tr>
            <c:forEach var="orders" items="${ordersList}">
            <tr>
                <td>${orders.orderID}</td>
                <%--        省略了姓名--%>
                <td>${orders.traineeID}</td>
                <td>${orders.coachID}</td>
                <td>${orders.courseID}</td>
                <td>${orders.orderDetail}</td>
                <td>${orders.orderRank}</td>
                <td><a href="deleteTrainee?ordersID=${orders.orderID}">
                    <span class="glyphicon glyphicon-minus" aria-hidden="true"></span>
                    删除</a></td>
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
