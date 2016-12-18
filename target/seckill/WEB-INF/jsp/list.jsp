<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="common/tag.jsp" %>

<html>
   <head>
      <title>秒杀详情页</title>
      <%@include file="common/head.jsp" %>
   </head>
   <body>
     <table class="table table-hover">
  <caption>秒杀详情页</caption>
  <thead>
    <tr>
      <th>名称</th>
      <th>库存</th>
      <th>开始时间</th>
      <th>结束时间</th>
      <th>创建时间</th>
      <th>详情页</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach var="sk" items="${list}">
   <tr>
      <td>${sk.name}</td>
      <td>${sk.number}</td>
      <td><fmt:formatDate value="${sk.startTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
      <td><fmt:formatDate value="${sk.endTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
      <td><fmt:formatDate value="${sk.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
      <td><a  class="btn btn-default" href="/seckill/${sk.seckillId}/detail">秒杀详情</a></td>
      
    </tr>
  
  </c:forEach>
   
  
  </tbody>
</table>
   </body>
   
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
   
</html>