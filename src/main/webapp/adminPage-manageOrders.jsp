<%--
  Created by IntelliJ IDEA.
  User: liusu
  Date: 2023/6/3
  Time: 13:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>订单管理</title>
</head>
<body>
<c:forEach var="orders" items="${ordersList}">
  <!-- 在这里使用diary对象的属性进行展示 -->
  <h6>${orders.toString()}</h6>
</c:forEach>
<a href="deleteOrders?ordersID=1"><button>删除ordersID=1的订单</button></a>
</body>
</html>
