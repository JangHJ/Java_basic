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
			<th>cnt</th>
			<th>chartr</th>
			<th>sido</th>
			<th>gugun</th>
			<th>opende</th>
		</tr>
		<c:forEach items="${list}" var="vo">
			<tr>
				<td>${vo.name}</a></td>
				<td>${vo.cnt}</td>
				<td>${vo.chartr}</td>
				<td>${vo.sido}</td>
				<td>${vo.gugun}</td>
				<td>${vo.opende}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>