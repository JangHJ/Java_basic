<%@page import="com.multi.mvc300.BookVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body{
	background: white;
}
table{
	font-family: Arial, Helvetica, sans-serif;
  	border-collapse: collapse;
  	width: 100%;
}
td, th {
  border: 1px solid #ddd;
  padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2;}

tr:hover {background-color: #ddd;}

th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #04AA6D;
  color: white;
}
</style>
</head>
<body>
<h2>게시글 전체검색</h2>
<table>
<tr id="t1">
<th>no</th>
<th>title</th>
<th>content</th>
<th>writer</th>
</tr>

<!-- 
<% 
	List<BookVO> list = (List<BookVO>)request.getAttribute("list");
    for(BookVO bag: list){
%>
<tr>
	<td class="down"><%= bag.getId() %></td>
	<td class="down">
		<a href="one3.id=<%= bag.getId() %>"><%= bag.getName() %></a>
	</td>
	<td class="down"><%= bag.getUrl() %></td>
	<td class="down"><%= bag.getImg() %></td>
</tr>
<% } %>
 -->

<c:forEach var="bag" items="${list}">
<tr>
<td>${bag.id}</td>
<td><a href="one2.multi?no=${bag.id}">${bag.name}</a></td>
<td>${bag.url}</td>
<td>${bag.img}</td>
</tr>
</c:forEach>

</table>
</body>
</html>