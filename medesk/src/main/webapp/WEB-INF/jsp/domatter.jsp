<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../jsp/common/head.jsp"%>

<div class="right">
	<div class="location">
		<span>刷新</span>
	</div>
		<div class="right">
			<table class="providerTable" cellpadding="0" cellspacing="0" border="1px">
				<tr class="firstTr text-center">
					<th width="20%">事项</th>
					<th width="20%">时间</th>
					<th width="20%">处理人</th>
					<th width="20%">处理操作</th>
					<th width="20%">处理意见</th>
				</tr>
				<c:forEach var="backlog" items="${backlogsEntities}" varStatus="status">
					<tr>
						<td>
							<span>${backlog.matter.matter }</span>
						</td>
						<td>
							<span>${backlog.dotime }</span>
						</td>
						<td>
							<span>${backlog.dopeople }</span>
						</td>
						<td>
							<span>${backlog.operation.operation }</span>
						</td>
						<td>
							<span>${backlog.suggestion }</span>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
  </div>
</section>

<!--点击删除按钮后弹出的页面-->
<div class="zhezhao"></div>
<div class="remove" id="removeBi">
    <div class="removerChid">
        <h2>提示</h2>
        <div class="removeMain">
            <p>你确定要删除该订单吗？</p>
            <a href="#" id="yes">确定</a>
            <a href="#" id="no">取消</a>
        </div>
    </div>
</div>

<%@include file="../jsp/common/foot.jsp" %>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/billlist.js"></script>