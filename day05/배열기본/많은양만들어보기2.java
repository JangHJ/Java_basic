package 배열기본;

import java.util.Random;

public class 많은양만들어보기2 {

	public static void main(String[] args) {
		int[] jumsu2 = new int[1000];
		int count = 0;
		int sum = 0;
		Random r = new Random(10);
		
		//2부터 20까지 임의로 만들어서 배열에 넣어보기
		for (int i = 0; i < jumsu2.length; i++) {
			jumsu2[i] = r.nextInt(19)+2;
		}
		//전체프린트
		for (int x : jumsu2) {
			if(x >= 3) //3이상인 숫자 개수 체크
			{
				count++;
				sum += x;
			}
			System.out.println(x);
		}
		System.out.println("========================");
		//3이상인 숫자가 몇개인지 프린트
		System.out.println("3 이상인 숫자의 개수 : " + count);
		System.out.println("3 이상인 숫자의 개수의 총합 : " + sum);
		
	}
}
