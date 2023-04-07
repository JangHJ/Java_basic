<%@page import="com.multi.mvc300.BookVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background: white;
}

table {
	font-family: Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #ddd;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #f2f2f2;
}

tr:hover {
	background-color: #ddd;
}

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
	<a href="book.jsp"><button>처음페이지로</button></a>
	<a href="list3"><button>게시물 전체 목록페이지</button></a>
	<hr color="red">
	<%
	//세션에서 값을 꺼내는 방법 
	String id = (String) session.getAttribute("id");
	//모델에서 값을 꺼내는 방법 
	//model.addAttribute("bag", bag);
	BookVO bag = (BookVO) request.getAttribute("bag");
	%>
	
	<h2>게시판 검색</h2>
	<table>
		<tr id="t1">
			<th>name</th>
			<th>url</th>
			<th>img</th>
		</tr>
		<tr>
			<td>${bag.name}</td>
			<td>${bag.url}</td>
			<td>${bag.img}</td>
		</tr>
	</table>
</body>
</html>