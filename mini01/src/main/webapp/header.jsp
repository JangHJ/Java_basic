<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<style>
nav {
	font-size: 15pt;
	font-family: 'PT Sans', Arial, Sans-serif;
	position: relative;
}

nav ul {
	padding: 0;
	margin: 0 auto;
	width: auto;
}

nav li {
	
}

nav a {
	line-height: 50px;
	height: 50px;
}

nav li a {
	box-sizing: border-box;
	-moz-box-sizing: border-box;
	-webkit-box-sizing: border-box;
}

nav li:last-child a {
	border-right: 0;
}

nav a:hover, nav a:active {
	
}

nav a#pull {
	display: none;
}

html {
	-webkit-touch-callout: none;
	-webkit-user-select: none;
	-webkit-tap-highlight-color: rgba(0, 0, 0, 0);
}

ul {
	/*list-style-type: none;*/
	margin: 0;
	padding: 0;
	background-color: #FFFFFF;
	text-align: center;
}

li {
	/*position: relative;*/
	display: inline-block;	
}

li a {
	color: #000000; /*메뉴 색깔 검정색*/
	font-weight: bolder;
	text-align: center;
	padding: 14.5px 100px;
	text-decoration: none;
}

li a:hover {
	/*color: #597812;*/
	color: #FFD400;
	font-weight: bolder;
	font-weight: normal;
}

.menu {
	width: 5000px;
	height: 50px;
	text-align: center;
	max-width: 100%;
	background-position: center;
	background-size: cover;
	background-color: #FFFFFF;
	color: white;
	position: absolute;
	z-index: 1;
}
</style>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>LOGO</h1>
	<div class="menu">
		<nav class="clearfix">
			<ul class="clearfix">
				<li><a class="menuLink" href="perform.html">공연</a></li>
				<li><a class="menuLink" href="list">축제</a></li>
				<li><a class="menuLink" href="search.html">태그검색</a></li>
				<li><a class="menuLink" href="service.html">고객센터</a></li>
			</ul>
			<a id="pull" href="#"></a>
		</nav>
	</div>


</body>
</html>