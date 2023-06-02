<%--
  Created by IntelliJ IDEA.
  User: liusu
  Date: 2023/6/3
  Time: 2:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加订单</title>
</head>
<body>

<%
  String orderID = request.getParameter("orderID");
%>
<form action="traineeFunction/insertComments?orderID=<%=orderID%>" method="POST">
  <label for="orderRank">订单评级:</label>
  <input type="number" id="orderRank" name="orderRank" value="${orderRank}" />

  <label for="orderDetail">点评详情:</label>
  <input type="text" id="orderDetail" name="orderDetail" value="${orderDetail}" />

  <!-- 提交按钮 -->
  <input type="submit" value="提交">
</form>

</body>
</html>
