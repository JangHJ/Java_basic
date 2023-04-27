<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<style>
</style>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script>
	$(function() {
		$("#header").load("header.jsp");
		$("#result").append("hello!");
	})
</script>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<header id="header" class="fixed-top"></header>
	<div id="result"></div>
</body>
</html>