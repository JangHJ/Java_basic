package com.multi.mvc903;

public class MovieVO2 {

	private int price;
	private String title;

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "MovieVO [price=" + price + ", title=" + title + "]";
	}
	
	
	
	
}
