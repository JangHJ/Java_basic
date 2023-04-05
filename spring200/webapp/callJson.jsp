<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- content delivery network  : CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			$.ajax({
				url: "json.jsp",
				dataType : "json",
				success: function(json) {
					$('#result').empty()
					$('#result').append(json.id)
				} //success
			}) //ajax
		})//b1
		
		$('#b2').click(function() {
			$.ajax({
				url: "json2.jsp",
				dataType : "json",
				success: function(json) {
					$('#result').empty()
					$('#result').append(json[0].age)
				} //success
			}) //ajax
		})//b2
		
		$('#b3').click(function() {
			$.ajax({
				url: "json3.jsp",
				dataType : "json",
				success: function(json) {
					today = json.today
					temp = json.temp
					hu = json.hu
					$('#result').empty()
					$('#result').append("오늘의 날씨 : " + today + "<br>온도 : " + temp + "℃<br>습도 : " + hu + "%<br>")
					if(today == 'rain'){
						$('#result').append("<img src=resources/img/rain.jpg><br>")
					}else if(today == 'sun'){
						$('#result').append("<img src=resources/img/sun.jpg><br>")
					}
				} //success
			}) //ajax
		})//b3
		
		$('#b4').click(function() {
			$.ajax({
				url: "json4.jsp",
				dataType : "json",
				success: function(json) {
					$('#result').empty()
					high1 = json[0].high
					low1 = json[0].low
					end1 = json[0].end
					high2 = json[1].high
					low2 = json[1].low
					end2 = json[1].end
					$('#result').append("어제 최고가 : " + high1 + "<br>최저가 : " + low1 + "<br>종가 : " + end1 + "<br>")
					$('#result').append("<hr color=red>")
					$('#result').append("오늘 최고가 : " + high2 + "<br>최저가 : " + low2 + "<br>종가 : " + end2 + "<br>")
				} //success
			}) //ajax
		})//b4
		
	})//$
</script>

</head>
<body>
<button id="b1">JSON을 받아오자.!</button>
<button id="b2">JSONArray를 받아오자.!</button>
<button id="b3">JSON3을 받아오자.!</button>
<button id="b4">JSONArray4를 받아오자.!</button>
<hr color="red">
<div id="result"></div>
</body>
</html>