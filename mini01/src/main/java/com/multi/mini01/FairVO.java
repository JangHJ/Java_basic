package com.multi.mini01;

//RAM에 만드는 저장공간을 만든다.
public class FairVO {
	// MemberVO가방에 넣은 데이터는 Member테이블에 들어갈 예정
	// 각 컬럼과 일치시켜 줌.
	private String id;
	private String name;
	private String fromdate;
	private String todate;
	private String place;
	private String poster;
	private String genre;
	private String state;
	
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
	public String getFromdate() {
		return fromdate;
	}
	public void setFromdate(String fromdate) {
		this.fromdate = fromdate;
	}
	public String getTodate() {
		return todate;
	}
	public void setTodate(String todate) {
		this.todate = todate;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "FairVO [id=" + id + ", name=" + name + ", fromdate=" + fromdate + ", todate=" + todate + ", place=" + place
				+ ", poster=" + poster + ", genre=" + genre + ", state=" + state + "]";
	}
}
