<%--
  Created by IntelliJ IDEA.
  User: liusu
  Date: 2023/6/3
  Time: 4:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>教练信息修改界面</title>
</head>
<body>

<form id="coachForm" action="coachFunction/updateCoach" method="post">
  <input type="hidden" name="traineeID" value="${coachID}" />

  <label for="name">名字:</label>
  <input type="text" id="name" name="name" value="${name}" />

  <label for="sex">性别:</label>
  <select id="sex" name="sex">
    <option value="男" ${sex == '男' ? 'selected' : ''}>男</option>
    <option value="女" ${sex == '女' ? 'selected' : ''}>女</option>
  </select>

  <label for="age">年龄:</label>
  <input type="number" id="age" name="age" value="${age}" />

  <label for="personIntroduction">个人介绍:</label>
  <input type="text" id="personIntroduction" name="personIntroduction" value="${personIntroduction}" />

  <button type="submit">更新</button>
</form>


</body>
</html>
