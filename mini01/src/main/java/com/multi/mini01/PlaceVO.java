package com.multi.mini01;

//RAM에 만드는 저장공간을 만든다.
public class PlaceVO {
	// MemberVO가방에 넣은 데이터는 Member테이블에 들어갈 예정
	// 각 컬럼과 일치시켜 줌.

	private String id;
	private String name;
	private String cnt;
	private String chartr;
	private String sido;
	private String gugun;
	private String opende;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getSido() {
		return sido;
	}
	public void setSido(String sido) {
		this.sido = sido;
	}
	public String getGugun() {
		return gugun;
	}
	public void setGugun(String gugun) {
		this.gugun = gugun;
	}
	public String getOpende() {
		return opende;
	}
	public void setOpende(String opende) {
		this.opende = opende;
	}
	@Override
	public String toString() {
		return "PlaceVO [name=" + name + ", id=" + id + ", cnt=" + cnt + ", chartr=" + chartr + ", sido=" + sido
				+ ", gugun=" + gugun + ", opende=" + opende + "]";
	}
}
