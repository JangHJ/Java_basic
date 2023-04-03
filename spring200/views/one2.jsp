<%@page import="com.multi.mvc200.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><%@taglib prefix="c"
	uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background: lightblue;
}
table {
  border-collapse: collapse;
  width: 50%;
}
th, td {
  padding: 8px;
  text-align: left;
  border-bottom: 1px solid #ddd;
}
tr:hover {
	background-color: coral;
}	
textarea{
	resize: none;
	row: 30px;
	col: 15px;
}
hr{
	color: white;
}
</style>
</head>
<body>
	<a href="bbs.jsp">처음페이지로</a>
	<a href="list2.multi">게시물 전체 목록페이지</a>
	<hr>
	게시글 번호 : ${bag.no} <br>
	제목 : <textarea readonly>${bag.title}</textarea><br>
	작성자 : ${bag.writer} <br>
	내용 : ${bag.content} <br>
	<hr>
	댓글달기 <input id="reply" placeholder="댓글 입력하는 란"><button>댓글달기</button>
	<hr>
	<div id="result">
		<!-- for-each를 이용해 댓글 목록을 프린트 -->
		<table>
			<tr>
				<td colspan="3" align="center">댓글 ${list.size()}개</td>
			</tr>
			<c:forEach items="${list}" var="bag">
				<tr>
					<td>${bag.no}</td>
					<td>${bag.content}</td>
					<td>작성자 : ${bag.writer}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>