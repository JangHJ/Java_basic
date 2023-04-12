package 배열문제;

import java.util.Arrays;

public class 중앙값구하기 {
	public static void main(String[] args) {
		int[] array = {1, 2, 7, 10, 11};
		Solution sol = new Solution();
		int answer = sol.solution(array);
		System.out.println(answer);
	}	
}

class Solution {
	public int solution(int[] array) {

		Arrays.sort(array);
		return array[(array.length / 2)];
	}
}