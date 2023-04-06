<%@page import="com.multi.mvc300.BbsVO"%>
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
	<a href="bbs.jsp"><button>처음페이지로</button></a>
	<a href="list2.multi"><button>게시물 전체 목록페이지</button></a>
	<hr color="red">
	<%
		//세션에서 값을 꺼내는 방법 
	String id = (String) session.getAttribute("id");
	//모델에서 값을 꺼내는 방법 
	//model.addAttribute("bag", bag);
	BbsVO bag = (BbsVO) request.getAttribute("bag");
	String writer = bag.getWriter();
	if (id != null) {
		if (id.equals(writer)) {
	%>
	<a href="update2.multi">
		<button style="background: pink;">수정</button>
	</a>
	<a href="delete2.multi?no=${bag.no}">
		<button style="background: pink;">삭제</button>
	</a>
	<%
		}
	}
	%>
	<h2>게시판 검색</h2>
	<table>
		<tr id="t1">
			<th>title</th>
			<th>content</th>
			<th>writer</th>
		</tr>
		<tr>
			<td>${bag.title}</td>
			<td>${bag.content}</td>
			<td>${bag.writer}</td>
		</tr>
	</table>
</body>
</html>