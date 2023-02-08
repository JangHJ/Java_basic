package 조건문;

import java.util.Scanner;
public class 미션1 {

	public static void main(String[] args) {
		// 1번
		Scanner sc = new Scanner(System.in);
		System.out.print("id를 입력하세요 >> ");
		String id = sc.next();
		System.out.print("pw를 입력하세요 >> ");
		int pw = sc.nextInt();
		
		if(id.equals("root") && pw == 1234)
			System.out.println("로그인 성공!");
		else {
			System.out.println("로그인 실패!");			
		}
		
		System.out.println("---------------");
		// 2번
		System.out.print("사과 구매 갯수 >> ");
		int cnt1 = sc.nextInt();
		System.out.print("사과 한 개 당 가격 >> ");
		int price1 = sc.nextInt();
		System.out.print("딸기 구매 갯수 >> ");
		int cnt2 = sc.nextInt();
		System.out.print("딸기 한 개 당 가격 >> ");
		int price2 = sc.nextInt();
		
		int result1 = cnt1 * price1;
		int result2 = cnt2 * price2;
		
		System.out.println("사과 구매 가격은 " + result1);
		System.out.println("딸기 구매 가격은 " + result2);
		System.out.println("전체 구매 가격은 " + (result1 + result2));
		
		System.out.println("---------------");
		//3번 심화문제
		System.out.print("시작값 >> ");
		int start = sc.nextInt();
		System.out.print("종료값 >> ");
		int end = sc.nextInt();
		int sum = 0;
		for (int i = start; i < end; i++) {
			sum += i;
		}
		System.out.println(start + "에서 " + end + "까지의 합 : " + sum);
		
		System.out.println("---------------");
		//4번
		System.out.print("시작값 >> ");
		int start2 = sc.nextInt();
		System.out.print("종료값 >> ");
		int end2 = sc.nextInt();
		System.out.print("점프값 >> ");
		int jump = sc.nextInt();
		
		int sum2 = 0;
		for (int k = start2; k < end2; k = k+jump) {
			if(sum2 > 100)
				break;
			sum2 += k;
			System.out.println("더해지는 중 : " + sum2);
		}
		System.out.println(start2 + "에서 " + end2 + "까지의 합" + "(점프값 : " + jump + ") : " + sum2);
	}

}
