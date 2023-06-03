<%--
  Created by IntelliJ IDEA.
  User: liusu
  Date: 2023/5/27
  Time: 23:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>管理员首页--会员管理</title>
</head>
<body>
这是管理员首页,显示所有的注册会员
<c:forEach var="trainee" items="${traineeList}">
    <!-- 在这里使用diary对象的属性进行展示 -->
    <h6>${trainee.toString()}</h6>
</c:forEach>

<a href="deleteTrainee?traineeID=13"><button>删除traineeID=13的会员</button></a>

</body>
</html>
