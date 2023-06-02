<%--
  Created by IntelliJ IDEA.
  User: liusu
  Date: 2023/6/3
  Time: 4:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>我的订单界面</title>
</head>
<body>
<c:forEach var="orders" items="${ordersList}">
    <h6>${orders.toString()}</h6>
</c:forEach>
<a href="deleteOrders?ordersID=4"><button>删除ordersID为4的订单</button></a>
</body>
</html>
