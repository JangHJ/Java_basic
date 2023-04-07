<%@page import="com.multi.mvc300.MemberVO"%>
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
<h2>멤버 전체검색</h2>
<table>
<tr id="t1">
<th>id</th>
<th>pw</th>
<th>name</th>
<th>tel</th>
</tr>

<!-- 
<% 
	List<MemberVO> list = (List<MemberVO>)request.getAttribute("list");
    for(MemberVO bag: list){
%>
<tr>
	<td class="down"><%= bag.getId() %></td>
	<td class="down"><%= bag.getPw() %></td>
	<td class="down"><%= bag.getName() %></td>
	<td class="down"><%= bag.getTel() %></td>
</tr>
<% } %>
 -->

<c:forEach var="bag" items="${list}">
<tr>
<td><a href="one?id=${bag.id}">${bag.id}</a></td>
<td>${bag.pw}</td>
<td>${bag.name}</td>
<td>${bag.tel}</td>
</tr>
</c:forEach>

</table>
</body>
</html>