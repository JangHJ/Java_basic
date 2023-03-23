<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><%
	//입력한 값 받아오기.
	String d = request.getParameter("dollar");
	int dollar = Integer.parseInt(d);
	double won = 1283.0;
	int result = (int)(dollar * won);
%><%=result%>