<%--
  Created by IntelliJ IDEA.
  User: liusu
  Date: 2023/6/2
  Time: 20:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>健身日记界面</title>
</head>
<body>
<c:forEach var="diary" items="${diaryList}">
    <!-- 在这里使用diary对象的属性进行展示 -->
    <h6>${diary.toString()}</h6>
</c:forEach>
<a href="deleteDiary?diaryID=1"><button>删除id为1的日记</button></a>
<a href="updateDiary?diaryID=2"><button>修改id为2的日记</button></a>
<c:forEach var="course" items="${courseList}">
    <h6>${course.toString()}</h6>
</c:forEach>
<a href="insertDiaryPage"><button>访问新增日记界面</button></a>
</body>
</html>
