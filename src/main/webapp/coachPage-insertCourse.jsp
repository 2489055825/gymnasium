<%--
  Created by IntelliJ IDEA.
  User: liusu
  Date: 2023/6/3
  Time: 5:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增健身课程</title>
</head>
<body>

<form id="courseForm" action="coachFunction/insertCourse" method="post">

  <label for="courseName">课程名字:</label>
  <input type="text" id="courseName" name="courseName" value="${courseName}" />

  <label for="courseHour">课时:</label>
  <input type="number" id="courseHour" name="courseHour" value="${courseHour}" />

  <label for="purpose">健身目的:</label>
  <input type="text" id="purpose" name="purpose" value="${purpose}" />

  <label for="courseIntroduction">课程介绍:</label>
  <input type="text" id="courseIntroduction" name="courseIntroduction" value="${courseIntroduction}" />

  <button type="submit">更新</button>
</form>

</body>
</html>
