<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><%@ taglib prefix="c"
	uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script>
	$(function() {
		$("#header").load("../../header.jsp");
	})
</script>
<style>
tr {
	width: 500px;
}
</style>
<head>
<link rel="stylesheet" href="${path}/resources/css/style.css" />
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<header id="header" class="fixed-top"></header>
	<div id="str">축제검색이 요청됨!! ${list.size()}개의 축제가 검색되었습니다.</div>
	<br>
	<div id="list1">
		<c:if test="${not empty list}">
			<c:forEach items="${list}" var="vo">
				<div id="item-frame">
					<div id="item-poster">
						<img src=${vo.poster}>
					</div>
					<div id="item-area">${vo.place}</div>
					<div id="item-date">${vo.fromdate}~${vo.todate}</div>
					<div id="item-name" class="bold">${vo.name}</div>
				</div>
			</c:forEach>
		</c:if>
	</div>
</body>
</html>