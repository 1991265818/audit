<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/3/18
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form class="user" action="/user/add">

    用户名：<input type="text" id="userName" name="userName"  placeholder="请输入用户名"/>
    密码：<input type="password" id="password" name="password"  placeholder="请输入密码"/>
    身份证：<input type="text" id="card" name="card"  placeholder="请输入身份证号"/>
    地址：<input type="password" id="add" name="add"  placeholder="请输入地址"/>
    <input type="submit"  value="注册">
</form>
</body>
</html>
