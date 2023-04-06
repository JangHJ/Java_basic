package com.multi.mvc200;

public class MapVO {
	double lat;
	double lon;

	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	
	@Override
	public String toString() {
		return "MapVO [lat=" + lat + ", lon=" + lon + "]";
	}
	
	
}
