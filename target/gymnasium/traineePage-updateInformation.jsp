<%--
  Created by IntelliJ IDEA.
  User: liusu
  Date: 2023/5/28
  Time: 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>学员信息更新界面</title>
</head>
<body>

<form id="traineeForm" action="traineeFunction/updateTrainee" method="post">
  <input type="hidden" name="traineeID" value="${traineeID}" />

  <label for="name">名字:</label>
  <input type="text" id="name" name="name" value="${name}" />

  <label for="sex">性别:</label>
  <select id="sex" name="sex">
    <option value="男" ${sex == '男' ? 'selected' : ''}>男</option>
    <option value="女" ${sex == '女' ? 'selected' : ''}>女</option>
  </select>

  <label for="age">年龄:</label>
  <input type="number" id="age" name="age" value="${age}" />

  <label for="weight">体重:</label>
  <input type="number" id="weight" name="weight" value="${weight}" />

  <label for="height">身高:</label>
  <input type="number" id="height" name="height" value="${height}" />

  <label for="purpose">健身目的:</label>
  <input type="text" id="purpose" name="purpose" value="${purpose}" />

  <label for="purpose">个人介绍:</label>
  <input type="text" id="personIntroduction" name="personIntroduction" value="${personIntroduction}" />

  <button type="submit">更新</button>
</form>


</body>
</html>
