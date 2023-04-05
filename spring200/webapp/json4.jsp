<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
//스크릿트릿 
	JSONObject json = new JSONObject();
	json.put("high", 63700); //{name : hong}
	json.put("low", 63200); 
	json.put("end", 63600); 
	
	JSONObject json2 = new JSONObject();
	json2.put("high", 63900); //{name : hong}
	json2.put("low", 63400); 
	json2.put("end", 64000); 
	
	JSONArray array = new JSONArray();
	array.add(json);
	array.add(json2);
	
%><%= array.toJSONString() %>