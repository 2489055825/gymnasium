<%--
  Created by IntelliJ IDEA.
  User: liusu
  Date: 2023/6/2
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>增加新的健身日记</title>
</head>
<body>

<form action="insertDiary" method="POST">
<%--    <!-- 下拉列表1：教练列表 -->--%>
<%--    <label for="coachSelect">选择教练:</label>--%>
<%--    <select id="coachSelect" name="selectedCoach">--%>
<%--        <c:forEach var="coach" items="${coachList}">--%>
<%--            <option value="${coach.coachID}">${coach.name}</option>--%>
<%--        </c:forEach>--%>
<%--    </select>--%>

    <!-- 下拉列表2：课程列表 -->
    <label for="courseSelect">选择课程:</label>
    <select id="courseSelect" name="selectedCourse">
        <c:forEach var="course" items="${courseList}">
            <option value="${course.courseID}">${course.courseName}</option>
        </c:forEach>
    </select>

    <label for="diaryDetail">日记内容:</label>
    <input type="text" id="diaryDetail" name="diaryDetail" value="${diaryDetail}" />
    <!-- 提交按钮 -->
    <input type="submit" value="提交">
</form>
</body>
</html>
