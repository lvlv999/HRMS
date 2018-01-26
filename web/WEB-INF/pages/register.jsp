<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/1/25
  Time: 19:41
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
<form action="register" method="post">
    账号：<input name="u_name"><br/>
    密码：<input type="password" name="u_pass"><br/>
    确认密码：<input type="password" name="pass1"><br/>
    <input type="submit" value="立即注册">
</form>
</body>
</html>
