package 배열응용;

import java.util.Random;

public class 수능점수 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] score = new int[10000];
		int zero = 0;
		int sum = 0;
		int avg = 0;
		int max_cnt = 0;
		int avg_cnt = 0;
		
		for (int i = 0; i < score.length; i++) {
			score[i] = r.nextInt(451);
		}
		System.out.println("-----만점자 리스트-----");
		for (int j = 0; j < score.length; j++) {
			if(score[j] == 0)
				zero++;
			else if(score[j] == 450)
			{
				System.out.println(j + "번 수험생");
				max_cnt++;
			}
			sum += score[j];
		}
		System.out.println("만점자 : " + max_cnt + "명");
		avg = sum/10000; //평균 > 총합계 / 10000
		for (int k = 0; k < score.length; k++) {
			if(score[k] >= avg-50 && score[k] <= avg+50)  //평균-50보다 같거나 크고 평균+50보다 같거나 작은 사람
				avg_cnt++;
		}
		System.out.println("------------------");
		System.out.println("평균 점수 : " + avg);
		System.out.println("0점 맞은 사람 : " + zero);
		System.out.println("평균 ±50점인 사람 : " + avg_cnt);
	}

}
