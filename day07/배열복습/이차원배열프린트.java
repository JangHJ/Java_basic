package 배열복습;

import java.util.Random;

public class 이차원배열프린트 {
	public static void main(String[] args) {
		Random r = new Random();
		int[][] n1 = {
				{1,2,3},
				{1,2,3,4},
				{1,2,3,4,5}
		};
		for (int i = 0; i < n1.length; i++) {
			for (int j = 0; j < n1[i].length; j++) {
				System.out.print(n1[i][j] + " ");
			}
			System.out.println();
		}
		//2. 배열 처음 만들 때 값을 모르는 경우
		int[][] n2 = new int[4][5];
		int[] r0 = new int[10];
		int[] r1 = new int[15];
		int[] r2 = new int[12];
		n2[0] = r0;
		n2[1] = r1;
		n2[2] = r2;
		
		for (int i = 0; i < n2.length; i++) {
			for (int j = 0; j < n2[i].length; j++) {
				n2[i][j] = r.nextInt(101)+1;
				System.out.print(n2[i][j] + " ");
			}
			System.out.println();
		}
	}
}
