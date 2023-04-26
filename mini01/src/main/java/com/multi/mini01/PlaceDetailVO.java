package com.multi.mini01;

//RAM에 만드는 저장공간을 만든다.
public class PlaceDetailVO {
	String id;
	String name;
	String cnt;
	String chartr;
	String opende;
	String seatscale;
	String telno;
	String relateurl;
	String adres;
	String la;
	String lo;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCnt() {
		return cnt;
	}
	public void setCnt(String cnt) {
		this.cnt = cnt;
	}
	public String getChartr() {
		return chartr;
	}
	public void setChartr(String chartr) {
		this.chartr = chartr;
	}
	public String getOpende() {
		return opende;
	}
	public void setOpende(String opende) {
		this.opende = opende;
	}
	public String getSeatscale() {
		return seatscale;
	}
	public void setSeatscale(String seatscale) {
		this.seatscale = seatscale;
	}
	public String getTelno() {
		return telno;
	}
	public void setTelno(String telno) {
		this.telno = telno;
	}
	public String getRelateurl() {
		return relateurl;
	}
	public void setRelateurl(String relateurl) {
		this.relateurl = relateurl;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public String getLa() {
		return la;
	}
	public void setLa(String la) {
		this.la = la;
	}
	public String getLo() {
		return lo;
	}
	public void setLo(String lo) {
		this.lo = lo;
	}
	@Override
	public String toString() {
		return "PlaceDetailVO [id=" + id + ", name=" + name + ", cnt=" + cnt + ", chartr=" + chartr + ", opende="
				+ opende + ", seatscale=" + seatscale + ", telno=" + telno + ", relateurl=" + relateurl + ", adres="
				+ adres + ", la=" + la + ", lo=" + lo + "]";
	}
}
