<%--
  Created by IntelliJ IDEA.
  User: liusu
  Date: 2023/6/3
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>日记管理</title>
</head>
<body>

<c:forEach var="diary" items="${diaryList}">
  <!-- 在这里使用diary对象的属性进行展示 -->
  <h6>${diary.toString()}</h6>
</c:forEach>
<a href="deleteDiary?diaryID=1"><button>删除diaryID=1的日记</button></a>

</body>
</html>
