<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
	background: white;
}

table {
	font-family: Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #ddd;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #f2f2f2;
}

tr:hover {
	background-color: #ddd;
}

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
<!-- content delivery network  : CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=7377e77dbf4c68a33c18016f4dc8dc45&autload=false"></script>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(
				function() {
					$.ajax({
						url : "one33",
						data : {
							id : "apple1"
						},
						dataType : "json",
						success : function(json) {
							id = json.id
							pw = json.pw
							name = json.name
							tel = json.tel

							table = "<table><tr><th>항목명</th><th>값</th></tr>"
									+ "<tr><td>id</td><td>" + id + "</td></tr>"
									+ "<tr><td>pw</td><td>" + pw + "</td></tr>"
									+ "<tr><td>name</td><td>" + name
									+ "</td></tr>" + "<tr><td>tel</td><td>"
									+ tel + "</td></tr></table>"
							$('#result').empty()
							$('#map').empty()
							$('#result').append(table)
						} //success
					}) //ajax
				})//b1

		$('#b2').click(
				function() {
					$.ajax({
						url : "list66",
						dataType : "json",
						success : function(json) {//[{}, {id: "", name: "", pw : "", tel: ""}]
							$('#result').empty()
							$('#map').empty()
							for (var i = 0; i < json.length; i++) {
								id = json[i].id
								pw = json[i].pw
								name = json[i].name
								tel = json[i].tel
								$('#result').append(
										"member json배열 중" + i + "번째 것>> " + id
												+ ", " + pw + ", " + name
												+ ", " + tel + "<br>")
							}
						} //success
					}) //ajax
				})//b2

		$('#b3').click(
				function() {
					$.ajax({
						url : "list66",
						dataType : "json",
						success : function(json) {
							$('#result').empty()
							$('#map').empty()
							$('#result').append("<table>")
							for (var i = 0; i < json.length; i++) {
								id = json[i].id
								pw = json[i].pw
								name = json[i].name
								tel = json[i].tel
								table = "<tr><td>" + id + "</td><td>" + pw
										+ "</td><td>" + name + "</td><td>"
										+ tel + "</td></tr>"
								$('#result').append(table)
							}
							$('#result').append("</table>")
						} //success
					}) //ajax
				})//b3

		$('#b4').click(function() {
			$.ajax({
				url : "jsonResponse5",
				dataType : "json",
				success : function(json) {
					$('#result').empty()
					$('#map').empty()
					lat = json.lat
					lon = json.lon

					var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
					mapOption = {
						center : new kakao.maps.LatLng(lat, lon), // 지도의 중심좌표
						level : 3
					// 지도의 확대 레벨
					};

					// 지도를 표시할 div와  지도 옵션으로  지도를 생성합니다
					var map = new kakao.maps.Map(mapContainer, mapOption);
					
					// 마커가 표시될 위치입니다 
					var markerPosition = new kakao.maps.LatLng(lat, lon);

					// 마커를 생성합니다
					var marker = new kakao.maps.Marker({
						position : markerPosition
					});

					// 마커가 지도 위에 표시되도록 설정합니다
					marker.setMap(map);
				} //success
			}) //ajax
		})//b4

		$('#b5').click(function drawChart() {		      
			google.charts.load('current', {'packages':['corechart']});
		    google.charts.setOnLoadCallback(drawChart);	
					
			$.ajax({
				url : "jsonResponse6",
				dataType : "json",
				success : function drawChart(list) {
					
					alert(list[0].work + " " + list[0].time)
					//2차원 배열--> 3개
					var arr2 = new Array(list.length + 1);
				    var header = ["Task", "hours"];
				    arr2[0] = header
				    //alert(data[0])
/* 					for(i = 0; i < list.length; i++){
				    	data[i + 1] = new Array(2)
				    	data[i + 1][0] = list[i].work;
				    	data[i + 1][1] = list[i].time;
						alert(arr2[i + 1])
					} */
					//2차원배열은 배열을 만들어서
					//1차원을 2차원배열에 하나씩 끼면 됨.
					for(i = 0; i < list.length; i++){
				    	one = new Array(2)
				    	one[0] = list[i].work;
				    	one[1] = list[i].time;
				    	arr2[i + 1] = one
					}
			        var data = google.visualization.arrayToDataTable(arr2);

			         	/*[
			        	 	['Task', 'Hours per Day'], //인덱스0
			          		[list[0].work, list[0].time], //인덱스1
			          		[list[1].work, list[1].time], //인덱스2
			          		[list[2].work, list[2].time] //인덱스3
			        	 ]*/
			
			        var options = {
			          title: 'My Daily Activities'
			        };
			         
			        var chart = new google.visualization.PieChart(document.getElementById('piechart'));
			        chart.draw(data, options);
			}//success
    	  })//ajax
		})//b5*/

	})//$
</script>

</head>
<body>
	<button id="b1">컨트롤러에서 member JSON(테이블)을 받아오자!</button>
	<button id="b2">컨트롤러에서 member JSONArray을 받아오자!(리스트 출력)</button>
	<button id="b3">컨트롤러에서 member JSONArray을 받아오자!(테이블 출력)</button>
	<hr color="blue">
	<button id="b4">카카오 맵에 json을 넣어서 표시해보자!</button>
	<!-- url: json3, bbs vo에 값을 하나 넣어서 json으로 받아와서 출력 -->

	<button id="b5">구글 차트에 json을 넣어서 차트를 표시해보자!</button>
	<!-- url: json4, bbs vo 2개가 들어간 arraylist를 만들어서 
	json array으로 받아와서 출력 -->

	<hr color="red">
	<div id="result"></div>
	<div id="map" style="width: 100%; height: 500px;"></div>
	<div id="piechart" style="width: 900px; height: 500px;"></div>
</body>
</html>