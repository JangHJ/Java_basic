<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<style>
body {
	text-align: center;
	background: lightblue;
}
button {
	border: none;
	margin: 5px 5px;
	background-color: #008CBA;
	color: white;
	font-size: 20px;
	border-radius: 6px;
	text-align: center;
} /* Blue */
button:hover {
    background-color:#17598f;
    transition: 0.5s;
 }
</style>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<img src="resources/img/product.jpg" width=300 align="center")><br>
<% if(session.getAttribute("id") != null){ %>
	<a href="bbb"><button>공동구매 참여</button></a>
<%}else{%>
	로그인이 필요합니다 <a href="login.jsp"><button>로그인페이지로</button></a>
<%} %>
</body>
</html>