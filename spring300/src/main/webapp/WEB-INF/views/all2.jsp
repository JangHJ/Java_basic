<%@page import="com.multi.mvc300.BbsVO"%>
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
	List<BbsVO> list = (List<BbsVO>)request.getAttribute("list");
    for(BbsVO bag: list){
%>
<tr>
	<td class="down"><%= bag.getNo() %></td>
	<td class="down">
		<a href="one2.no=<%= bag.getNo() %>"><%= bag.getTitle() %></a>
	</td>
	<td class="down"><%= bag.getContent() %></td>
	<td class="down"><%= bag.getWriter() %></td>
</tr>
<% } %>
 -->

<c:forEach var="bag" items="${list}">
<tr>
<td>${bag.no}</td>
<td><a href="one2.multi?no=${bag.no}">${bag.title}</a></td>
<td>${bag.content}</td>
<td>${bag.writer}</td>
</tr>
</c:forEach>

</table>
</body>
</html>