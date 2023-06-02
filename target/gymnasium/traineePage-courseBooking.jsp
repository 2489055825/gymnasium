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
    <title>课程预订</title>
</head>
<body>
<c:forEach var="course" items="${courseList}">
  <h6>${course.toString()}</h6>
</c:forEach>

<a href="insertOrders?courseID=1"><button>预订courseID=1的课程</button></a>
</body>
</html>
