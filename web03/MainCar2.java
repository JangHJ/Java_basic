package com.multi.www.web02;

public class MainCar2 {

	public static void main(String[] args) {
		Car car; //12
		for (int i = 0; i < 1000; i++) {
			car = new Car("빨강" + i, 10, 200);
			System.out.println(car); //주소확인!
		}
		System.out.println("메모리크기>> " + 12 * 1000);
	}

}
