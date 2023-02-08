package 조건문;

import java.util.Scanner;

public class 콘솔입력1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //키보드
		System.out.print("요일 입력 (1.주중 2.주말) >> ");
		int day = sc.nextInt();
		switch (day) {
		case 1:
			System.out.println("열심히 공부합시다!");
			break;
		case 2:
			System.out.println("열심히 놀아봅시다!");
			break;
		default:
			System.out.println("1, 2중에 다시 입력해주세요");
			break;
		}
		
		System.out.print("주말에 뭐할까?");
		String data2 = sc.next(); //단어
		System.out.println("나는 주말에 " + data2 + "를 할거야");
		sc.close();
		
	}

}
