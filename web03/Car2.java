package com.multi.www.web02;

public class Car2 {
	String color; //주소(4바이트)
	int price; //4
	int speed; //4
	//하나만 제공하는 객체는
	//static: 하나만 변수만들때
	//public: 제공하는 car2를 아무데서나 쓸 수 있도록!
	public static Car2 car2;
	
	//싱글톤은 해당클래스에서 하나만 만들어서 제공!
	
	public static Car2 getInstance() {
		if(car2 == null) {
			car2 = new Car2("빨강", 100, 110);
		}
		return car2;
	}
	
	public void run() {
		System.out.println("달리자~~~~~~~~~~~!!!.");
	}
	
	private Car2(String color, int price, int speed) {
		this.color = color;
		this.price = price;
		this.speed = speed;
	}
}