<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/1/26
  Time: 13:28
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
    <title>添加简历</title>
</head>
<body>
<form action="addResume" method="post">
    <table>
        <tr>
            <td>姓名:<input name="r_name"></td>
        </tr>
        <tr>
            <td>年龄:<input name="r_age"></td>
        </tr>
        <tr>
            <td>性别:<input name="r_sex"></td>
        </tr>
        <tr>
            <td>学历:<input name="r_education"></td>
        </tr>
        <tr>
            <td>专业:<input name="r_major"></td>
        </tr>
        <tr>
            <td>电话:<input name="r_phone"></td>
        </tr>
        <tr>
            <td>地址:<input name="r_address"></td>
        </tr>
    </table>
    <input type="hidden" name="u_id" value="${sessionScope.user.u_id}">
    <input type="submit" value="保存">
</form>
</body>
</html>
