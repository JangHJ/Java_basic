<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
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

textarea {
	resize: none;
	row: 30px;
	col: 15px;
}

hr {
	color: white;
}
</style>
<body>
	<table>
		<tr>
			<td colspan="2" align="center">댓글 ${list.size()}개</td>
		</tr>
		<!-- for-each를 이용해 댓글 목록을 프린트 -->
		<c:forEach items="${list}" var="bag">
			<tr>
				<td>${bag.content}</td>
				<td>작성자 : ${bag.writer}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>