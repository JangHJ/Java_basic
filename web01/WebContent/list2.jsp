<%@page import="java.util.ArrayList"%>
<%@page import="multi.BbsVO"%>
<%@page import="multi.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	  	
    	BbsDAO dao = new BbsDAO();
    //5,6)dao가 리턴한 BbsVO가 들어간 ArrayList를 받는다. 
    	ArrayList<BbsVO> list = dao.list();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<% 
	for(BbsVO bag2: list){
%>

당신이 검색을 원하는 번호는 <%= bag2.getNo() %>
<hr color="red">
 <table class="table table-dark table-striped">
 	<tr>
 		<td>검색한 제목</td>
 		<td><%= bag2.getTitle() %></td>
 	</tr>
 	<tr>
 		<td>검색한 내용</td>
 		<td><%= bag2.getContent() %></td>
 	</tr>
 	<tr>
 		<td>검색한 글쓴이</td>
 		<td><%= bag2.getWriter() %></td>
 	</tr>
 </table>
 <% } %>
</body>
</html>