package com.multi.mvc200;

public class ChartVO {
	private String work;
	private int time;
	
	@Override
	public String toString() {
		return "ChartVO [doing=" + work + ", time=" + time + "]";
	}
	
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
}
