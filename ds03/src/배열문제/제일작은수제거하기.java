package 배열문제;

import java.util.Arrays;

public class 제일작은수제거하기 {

	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 1 };
		Solution8 sol = new Solution8();
		int[] answer = sol.solution(arr);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution8 {
	public int[] solution(int[] arr) {
		int len = arr.length - 1;
		int[] answer = null;
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {//제일 작은 수 구하기
			if(arr[i] < min)
				min = arr[i];
		}
		
		if (len > 0) { //배열의 크기가 2 이상일 때
			answer = new int[len];
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] != min) {
					answer[count] = arr[i];
					count++;
				}
			}
		} else {
			answer = new int[1];
			answer[0] = -1;
		}
		return answer;
	}
}