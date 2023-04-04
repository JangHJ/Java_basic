<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
#result{
	background: yellow;	
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			$('#result').empty()
			$.ajax({
				url : "list5",
				success : function(x) {
					$('#result').append(x)
				} //success
			}) //ajax
		})//b1
		
		$('#b2').click(function() {
			$('#result').empty()
			$.ajax({
				url : "list6",
				data : {
					bbsno : 1
				},
				success : function(x) {
					$('#result').append(x)
				} //success
			}) //ajax
		})//b2
		
		$('#b3').click(function() {
			$('#result').empty()
			$.ajax({
				url : "list6",
				data : {
					bbsno : 2
				},
				success : function(x) {
					$('#result').append(x)
				} //success
			}) //ajax
		})//b3
		
		$('#b4').click(function() {
			$('#result').empty()
			$.ajax({
				url : "list7",
				data : {
					writer: "apple"
				},
				success : function(x) {
					$('#result').append(x)
				} //success
			}) //ajax
		})//b4
		
		$('#b5').click(function() {
			$('#result').empty()
			$.ajax({
				url : "one5",
				data : {
					id: "apple"
				},
				success : function(x) {
					$('#result').append(x)
				} //success
			}) //ajax
		})//b5
		
		$('#b6').click(function() {
			$('#result').empty()
			$.ajax({
				url : "one6",
				data : {
					no: 1
				},
				success : function(x) {
					$('#result').append(x)
				} //success
			}) //ajax
		})//b6
		
		$('#b7').click(function() {
			$('#result').empty()
			$.ajax({
				url : "list",
				data : {
					id: "apple"
				},
				success : function(x) {
					$('#result').append(x)
				} //success
			}) //ajax
		})//b7
		
	})//$
</script>
</head>
<body>
<button id="b1">bbs리스트 가지고 오기</button>
<button id="b2">bbs번호 1번 reply리스트 가지고 오기</button>
<button id="b3">bbs번호 2번 reply리스트 가지고 오기</button>
<button id="b4">member id가 apple인 사람의 댓글 리스트 가지고 오기</button>
<button id="b5">member id가 apple인 사람의 정보 가지고 오기</button>
<button id="b6">bbs no가 1인 게시물의 상세정보 가지고 오기</button>
<button id="b7">member의 모든 리스트 가지고 오기</button>
<hr color="red">
<div id="result"></div>
</body>
</html>