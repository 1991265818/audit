<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../jsp/common/head.jsp"%>

<div class="right">
	<form method="get" action="${pageContext.request.contextPath }/queryInforAction" id="formId" >
        <div class="location" style="height: 40px;">
			<span><a onclick="document:formId.submit()"><img src="${pageContext.request.contextPath }/webapp/WEB-INF/static/images/schu.png" alt="删除" title="删除" style=""/>删除</a></span>
			<span><a onclick="document:formId.submit()"><img src="${pageContext.request.contextPath }/webapp/WEB-INF/static/images/y.png" alt="标为已读" title="标为已读" style="height: 20px;width: 20px;"/>标为已读</a></span>
				<span style="float: right;margin-right: 100px;"><input  class="query" name="query" type="text" placeholder="请输入关键字按回车进行查询">
				<a onclick="document:formId.submit()"><img src="${pageContext.request.contextPath }/webapp/WEB-INF/static/images/search.png" alt="查询" title="查询" style="height: 20px;width: 20px;"/>查询</a></span>
				</span>
		</div>
	<!--供应商操作表格-->
        <table class="providerTable" cellpadding="0" cellspacing="0" border="1px">
            <tr class="firstTr">
				<th width="10%" class="text-center"><input type="checkbox"  name="category" /></th>
                <th width="15%">消息类型</th>
                <th width="50%">内容</th>
                <th width="10%">发送者</th>
                <th width="15%">发送时间</th>
            </tr>
            <c:forEach var="infor" items="${inforList }" varStatus="status">
				<tr>
					<td>
						<span><input type="checkbox"  name="category"  /></span>
					</td>
					<td>
					<span>${infor.infotype }</span>
					</td>
					<td>
					<span>${infor.content }</span>
					</td>
					<td>
					<span>${infor.sendpeople}</span>
					</td>
					<td>
					<span>${infor.sendtime}</span>
					</td>
				</tr>
			</c:forEach>
        </table>
</form>
    </div>
</section>

<%@include file="../jsp/common/foot.jsp" %>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/providerlist.js"></script>
