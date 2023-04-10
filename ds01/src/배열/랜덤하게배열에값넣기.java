package 배열;

import java.util.Random;

public class 랜덤하게배열에값넣기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int[] weight = new int[5];
		
		for(int i=0; i<weight.length; i++) {
			weight[i] = r.nextInt(70)+30;
			System.out.println(i+1 + "번째 인덱스 : " + weight[i]);
		}
	}

}
