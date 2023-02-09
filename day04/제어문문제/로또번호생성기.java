package 제어문문제;

import java.util.Random;

public class 로또번호생성기 {
	public static void main(String[] args) {
		//아무값이나 발생시키는 부품 -> random
		Random r = new Random(); //씨앗값, seed값
//		for (int i = 0; i < 6; i++) {
//			System.out.println("로또 번호 : " + r.nextInt(10));
//		}
		
		//2~10
		for (int i = 0; i < 6; i++) {
			System.out.println("로또 번호 : " + (r.nextInt(9)+1));
			//0~8 ==> +2 2~10
		}
		
		System.out.println("==========");
		//3~20
		for (int i = 0; i < 6; i++) {
			System.out.println("로또 번호 : " + (r.nextInt(28)+3));
			//0~27 ==> +3 3~30
		}
	}
}
