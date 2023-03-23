<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><%
	//입력한 값 받아오기.
	String w = request.getParameter("won");
	int won = Integer.parseInt(w);
	double dollar = 0.00078;
	int result = (int)(won * dollar);
%><%=result%>