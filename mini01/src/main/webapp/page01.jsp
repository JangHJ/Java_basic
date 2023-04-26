<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<style>
#menu {
	heigth: 50px;
	width: 1170px;
	margin: 0 auto;
}

#menu ul li{
	list-style: none;
	color: #4f4f4f;
	background-color: white;
	float: left;
	line-height: 35px;
	vertical-align: middle;
	text-align: center;
}

#menu .menuLink{
	text-decoration: none;
	color: #4f4f4f;
	display: block;
	width: 150px;
	font-size: 13px;
	font-weight: bold;
	font-family: verdana;
}

#menu .menuLink:hover{
	color: white;
	background-color: #4f4f4f;
}

#menu .selected{
	text-decoration: none;
	border-bottom: 1px solid #4f4f4f;
	background-color: #4f4f4f;
	color: white;
	display: block;
	width: 150px;
	font-size: 13px;
	font-weight: bolder;
	
}
</style>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
</head>
<body>
	<div id="menu">
	<h1>LOGO</h1>
		<ul>
			<li><a class="menuLink" href="perform.html">공연</a></li>
			<li><a class="menuLink" href="list">축제</a></li>
			<li><a class="menuLink" href="search.html">태그검색</a></li>
			<li><a class="menuLink" href="service.html">고객센터</a></li>
		</ul>
	</div>
	<br>
	<div id="result"></div>
</body>
</html>