<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Calendar" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="../jsp/common/head.jsp"%>
<form method="post" action="${pageContext.request.contextPath }/updatebacklogsAction" class="form-horizontal" role="form" id="myForm" onsubmit="return ">
    <div class="modal fade" id="loginModal"  tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <!--  定义模态框，过渡效果为淡入，id为myModal,tabindex=-1可以禁用使用tab切换，aria-labelledby用于引用模态框的标题，aria-hidden=true保持模态框在触发前窗口不可见  -->
        <div class="modal-dialog">
            <!--  显示模态框对话框模型（若不写下一个div则没有颜色）  -->
            <div class="modal-content">
                <!--  显示模态框白色背景，所有内容都写在这个div里面  -->
                <div class="btn-info modal-header text-center">
                    <h4>您好，请输入你的审核意见</h4>
                    <!--  标题内容  -->
                </div>
                <div class="modal-body">
                    <input type="hidden" value="" name="operationId" id="operationId">
                    <input type="date" name="dotime" id="dotime" value="<%=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime())%>">
                    <input type="hidden" name="dopeople" value="${session.userSession.username}" id="dopeople"/>
                    <input type="hidden" name="blid" value="" id="blid"/>
                    <input type="text" id="suggestion" style="width: 550px;height: 150px;" name="suggestion">
                </div>
                <div class="modal-footer">
                    <!--  模态框底部样式，一般是提交或者确定按钮 -->
                    <button type="submit" class="btn btn-info">确定</button>
                    <button type="button"  class="btn btn-default" data-dismiss="modal" id="cancel">取消</button>
                </div>
            </div>
        </div>
    </div>
</form><input type="hidden" data-target="#loginModal" data-toggle="modal" name="suggestion_sub" id="suggestion_sub" class="form-control  bt-red col-md-4 ">
<div class="right">
     <div class="location">
         <span>待办事项</span>
     </div>
     <div class="providerAdd">

    <div class="son-left">
        <table class="providerTable" cellpadding="0" cellspacing="0" border="1px">
            <tr class="firstTr">
                <th width="100%">待办类型</th>
            </tr>
            <c:forEach var="matter" items="${matters}" varStatus="status">
                <tr>
                    <td>
                        <span><a href="${pageContext.request.contextPath }/matterbacklogsAction?typeid=${matter.typeid}">${matter.matter}</a></span>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
         <div class="son-right">
             <p class="firstTr">处理</p>
             <form>
                 <input type="text" value=""  id="oId" name="oId" class="oId"/>
             <table class="providerTable" cellpadding="0" cellspacing="0" border="1px">
                 <tr class="firstTr">
                     <th width="25%">待办类型</th>
                     <th width="20%">发送人</th>
                     <th width="35%">发送时间</th>
                     <th width="25%">操作</th>
                 </tr>
                 <c:forEach var="backlog" items="${backlogsEntities}" varStatus="status">
                     <tr>
                         <td>
                             <span>${backlog.matter.matter}</span>
                         </td>
                         <td>
                             <span>${backlog.despatcher }</span>
                         </td>
                         <td>
                             <span>${backlog.sendtime }</span>
                         </td>
                         <td>
                             <select name="operation"  class="operation" onchange="myFunction('operation'+${backlog.blid},${backlog.blid})" id="operation${backlog.blid}">
                                 <c:choose>
                                 <c:when test="${backlog.operation.operationid==1}">
                                     <option value="1" selected="selected">同意</option>
                                     <option value="2" >否决</option>
                                     <option value="3" >审核中</option>
                                 </c:when>
                                 <c:when test="${backlog.operation.operationid==2}">
                                     <option value="1" >同意</option>
                                     <option value="2" selected="selected">否决</option>
                                     <option value="3" >审核中</option>
                                 </c:when>
                                 <c:when test="${backlog.operation.operationid==3}">
                                     <option value="1" >同意</option>
                                     <option value="2" >否决</option>
                                     <option value="3" selected="selected">审核中</option>
                                 </c:when>
                                 </c:choose>
                             </select>
                         </td>
                     </tr>
                 </c:forEach>
             </table>
             </form>
         </div>
     </div>
 </div>
</section>
<div class="zhezhao"></div>
<div class="remove" id="removeBi">
    <div class="removerChid">
        <h2>提示</h2>
        <div class="removeMain">
            <p>你确定要修改该事项？</p>
            <a href="#" id="yes">确定</a>
            <a href="#" id="no">取消</a>
        </div>
    </div>
</div>
<%@include file="../jsp/common/foot.jsp" %>
<script type="text/javascript" src="${pageContext.request.contextPath }/webapp/WEB-INF/static/js/backlog.js"></script>
