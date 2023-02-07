package 조건문;

import java.util.Date;

public class IF문6 {
	public static void main(String[] args) {
		Date date = new Date();
		
		int month = date.getMonth() + 1; //음력날짜라 1을 더해주기
		int year = date.getYear() + 1900;
		int day = date.getDay();
		
		System.out.println("1. 현재 년도 구하기");
		if(year >= 2000)
		{
			System.out.println(year + "년, 밀레니엄 세대시군요");
			System.out.println("");
		}
		else {
			System.out.println(year + "년, 밀레니엄 세대가 아니시군요");
			System.out.println("");
		}
		
		System.out.println("2. 요일 구하기");
		if(day == 0 || day == 6)
		{
			System.out.println("쉬자~~~");
		}
		else {
			System.out.println("열심히 공부하자~~~");
			System.out.println("");
		}
		System.out.println("3. 달 구하기");
		switch (month) {
		case 2:
			System.out.println("28일까지");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일까지");
			break;
		default:
			System.out.println("31일까지");
			break;
		}
		
		
	}
}
