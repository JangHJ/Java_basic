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
            zoom: 10
        };
        var map = new naver.maps.Map('map', mapOptions);

        var geocoder = new naver.maps.services.Geocoder({
            clientId: 'uez2akrxoe',
            clientSecret: 'pm8Fc6KwTQrHR0QRtJPEFJFYaUiDsCBLgmwmZ0fK'
        });

        // HTML5 Geolocation API를 사용하여 현재 위치를 얻어옴
        if (navigator.geolocation) {
            navigator.geolocation.getCurrentPosition(function(position) {
                var lat = position.coords.latitude;
                var lng = position.coords.longitude;

                // 현재 위치에 마커 추가
                var marker = new naver.maps.Marker({
                    position: new naver.maps.LatLng(lat, lng),
                    map: map
                });

                // 현재 위치로 지도 이동
                map.setCenter(new naver.maps.LatLng(lat, lng));
            }, function() {
                alert('위치 정보를 가져올 수 없습니다.');
            });
        } else {
            alert('이 브라우저는 Geolocation을 지원하지 않습니다.');
        }
        
        var address = '서울특별시 종로구 세종로 사직로 161';
        geocoder.addressToCoord(address, function(status, response) {
            if (status === naver.maps.Service.Status.ERROR) {
                alert('주소를 찾을 수 없습니다.');
                return;
            }
            var marker = new naver.maps.Marker({
                position: new naver.maps.LatLng(response.result.items[0].point.y, response.result.items[0].point.x),
                map: map
            });
        });
    </script>
</body>
</html>