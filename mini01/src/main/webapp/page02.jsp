<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script>
	$(function() {
		$("#header").load("header.jsp");
		
		$.ajax({
			url:"one",
			type:"post",
			datatype:"html",
			success:function(data){
				$("#result").html(data);
			}	
		});
		
	})
</script>
<head>
<link rel="stylesheet" href="${path}/resources/css/style.css"/>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<header id="header" class="fixed-top"></header>
	<section><div id="result"></div></section>
</body>
</html>