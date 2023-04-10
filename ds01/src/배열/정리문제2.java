package 배열;

import java.util.Arrays;

public class 정리문제2 {

	public static void main(String[] args) {
//		6. String s5 = “ [ 10, 20, 30, 40, 50]”에서 모든 데이터를 꺼내어 합한 값을 프린트(힌트)
//				[, ] – replace()를 이용하여 제거 
//				  10 - trim()을 이용하여 공백 제거
//				,를 기준으로 split()를 이용하여 배열로 분리
//				배열로 분리된 값을 꺼내 정수로 변환후, 합해줌.
//				7.  위 6번에서 생성된 String[]의 값을 새로운  int[]로 옮겨서 오름차순 정렬후, 프린트!
		//6번
		String s5 = "[ 10, 20, 30, 40, 50]";
		int sum = 0;
		
		s5 = s5.replace("[", "");
		s5 = s5.replace("]", "");
		s5 = s5.trim();
		String[] s55 = s5.split(", ");
		for(String s : s55) {
			sum += Integer.parseInt(s);
		}
		System.out.println("합계 : " + sum);
		
		//7번
		int s6[] = new int[s55.length];
		for(int i=0; i<s6.length; i++) {
			s6[i] = Integer.parseInt(s55[i]);
		}
		Arrays.sort(s6);
		for(int x : s6) {
			System.out.println(x);
		}
	}
}
