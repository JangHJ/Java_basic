<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>네이버 Dynamic Web API 사용 예제</title>
<script type="text/javascript"
    src="https://openapi.map.naver.com/openapi/v3/maps.js?ncpClientId=uez2akrxoe&submodules=geocoder"></script>
</head>
<body>
    <div id="map" style="width: 100%; height: 500px;"></div>
    <script type="text/javascript">
        var mapOptions = {
            center: new naver.maps.LatLng(37.5666102, 126.9783881),
            zoom: 10
        };

        var map = new naver.maps.Map('map', mapOptions);

        if (navigator.geolocation) {
            navigator.geolocation.getCurrentPosition(function(position) {
                var latlng = new naver.maps.LatLng(position.coords.latitude, position.coords.longitude);
                map.setCenter(latlng); // 현재 위치로 지도 중심 이동
                var marker = new naver.maps.Marker({
                    position: latlng,
                    map: map
                });

                var geocoder = new naver.maps.Service({
                    clientId: 'uez2akrxoe',
                    clientSecret: 'pm8Fc6KwTQrHR0QRtJPEFJFYaUiDsCBLgmwmZ0fK'
                });

                geocoder.reverseGeocode({
                    coords: latlng,
                    orders: [
                        naver.maps.Service.OrderType.ADDR,
                        naver.maps.Service.OrderType.ROAD_ADDR,
                        naver.maps.Service.OrderType.NAME
                    ]
                }, function(status, response) {
                    if (status === naver.maps.Service.Status.ERROR) {
                        return alert("주소 변환 실패");
                    }
                    var items = response.v2.results;
                    var address = items[0].region.area1.name + " " + items[0].region.area2.name + " " + items[0].region.area3.name + " " + items[0].land.name;
                    alert("현재 위치 : " + address);
                });
            });
        } else {
            alert("위치 정보를 사용할 수 없습니다.");
        }
    </script>
</body>
</html>