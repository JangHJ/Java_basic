package 프로그래머스;

import java.util.Arrays;

public class 등수매기기 {

	public static void main(String[] args) {
		int[][] score = {{80,70},{90,50},{40,70},{50,80}};
		Solution2 sol = new Solution2();
		int[] answer = sol.solution(score);
		System.out.println(Arrays.toString(answer));
		System.out.println(answer);
	}
}

//프로그래머스 치킨은 치킨을 시켜먹으면 한 마리당 쿠폰을 한 장 발급합니다.
//쿠폰을 열 장 모으면 치킨을 한 마리 서비스로 받을 수 있고, 서비스 치킨에도 쿠폰이 발급됩니다.
//시켜먹은 치킨의 수 chicken이 매개변수로 주어질 때 받을 수 있는 최대 서비스 치킨의 수를
//return하도록 solution 함수를 완성해주세요.

class Solution2 {
	public int[] solution(int[][] score) {
		int[] answer = new int[score.length];
		int[] avg = new int[score.length];
		
		for(int i=0; i<score.length; i++) {
			int sum = 0;
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
			}
			avg[i] = sum;
		}
		
		for(int i=0; i<avg.length; i++) {
			answer[i] = 1;
			for(int j=0; j<avg.length; j++) {
				if(avg[i] < avg[j])
					answer[i]++;
			}
		}
		return answer;
	}
}