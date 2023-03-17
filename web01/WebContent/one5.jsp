<%@page import="multi.GradeVO"%>
<%@page import="multi.GradeDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id"); 
    	
    	GradeDAO dao = new GradeDAO();
    	GradeVO bag2 = dao.one(id);
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
당신이 검색을 원하는 영화 id는 <%= id %>
<hr color="red">
 <table class="table table-striped table-hover">
 	<tr>
 		<td>id</td>
 		<td><%= bag2.getId() %></td>
 	</tr>
 	<tr>
 		<td>subject</td>
 		<td><%= bag2.getSubject() %></td>
 	</tr>
 	<tr>
 		<td>score</td>
 		<td><%= bag2.getScore() %></td>
 	</tr>
 	<tr>
 		<td>name</td>
 		<td><%= bag2.getName() %></td>
 	</tr>
 	<tr>
 		<td>img</td>
 		<td><img src="subject/<%=bag2.getImg()%>" width=100 height=100></td>
 	</tr>
 </table>
</body>
</html> 