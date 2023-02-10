package 배열응용;

import java.util.Scanner;

public class 배열정리문제 {

	public static void main(String[] args) {
		//1. 정수 5개 크기의 배열을 만들고 10,20,30,40,50을 순서대로 넣는다
		//첫번째 값과 세번째 값을 더한 후 프린트한다
		Scanner sc = new Scanner(System.in);
 		int[] arr = new int[5];
 		for (int i = 0; i < arr.length; i++) {
 			System.out.print("정수 입력 >> ");
			arr[i] = sc.nextInt();
		}
		System.out.println("첫번째값과 세번째 값의 합 : " + (arr[0] + arr[2]));
		
		//2. String 3개 크기의 배열을 만들어서 자바, 스프링, JSP를 순서대로 넣는다
		// >> "자바 보다는 스프링"으로 출력
		String[] arr2 = new String[3];
		for (int i = 0; i < arr2.length; i++) {
			System.out.print("문자 입력 >> ");
			arr2[i] = sc.next();
		}
		System.out.println(arr2[0] + " 보다는 " + arr2[1]);
		
		
	}

}
