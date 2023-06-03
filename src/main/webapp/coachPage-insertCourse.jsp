<%--
  Created by IntelliJ IDEA.
  User: liusu
  Date: 2023/6/3
  Time: 5:43
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
  <title>新增健身课程</title>
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
    <legend class="text-center">添加课程</legend>
    <form class="form-horizontal" action="coachFunction/insertCourse" method="post">
      <div class="form-group">
        <label for="courseName" class="col-sm-3 control-label">课程名</label>
        <div class="col-sm-9">
          <input type="text" class="form-control" id="courseName" name="courseName" placeholder="null">
        </div>
      </div>
      <div class="form-group">
        <label for="courseHour" class="col-sm-3 control-label">课时</label>
        <div class="col-sm-9">
          <input type="text" class="form-control" id="courseHour" name="courseHour" placeholder="null">
        </div>
      </div>
      <div class="form-group">
        <label for="purpose" class="col-sm-3 control-label">健身目的</label>
        <div class="col-sm-9">
          <input type="text" class="form-control" id="purpose" name="purpose" placeholder="null">
        </div>
      </div>



      <br/>
      <form class="form-horizontal" style="margin-left: 50px;">

        <div class="form-group" style="margin-left: 50px;">
          <label for="courseIntroduction">课程介绍</label>
          <input type="text" class="form-control" id="courseIntroduction" name="courseIntroduction" placeholder="null">
        </div>


        <br/>
        <div class="form-group">
          <div class="col-sm-offset-5 col-sm-5" >
            <button type="submit" class="btn btn-primary">确认添加课程</button>
          </div>
        </div>
      </form>


    </form>

  </div>
  <div class="col-md-3"></div>
</div>


</body>
</html>
