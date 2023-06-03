<%--
  Created by IntelliJ IDEA.
  User: liusu
  Date: 2023/6/3
  Time: 13:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>员工管理</title>
</head>
<body>
<c:forEach var="coach" items="${coachList}">
  <!-- 在这里使用diary对象的属性进行展示 -->
  <h6>${coach.toString()}</h6>
</c:forEach>
<a href="deleteCoach?coachID=10"><button>删除coachID=10的会员</button></a>
</body>
</html>
