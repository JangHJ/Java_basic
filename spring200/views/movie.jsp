<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- movie호출했을 때 결과 담는 곳 -->
	<table border=1>
		<tr>
			<th>영화제목</th>
			<th>영화가격</th>
		</tr>
		<tr>
			<td>${vo.title}</td>
			<td>${vo.price}</td>
		</tr>
	</table>
</body>
</html>