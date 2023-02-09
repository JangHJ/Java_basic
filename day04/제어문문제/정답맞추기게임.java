package 제어문문제;

import java.util.Random;
import java.util.Scanner;

public class 정답맞추기게임 {
	public static void main(String[] args) {

		Random r = new Random(); // 씨앗값, seed값
		int target = r.nextInt(9)+1;
		Scanner sc = new Scanner(System.in);

		int data = 0;
		int count = 0;
		while (true) {
			System.out.print("생각한 정답은?? ");
			data = sc.nextInt();
			
			if (data == target) {
				System.out.println("정답입니다");
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("오답입니다");
				System.out.println("다시 시도해주세요");
				// data가 target보다 크면 "target보다 큽니다"
				// data가 target보다 작으면 "target보다 작습니다"
				if (data < target)
					System.out.println("입력한 값이 target보다 작습니다");
				else
					System.out.println("입력한 값이 target보다 큽니다");
			}
		}
		// 1. 오답인 경우 힌트주세요.
		// data가 target보다 크면 "너무 커요"
		// data가 target보다 작으면 "너무 작아요"
		// 2. 랜덤을 이용해서 프로그램 실행될 때마다 정답을 바꾸세요.
		// 3. 전체 시도 횟수 카운트
		sc.close();
	}
}
