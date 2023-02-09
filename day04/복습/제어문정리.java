package 복습;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 제어문정리 {

	public static void main(String[] args) {
//		1.id와 pw를 입력해서 id가 root이고, pw가 1234이면 로그인 성공!
//		  아니면 로그인 실패!
//		  ==> String은 ==비교 불가능. equals() 비교해야함.
		Scanner sc = new Scanner(System.in);
		System.out.print("id입력>> ");
		String id = sc.next(); // String입력
		System.out.print("pw입력>> ");
		String pw = sc.next(); // String입력
		// 조건이 여러개인 경우 ==> 논리연산자(조건1 && 조건2), ||
		if (id.equals("root") && pw.equals("1234")) {
			JOptionPane.showMessageDialog(null, "로그인 성공");
		} else {
			JOptionPane.showMessageDialog(null, "로그인 실패");
		}

//		2. 사과 구매 갯수, 사과 한 개당 가격입력
//		   딸기 구매 갯수, 딸기 한 개당 가격입력
//		   다음과 같이 출력
//		   사과 구매 가격은 5500원입니다.
//		   딸기 구매 가격은 4500원입니다.
//		   전체 구매 가격은 10000원입니다.
		System.out.print("사과 구매 갯수>> ");
		int aCount = sc.nextInt(); // String --> int
		System.out.print("사과 한 개당 가격입력>> ");
		int aPrice = sc.nextInt(); // String --> int
		System.out.print("딸기 구매 갯수>> ");
		int bCount = sc.nextInt(); // String --> int
		System.out.print("딸기 한 개당 가격입력>> ");
		int bPrice = sc.nextInt(); // String --> int

		int aTotal = aCount * aPrice;
		int bTotal = bCount * bPrice;
		int total = aTotal + bTotal;

		System.out.println("사과 구매 금액은 " + aTotal + "원");
		System.out.println("딸기 구매 금액은 " + bTotal + "원");
		System.out.println("전체 구매 금액은 " + total + "원");

//		3. 심화문제
//		- 시작값, 종료값 입력
//		시작값부터 종료값까지 모두 더해서 출력
		System.out.print("시작값>> "); // 1, 1000
		int start = sc.nextInt();
		System.out.print("종료값>> "); // 10, 2000
		int end = sc.nextInt();

		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum = sum + i;
		}
		System.out.println("최종 더한 값은 " + sum);
//		4. 심화문제
//		   - 시작값, 종료값, 점프값 입력
//		     시작값부터 종료값까지 점프값만큼 증가하면서 더함. 더한 값을 출력
//		     더한 값이 100을 넘으면 프로그램 종료
//		4. 심화문제
//		   - 시작값, 종료값, 점프값 입력
//		     시작값부터 종료값까지 점프값만큼 증가하면서 더함.
//			 더한 값을 출력
//		     더한 값이 100을 넘으면 프로그램 종료
		System.out.print("시작값>> "); //1, 1000
		int start2 = sc.nextInt();
		System.out.print("종료값>> "); //10, 2000
		int end2 = sc.nextInt();
		System.out.print("점프값>> "); //5
		int jump = sc.nextInt();
		
		int sum2 = 0;
		for (int i = start2; i <= end2; i = i + jump) {
			sum2 = sum2 + i;
			if (sum2 >= 100) {
				System.exit(0);
			}
		}
		System.out.println("최종 더한 값은 " + sum2);

		sc.close();
	}
}