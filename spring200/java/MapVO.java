package com.multi.mvc200;

public class MapVO {
	String place;
	double lati;
	double longi;
	
	
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public double getLati() {
		return lati;
	}
	public void setLati(double lati) {
		this.lati = lati;
	}
	public double getLongi() {
		return longi;
	}
	public void setLongi(double longi) {
		this.longi = longi;
	}
	
	@Override
	public String toString() {
		return "MapVO [place=" + place + ", lati=" + lati + ", longi=" + longi + "]";
	}
}
