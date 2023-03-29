package com.multi.mvc01;
//RAM에 만드는 저장공간을 만든다.
public class FoodVO {
	//MemberVO가방에 넣은 데이터는 Member테이블에 들어갈 예정
	//각 컬럼과 일치시켜 줌. 
	private String like;
	private String dislike;
	public String getLike() {
		return like;
	}
	public void setLike(String like) {
		this.like = like;
	}
	public String getDislike() {
		return dislike;
	}
	public void setDislike(String dislike) {
		this.dislike = dislike;
	}
	@Override
	public String toString() {
		return "FoodVO [like=" + like + ", dislike=" + dislike + "]";
	}
	
	//가방에 어떤 값들이 들어있는지 string으로 다 찍어볼 수 있다.
	
}
