package com.multi.mvc01;
//RAM에 만드는 저장공간을 만든다.
public class BbsVO {
	//MemberVO가방에 넣은 데이터는 Member테이블에 들어갈 예정
	//각 컬럼과 일치시켜 줌. 
	private int no;
	private String title;
	private String content;
	private String writer;
	
	//하나의 변수당 set/get하나씩 만들어줌. 
	//가방에 하나씩 값을 넣어주어야 함. ==> setter
	public void setNo(int no) {
		this.no = no;
	}
	
	//가방에 하나씩 값을 꺼내주어야 함. ==> getter
	public int getNo() {
		return no;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "MemberVO [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	
	//가방에 어떤 값들이 들어있는지 string으로 다 찍어볼 수 있다.
	
}
