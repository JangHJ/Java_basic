<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body{
	background: white;
}
table{
	font-family: Arial, Helvetica, sans-serif;
  	border-collapse: collapse;
  	width: 100%;
}
td, th {
  border: 1px solid #ddd;
  padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2;}

tr:hover {background-color: #ddd;}

th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #04AA6D;
  color: white;
}
</style>
</head>
<body>
<h2>북마크 검색</h2>
<table>
<tr id="t1">
<th>name</th>
<th>url</th>
<th>img</th>
</tr>
<tr>
<td>${bag.name}</td>
<td>${bag.url}</td>
<td><img src="resources/img/${bag.img}" width=300></td>
</tr>
</table>
<!-- 
검색된 name은 <b>${bag.name}</b><br>
검색된 url은 <b>${bag.url} </b><br>
검색된 img은 <b>${bag.img} </b><br>
 -->
</body>
</html>