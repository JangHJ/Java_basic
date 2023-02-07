package 조건문;

import java.util.Date;

public class IF문4 {
	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());
		
		System.out.println(date.getYear() + 1900);
		System.out.println(date.getMonth() + 1);
		System.out.println(date.getDate());
		
		System.out.println(date.getDay()); //요일! 0 일요일부터 시작
		

		int hour = date.getHours();
		if (hour < 11) {
			System.out.println("굿모닝");
		}else if(hour < 14) {
			System.out.println("굿애프터눈");
		}else if(hour < 20) {
			System.out.println("굿이브닝");
		}else {
			System.out.println("굿나잇");
		}
		
		int month = date.getMonth() + 1; //음력날짜라 1을 더해주기
		System.out.println(month);
		switch (month) {
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		case 12: case 1: case 2:
			System.out.println("겨울");
			break;
		}
	}
}
