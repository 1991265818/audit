<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<table class="providerTable" cellpadding="0" cellspacing="0" border="1px" class="text-center">
    <tr><h2>回复列表</h2></tr>
    <tr><a href="../add.jsp">添加回复</a><a href="${pageContext.request.contextPath }/inv/main">返回贴子列表</a></tr>
    <tr class="firstTr">
        <th width="20%">回复内容</th>
        <th width="20%">回复昵称</th>
        <th width="20%">发布时间</th>
    </tr>
    <c:forEach var="rep" items="${reps }" varStatus="status">
        <tr>
            <td>
                <span>${rep.content }</span>
            </td>
            <td>
                <span>${rep.author }</span>
            </td>
            <td>
                <span>${rep.createDate }</span>
            </td>
        </tr>
        <tr><h3>${result }</h3></tr>
    </c:forEach>
</table>
</body>
</html>
