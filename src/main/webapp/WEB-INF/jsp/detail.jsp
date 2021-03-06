<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="common/tag.jsp" %>
<html>
   <head>
      <title>秒杀列表页</title>
      <%@include file="common/head.jsp" %>
   </head>
   <body>
 <div class="container">
		<div class="panel panel-default text-center">
			<div class="panel-heading"><h1>${seckill.name}</h1></div>
		</div>
		<div class="panel-body">
			<h2 class="text-danger  text-center">
				<span class="glyphicon glyphicon-time"></span>
				<span class="glyphicon" id="seckill-box"></span>
			</h2>
		</div>
	</div>
<!-- 模态框（Modal） -->
<div class="modal fade" id="killPhoneModal"  >
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">秒杀电话</h4>
            </div>
            <div class="modal-body"><input type="text" name="killPhone" id="killPhoneKey"
            placeholder="填手机号" class="form-control"
             /></div>
            <div class="modal-footer">
            	<span id="killPhoneMessage" style="display:block" ></span>
                <button type="button" id="killPhoneBtn" class="btn btn-success" data-dismiss="modal">
	submit
</button>
                <button type="button" class="btn btn-primary">提交更改</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
   </body>
   
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="http://cdn.bootcss.com/jquery.countdown/2.0.2/jquery.countdown.js"></script>
<script src="http://cdn.bootcss.com/jquery-cookie/1.4.1/jquery.cookie.js"></script>
<script src="/resources/script/seckill.js" type="text/javascript"></script>
<script type="text/javascript">
$(function(){
	seckill.detail.init({
	seckillId:${seckill.seckillId},
	startTime:${seckill.startTime.time},
	endTime:${seckill.endTime.time}
	});
});

</script>

   
</html>