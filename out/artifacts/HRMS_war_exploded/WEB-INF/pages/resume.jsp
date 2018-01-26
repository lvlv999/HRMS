<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/1/26
  Time: 10:02
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
    <title>简历页面</title>
</head>
<body>
<form method="post" action="updateResume">
    <table>
        <tr><td>姓名:<input name="r_name" value="${sessionScope.resume.r_name}"></td></tr>
        <tr><td>年龄:<input name="r_age" value="${sessionScope.resume.r_age}"></td></tr>
        <tr><td>性别:<input name="r_sex" value="${sessionScope.resume.r_sex}"></td></tr>
        <tr><td>学历:<input name="r_education" value="${sessionScope.resume.r_education}"></td></tr>
        <tr><td>专业:<input name="r_major" value="${sessionScope.resume.r_major}"></td></tr>
        <tr><td>电话:<input name="r_phone" value="${sessionScope.resume.r_phone}"></td></tr>
        <tr><td>地址:<input name="r_address" value="${sessionScope.resume.r_address}"></td></tr>
    </table>
        <input type="hidden" name="r_id" value="${sessionScope.resume.r_id}">
        <input type="hidden" name="u_id" value="${sessionScope.resume.u_id}">
    <input type="submit" value="修改">
    <a href="goResume">添加</a>
</form>
</body>
</html>
