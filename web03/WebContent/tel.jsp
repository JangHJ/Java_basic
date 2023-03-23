<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><%
	//입력한 값 받아오기.
	String tel = request.getParameter("tel");
	// 01011112222 ==> 010 -> 100, 011 -> 111
	String result = "";
	String pre = tel.substring(0, 3); // 0~2까지
	
	switch(pre){
	case "010":
		result = "100";
		break;
	case "011":
		result = "111";
		break;
	default:
		result = "222";
	}
	Random r = new Random();
	int post = r.nextInt(900) + 100; //100~999 (0~899)
	result = result + post;
%><%=result%>