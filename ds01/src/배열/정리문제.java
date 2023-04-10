package 배열;

import java.util.Random;
import java.util.Scanner;

public class 정리문제 {

	public static void main(String[] args) {
		//1번
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int min = arr[0];
		for(int a : arr) {
			if(min > a) {
				min = a;
			}
		}
		System.out.println("최소값 : " + min);
		System.out.println("---------------------------------------------");
		//2번
		Random r = new Random();
		int arr2[] = new int[20];
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = r.nextInt(900);
		}
		int max = arr2[0];
		for(int i=0; i<arr2.length; i++) {
			if(max < arr2[i]) {
				max = arr2[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("---------------------------------------------");
		
		//3번
		String s1 = "참좋다";
		String s2 = "진짜좋다";
		
		if(s1.equals(s2))
			System.out.println("두 문자열이 동일합니다.");
		else
			System.out.println("두 문자열은 동일하지 않습니다.");
		
		if(s1.length() > s2.length()) {
			System.out.println("s1의 글자수가 더 큽니다.");
		}else if(s1.length() < s2.length()) {
			System.out.println("s2의 글자수가 더 큽니다.");
		}else {
			System.out.println("s1과 s2의 글자수가 동일합니다.");
		}
		System.out.println("---------------------------------------------");
		
		//4번
		String s3 = "나는 진짜 java programmer가 되었어";
		String s33 = s3.substring(6, 21);
		System.out.println(s33.toUpperCase());
		System.out.println("---------------------------------------------");
		
		//5번
		String s4 = "2056521";
		if(s4.charAt(0) == '1')
			System.out.println("남자");
		else if(s4.charAt(0) == '2')
			System.out.println("여자");
		System.out.println("---------------------------------------------");
	}
}
