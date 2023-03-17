<%@page import="multi.MovieVO"%>
<%@page import="multi.MovieDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id"); 
    	
    	MovieDAO dao = new MovieDAO();
    	MovieVO bag2 = dao.one(id);
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
 		<td>영화 id</td>
 		<td><%= bag2.getId() %></td>
 	</tr>
 	<tr>
 		<td>영화이름</td>
 		<td><%= bag2.getTitle() %></td>
 	</tr>
 	<tr>
 		<td>영화내용</td>
 		<td><%= bag2.getContent() %></td>
 	</tr>
 	<tr>
 		<td>로케이션</td>
 		<td><%= bag2.getLocation() %></td>
 	</tr>
 	<tr>
 		<td>감독</td>
 		<td><%= bag2.getDirector() %></td>
 	</tr>
 </table>
</body>
</html> 