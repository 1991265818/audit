<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>帖子列表</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/css/bootstrap.min.css"/>
</head>
<body>
<div style="height: 100%;width: 100%;" class="text-center">
    <table class="providerTable" cellpadding="0" cellspacing="0" border="1px" class="text-center">
        <tr style="height: 50px;"><h2>帖子列表</h2></tr>
        <tr>
            <form method="get" action="${pageContext.request.contextPath }/inv/queryInfor">
                帖子标题：<input  name="query" type="text" placeholder="请输入关键字">
                <input type="submit" value="搜索">
            </form>
        </tr>
        <tr class="firstTr">
            <th width="20%">标题</th>
            <th width="20%">内容摘要</th>
            <th width="20%">作者</th>
            <th width="20%">发布时间</th>
            <th width="20%">操作</th>
        </tr>
        <c:forEach var="invitation" items="${invitationis }" varStatus="status">
            <tr>
                <td>
                    <span>${invitation.title }</span>
                </td>
                <td>
                    <span>${invitation.summary }</span>
                </td>
                <td>
                    <span>${invitation.author}</span>
                </td>
                <td>
                    <span>${invitation.createDate}</span>
                </td>
                <td>
                    <span><a href="${pageContext.request.contextPath }/inv/repd?invId=${invitation.id}">查看回复</a>||<a href="${pageContext.request.contextPath }/inv/delete?id=${invitation.id}" h>删除</a></span>
                </td>
            </tr>
            <tr><h3>${result }</h3></tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
