<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int count = (Integer)session.getAttribute("count"); //100
	count++;
	session.setAttribute("count", count); //101
%>
현재 설정되어 있는 카운트 ${count}
</body>
</html>