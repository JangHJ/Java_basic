<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body{
	background: #bacee0;
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
a{
	text-decoration-line: none;
}
a:link{
	color: black;
}
a:visited{
	color: darkgray;
}

tr:nth-child(even){background-color: #f2f2f2;}

tr:hover {background-color: #ddd;}

th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #17598f;
  color: white;
}
</style>
</head>
<a href="grade.jsp">처음 페이지</a>
<body>
<h2>성적 전체 검색</h2>
<table>
<tr id="t1">
<th>id</th>
<th>subject</th>
<th>score</th>
<th>name</th>
<th>img</th>
</tr>

<c:forEach var="bag" items="${list}">
<tr>
<td>${bag.id}</td>
<td>${bag.subject}</td>
<td>${bag.score}</td>
<td>${bag.name}</td> <!-- <a href="one4.multi?id=${bag.id}"> -->
<td><img src="resource/img/${bag.img}"></td>
</tr>
</c:forEach>
</table>
</body>
</html>