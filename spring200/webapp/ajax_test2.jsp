<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<style>
body{
	background: white;
}
table{
	font-family: Arial, Helvetica, sans-serif;
  	border-collapse: collapse;
  	width: 100%;
}
td, th {
  border: 1px solid #ddd;
  padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2;}

tr:hover {background-color: #ddd;}

th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #04AA6D;
  color: white;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>
<!-- <script type="text/javascript" src="js/cors.js"></script> -->
<script type="text/javascript">
	$(function() {
		//시작하자마자 result비우고 bbs리스트 추가
		$('#result').empty()
			$.ajax({
				url : "list5",
				success : function(x) {
					$('#result').append(x)
				} //success
			}) //ajax
		
		$('#b1').click(function() { //bbs수정
			$('#result').empty()
			$.ajax({
				url : "update2.multi",
				data : {
					no : $('#no').val(),
					content : $('#content').val()
				},
				success : function() {
					//$('#result').append("수정 완료!")
					alert('수정 완료!')
					document.location.reload();
				} //success
			}) //ajax
		})//b1
		
		$('#b2').click(function() { //bbs삭제
			$('#result').empty()
			$.ajax({
				url : "delete2.multi",
				data : {
					no : $('#no2').val()
				},
				success : function(x) {
					alert("삭제 완료!")
					$('#result').append(x)
					//document.location.reload();
				} //success
			}) //ajax
		})//b2
		
		$('#b3').click(function() { //날씨정보
			$('#result').empty()
			$.ajax({
				crossOrigin: true,
				url : "http://api.openweathermap.org/data/2.5/weather?q=seoul&units=metric&lang=kr&appid=4a617558e63ad9fd3d846ac2715dfc56",
				dataType : 'json',
				success : function(data) {
					console.log(data);
					$('#result').html('위치 : ' + data.name + '<br>' +
							'날씨 : ' + data.weather[0].description + '<br>' + 
							'풍속 : ' + data.wind.speed + '<br>' + 
							'최고 기온 : ' + data.main.temp_max + " ℃ <br>" + 
							'최저 기온 : ' + data.main.temp_min + " ℃ <br>" + 
							'체감 온도 : ' + data.main.feels_like + " ℃ <br>" + 
							'구름 : ' + data.clouds.all)
					//alert(x.coord.lat)
					//$('#result').append(x)
				} //success
			}) //ajax
		})//b3
		
	})//$
</script>
</head>
<body>
수정할 bbs no : <input id="no"><br>
수정할 bbs content : <input id="content"><button id="b1">bbs 수정버튼</button>
<hr>
삭제할 bbs no : <input id="no2"><button id="b2">bbs 삭제버튼</button>
<hr>
<button id="b3">날씨 정보 버튼</button>
<hr color="red">
<div id="result"></div>
</body>
</html>