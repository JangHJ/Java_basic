package 제어문문제;

import java.util.Scanner;

public class 인기투표프로그램 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0; // num1 : 아이유, num2 : 레드벨벳, num3 : 뉴진스
		int reply = 0; // 입력받은 정수
		while (true){
			System.out.print("1)아이유 2)레드벨벳 3)뉴진스 4)종료 >> ");
			reply = sc.nextInt(); // 입력받은 값을 reply에 넣어줌
			
			if(reply == 4) // 4 종료 입력시 투표 끝내기
			{
				System.out.println("시스템을 종료합니다.");
				break;
			}
			
			switch (reply) {
			case 1: // 입력된 값이 1이라면 num1 증가 (아이유 투표수 증가)
				num1++;
				break;
			case 2:
				num2++;
				break;
			case 3:
				num3++;
				break;
			default:
				System.out.println("잘못된 입력입니다. 다시 입력해주세요"); // 1,2,3,4가 아닌 다른 숫자의 경우 다시 입력받도록 함.
				break;
			}
		}
		//루프문 종료 후 결과 출력
		System.out.println("---------------");
		System.out.println("아이유 " + num1 + "표");
		System.out.println("레드벨벳 " + num2 + "표");
		System.out.println("뉴진스 " + num3 + "표");
		System.out.println("---------------");
		sc.close();
	}
}
