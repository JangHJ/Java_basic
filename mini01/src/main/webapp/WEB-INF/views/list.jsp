<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><%@ taglib prefix="c"
	uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	축제검색이 요청됨!!
	${list.size()}개의 축제가 검색되었습니다.
	<!-- 속성으로 지정한 값은 EL로 프린트 -->
	<table>
		<tr>
			<th>name</th>
			<th>fromdate</th>
			<th>todate</th>
			<th>place</th>
			<th>poster</th>
			<th>genre</th>
		</tr>
		<c:forEach items="${list}" var="vo">
			<tr>
				<td><a href="one3?id=${vo.id}">${vo.name}</a></td>
				<td>${vo.fromdate}</td>
				<td>${vo.todate}</td>
				<td>${vo.place}</td>
				<td><img src=${vo.poster} width=50px height=100px></td>
				<td>${vo.genre}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>