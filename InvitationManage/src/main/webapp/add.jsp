<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Calendar" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<form action="${pageContext.request.contextPath }/inv/add">
<table class="providerTable" cellpadding="0" cellspacing="0" border="1px" class="text-center">
        <tr>
           添加回复
        </tr>
    <td>回复内容</td><td><input type="text" name="content"></td>
        <tr>
            <td>昵称：</td><td><input type="text" name="author"></td>
        </tr>
    <tr>
    <input type="date" name="createDate"  value="<%=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime())%>" ></tr>
   <tr>
    <input type="submit" value="提交">
    <input type="button" value="返回" href="${pageContext.request.contextPath }/inv/main">
   </tr>
</table>
></form>
</body>
</html>
