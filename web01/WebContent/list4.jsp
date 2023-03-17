<%@page import="java.util.ArrayList"%>
<%@page import="multi.MovieVO"%>
<%@page import="multi.MovieDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	MovieDAO dao = new MovieDAO();
	//5,6)dao가 리턴한 MovieVO가 들어간 ArrayList를 받는다. 
	ArrayList<MovieVO> list = dao.list();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<style>
a {
  text-decoration-line: none;
  color: white;
/*   text-decoration-line: underline; */
/*   text-decoration-line: overline; */
/*   text-decoration-line: line-through; */
/*   text-decoration-line: underline line-through overline; */
}
</style>
<body>
	<hr color="red">
	<h4><b>게시판의 글 개수 <%= list.size() %>개</b></h4>
	<% if(list.size() > 0) {%>
	<table class="table table-dark table-striped">
		<tr>
			<td>id</td>
			<td>title</td>
			<td>content</td>
			<td>location</td>
			<td>director</td>
		</tr>
		<%
			for (MovieVO bag2 : list) {
		%>
		<tr>
			<td><%=bag2.getId()%></td>
			<td>
			<a href="http://localhost:8888/web00/one4.jsp?id=<%=bag2.getId()%>"><%= bag2.getTitle() %></a>
			</td>
			<td><%=bag2.getContent()%></td>
			<td><%=bag2.getLocation()%></td>
			<td><%=bag2.getDirector()%></td>
		</tr>
		<%
			}
		}else{ %>
			<a href="movie.html">
				<button>이전 페이지로 돌아가기</button>
			</a><br>
			<h3>등록된 영화가 없습니다</h3>
			<img src="img/empty.jpg" width=250 height="250">
		<%} %>
	</table>
</body>
</html>