<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><%
	//입력한 값 받아오기.
	String m = request.getParameter("money");
	String c = request.getParameter("choice");
	int money = Integer.parseInt(m);
	int choice = Integer.parseInt(c);
	
	//choice에 따라 값변동
	if(choice == 1)
		money -= 1000;
	else if(choice == 2)
		money += 1000;
%><%=money%>