<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/3/18
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form class="user" action="/user/login">

        用户名：<input type="text" id="userName" name="userName"  placeholder="请输入用户名"/>
        密码：<input type="password" id="password" name="password" placeholder="请输入密码"/>
    <input type="submit"  value="登陆">
    <a href="add.jsp">注册</a>
</form>
</body>
</html>
