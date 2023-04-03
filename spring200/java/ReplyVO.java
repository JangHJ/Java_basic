package com.multi.mvc200;

public class ReplyVO {
	private int no;
	private int bbsno;
	private String content;
	private String writer;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getBbsno() {
		return bbsno;
	}
	public void setBbsno(int bbsno) {
		this.bbsno = bbsno;
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
		return "ReplyVO [no=" + no + ", bbsno=" + bbsno + ", content=" + content + ", writer=" + writer + "]";
	}
}
