package com.multi.mini01;

//RAM에 만드는 저장공간을 만든다.
public class PlaceVO {
	// MemberVO가방에 넣은 데이터는 Member테이블에 들어갈 예정
	// 각 컬럼과 일치시켜 줌.
	private String fcltynm;
	private String mt10id;
	private int mt13cnt;
	private String fcltychartr;
	private int opende;
	private int seatscale;
	private String telno;
	private String relateurl;
	private String adres;
	private float la;
	private float lo;
	public String getFcltynm() {
		return fcltynm;
	}
	public void setFcltynm(String fcltynm) {
		this.fcltynm = fcltynm;
	}
	public String getMt10id() {
		return mt10id;
	}
	public void setMt10id(String mt10id) {
		this.mt10id = mt10id;
	}
	public int getMt13cnt() {
		return mt13cnt;
	}
	public void setMt13cnt(int mt13cnt) {
		this.mt13cnt = mt13cnt;
	}
	public String getFcltychartr() {
		return fcltychartr;
	}
	public void setFcltychartr(String fcltychartr) {
		this.fcltychartr = fcltychartr;
	}
	public int getOpende() {
		return opende;
	}
	public void setOpende(int opende) {
		this.opende = opende;
	}
	public int getSeatscale() {
		return seatscale;
	}
	public void setSeatscale(int seatscale) {
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
	public float getLa() {
		return la;
	}
	public void setLa(float la) {
		this.la = la;
	}
	public float getLo() {
		return lo;
	}
	public void setLo(float lo) {
		this.lo = lo;
	}
	@Override
	public String toString() {
		return "PlaceVO [fcltynm=" + fcltynm + ", mt10id=" + mt10id + ", mt13cnt=" + mt13cnt + ", fcltychartr="
				+ fcltychartr + ", opende=" + opende + ", seatscale=" + seatscale + ", telno=" + telno + ", relateurl="
				+ relateurl + ", adres=" + adres + ", la=" + la + ", lo=" + lo + "]";
	}
}
