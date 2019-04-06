<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>审计登录</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/webapp/WEB-INF/static/css/style.css" />
      <link href="${pageContext.request.contextPath }/webapp/WEB-INF/static/css/bootstrap.min.css" rel="stylesheet" />
    <script src="${pageContext.request.contextPath }/webapp/WEB-INF/static/js/jquery-1.12.4.js"></script>
    <script src="${pageContext.request.contextPath }/webapp/WEB-INF/static/js/modal.js"></script>
    <script type="text/javascript">
	/* if(top.location!=self.location){
	      top.location=self.location;
	 } */
    </script>
</head>
<body class="login_bg">
 <form method="post" action="${pageContext.request.contextPath }/loginAction" class="form-horizontal" role="form" id="myForm" onsubmit="return ">
        <div class="modal fade" id="loginModal"  tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <!--  定义模态框，过渡效果为淡入，id为myModal,tabindex=-1可以禁用使用tab切换，aria-labelledby用于引用模态框的标题，aria-hidden=true保持模态框在触发前窗口不可见  -->
            <div class="modal-dialog">
                <!--  显示模态框对话框模型（若不写下一个div则没有颜色）  -->
                <div class="modal-content">
                    <!--  显示模态框白色背景，所有内容都写在这个div里面  -->

                    <div class="btn-info modal-header text-center">
           
                        <h4>您好，欢迎登陆审计系统</h4>
                        <!--  标题内容  -->
                    </div>

                    <div class="modal-body">
                        <!--  模态框内容，我在';此处添加一个表单 -->
                        <form class="form-horizontal" role="form">
                            <div class="form-group">
                                <%--@declare id="uname"--%><label for="uname" class="col-sm-2 control-label">用户名</label>
                                <div class="col-sm-9">
                                    <input type="text" id="userid" name="userid" class="form-control well" placeholder="请输入用户名"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <%--@declare id="upwd"--%><label for="upwd" class="col-sm-2 control-label">密码</label>
                                <div class="col-sm-9">
                                    <input type="password" id="password" name="password" class="form-control well" placeholder="请输入密码"/>
                                </div>
                            </div>
                        </form>
                    </div>

                    <div class="modal-footer">
                        <!--  模态框底部样式，一般是提交或者确定按钮 -->
                        <button type="submit" class="btn btn-info">确定</button>
                        <button type="button"  class="btn btn-default" data-dismiss="modal">取消</button>
                    </div>

                </div><!-- /.modal-content -->
            </div>
        </div> <!-- /.modal -->
    </form>
</div>
<footer class="text-center login_fooot" style="height: 92px; ">
<input type="button" data-target="#loginModal" data-toggle="modal" name="name" class="form-control  bt-red col-md-4 " id="login_btn" value="登录" style="width:10%;position: fixed;bottom: 80px;left: 580px; ">
</footer>
</body>
</html>
