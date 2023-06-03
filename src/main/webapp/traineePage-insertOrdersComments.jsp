<%--
  Created by IntelliJ IDEA.
  User: liusu
  Date: 2023/6/3
  Time: 2:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <script type="text/javascript" src="/gymnasium/bootstrap/jquery-3.5.1.js"></script>
  <script type="text/javascript" src="/gymnasium/bootstrap/js/bootstrap.js"></script>
  <link rel="stylesheet" type="text/css" href="/gymnasium/bootstrap/css/bootstrap.css" />
  <meta charset="utf-8">
    <title>添加订单</title>
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
<%
  String orderID = request.getParameter("orderID");
%>
<div class="row">
  <div class="col-md-3"></div>
  <div class="col-md-5">
    <legend class="text-center">订单评价</legend>
    <form class="form-horizontal" action="traineeFunction/insertComments?orderID=<%=orderID%>" method="POST">
      <div class="form-group">
        <label for="orderRank" class="col-sm-3 control-label">评价等级(1-10)</label>
        <div class="col-sm-9">
          <input type="number" class="form-control" id="orderRank" name="orderRank" placeholder="待填写">
        </div>
      </div>

      <div class="form-group">
        <label for="orderDetail" class="col-sm-3 control-label">点评详情:</label>
        <div class="col-sm-9">
          <input type="text" class="form-control" id="orderDetail" name="orderDetail" placeholder="待填写">
        </div>
      </div>

      <br/>
      <div class="form-group">
        <div class="col-sm-offset-5 col-sm-5" >
          <button type="submit" class="btn btn-primary">提交评价</button>
        </div>
      </div>
    </form>

  </div>
  <div class="col-md-3"></div>
</div>
</body>
</html>
