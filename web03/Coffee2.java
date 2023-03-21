package com.multi.www.web02;

public class Coffee2 {
	int price = 5000;
	String name = "핸드드립";
	public static Coffee2 coffee2; //null
	
	public static  Coffee2 getInstance() {
		if 	(coffee2 == null) {
			coffee2 = new Coffee2();
		}
		return coffee2;
	}
	public Coffee2() {
	}
	
//	@Override
//	public String toString() {
//		return "Coffee2 [price=" + price + ", name=" + name + "]";
//	}
}
