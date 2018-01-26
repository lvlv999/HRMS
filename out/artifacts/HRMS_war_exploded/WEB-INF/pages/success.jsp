<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/1/25
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title></title>
</head>
<body>
欢迎,${sessionScope.user.u_name}<br/>
<a href="getResume">查看简历</a>
</body>
</html>
