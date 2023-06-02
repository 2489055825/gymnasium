<%@ page import="jmu.ss.entity.Trainee" %><%--
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
    <title>学员首页</title>
</head>
<body>
首页显示学员信息,然后侧边栏切换再切换到其他页面,如果该信息为空,显示为待添加
<h6>${trainee.name}</h6>
<h6>${trainee.age}</h6><!--使用这种方式进行访问-->
<h6>${trainee.toString()}</h6>
<%--<%--%>
<%-- String trainee = request.getParameter("trainee");--%>
<%--%>--%>
<%--<h6> <%=trainee%></h6>--%>
<a href="myDiary"><button>访问我的日记界面</button></a>
<a href="myComments"><button>访问我的点评界面</button></a>
<a href="courseBooking"><button>访问课程预订界面</button></a>
<a href="myOrders"><button>访问我的订单界面</button></a>
<a href="<c:url value="/traineePage-updateInformation.jsp"/>"><button>修改信息</button></a>
</body>
</html>
