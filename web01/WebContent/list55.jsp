<%@page import="java.util.ArrayList"%>
<%@page import="multi.GradeVO"%>
<%@page import="multi.GradeDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String sub = request.getParameter("subject"); 
	GradeDAO dao = new GradeDAO();
	//5,6)dao가 리턴한 GradeVO가 들어간 ArrayList를 받는다. 
	ArrayList<GradeVO> list2 = dao.list2(sub);
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
	<h4><b>입력된 과목 <%= sub %></b></h4>
	<h4><b>검색된 성적 개수 <%= list2.size() %>개</b></h4>
	<% if(list2.size() > 0) {%>
	<table class="table table-dark table-striped">
		<tr>
			<td>id</td>
			<td>subject</td>
			<td>score</td>
			<td>name</td>
			<td>img</td>
		</tr>
		<%
			for (GradeVO bag2 : list2) {
		%>
		<tr>
			<td><%=bag2.getId()%></td>
			<td><%= bag2.getSubject() %>
			</td>
			<td><%=bag2.getScore()%></td>
			<td><a href="http://localhost:8888/web00/one5.jsp?id=<%=bag2.getId()%>"><%=bag2.getName()%></a></td>
			<td><img src="subject/<%=bag2.getImg()%>" width=100 height=100></td>
		</tr>
		<%
			}
		}else{ %>
			<a href="Grade.html">
				<button>이전 페이지로 돌아가기</button>
			</a><br>
			<h3>등록된 성적이 없습니다</h3>
			<img src="img/empty.jpg" width=250 height="250">
		<%} %>
	</table>
</body>
</html>