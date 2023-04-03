<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() { //body부분이 dom tree로 메모리에 준비가 되었을 때
		//입력값으로 넣은 함수를 실행해주세요.
		$('#b1').click(function(){
			//datas = $('form').serialize();
			$.ajax({
				url: "movie",
				data: {
					title: $('#title').val(),
					price: $('#price').val() 
				},
				success: function(x) {
					alert('movie요청 성공!')
					alert(x)
					$('#result').append(x + "<br>")
				},
				error: function() {
					alert('movie요청 실패!')
				}
			})//ajax
		})//b1
		
		$('#b2').click(function(){
			$.ajax({
				url: "fruit",
				success: function(x) {
					alert('fruit요청 성공!')
					$('#result').append(x + "<br>")
				},
				error: function() {
					alert('fruit요청 실패!')
				}
			})//ajax
		})//b2
	
		$('#b3').click(function(){
			$.ajax({
				url: "tour",
				success: function(x) {
					alert('tour요청 성공!')
					$('#result').append(x + "<br>")
				},
				error: function() {
					alert('tour요청 실패!')
				}
			})//ajax
		})//b2
	})//fun
</script>
</head>
<body>
<form>
영화 제목  : <input id="title" value="테넷"><br>
영화관람료  : <input id="price" value=10000><br>
<input id="b1" type="button" value="영화 관람 확인"><br>
</form>
<hr color="red">
<input id="b2" type="button" value="과일목록 가지고 오기"><br>
<input id="b3" type="button" value="여행목록 가지고 오기"><br>
<hr color="red">
<div id="result"></div>
</body>
</html>