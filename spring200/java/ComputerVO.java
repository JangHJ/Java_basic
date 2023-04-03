package com.multi.mvc200;

public class ComputerVO {
	private String com;
	private int price;
	private String mouse;
	private int price2;
	private int sum;
	
	public String getCom() {
		return com;
	}
	public void setCom(String com) {
		this.com = com;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMouse() {
		return mouse;
	}
	public void setMouse(String mouse) {
		this.mouse = mouse;
	}
	public int getPrice2() {
		return price2;
	}
	public void setPrice2(int price2) {
		this.price2 = price2;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	@Override
	public String toString() {
		return "ComputerVO [com=" + com + ", price=" + price + ", mouse=" + mouse + ", price2=" + price2 + ", sum="
				+ sum + "]";
	}
	
	
}
