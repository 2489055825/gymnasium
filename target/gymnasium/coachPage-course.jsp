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
    <title>教练的健身课程界面</title>
</head>
<body>
<c:forEach var="course" items="${courseList}">
  <!-- 在这里使用diary对象的属性进行展示 -->
  <h6>${course.toString()}</h6>
</c:forEach>
<a href="<c:url value="/coachPage-insertCourse.jsp"/>"><button>访问新增健身课程界面</button></a>
</body>
</html>
