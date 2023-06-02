<%--
  Created by IntelliJ IDEA.
  User: liusu
  Date: 2023/5/27
  Time: 23:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>教练首页</title>
</head>
<body>
这是教练首页
<h6>${coach.toString()}</h6>

<a href="myDiary"><button>访问我的日记界面</button></a>
<a href="myComments"><button>访问我的点评界面</button></a>
<a href="courseBooking"><button>访问课程预订界面</button></a>
<a href="myOrders"><button>访问我的订单界面</button></a>
<a href="<c:url value="/coachPage-updateInformation.jsp"/>"><button>修改信息</button></a>
</body>
</html>
