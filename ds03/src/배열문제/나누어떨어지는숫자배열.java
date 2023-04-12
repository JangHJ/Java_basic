package 배열문제;

import java.util.ArrayList;
import java.util.Arrays;

public class 나누어떨어지는숫자배열 {

	public static void main(String[] args) {
		int[] array = { 3, 2, 6 };
		int divisor = 10;
		Solution5 sol = new Solution5();
		int[] answer = sol.solution(array, divisor);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution5 {
	public int[] solution(int[] arr, int divisor) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}
		int[] answer = null;
		if(list.size() != 0) {
			answer = new int[list.size()]; //{0,0}
			for(int i = 0;i < list.size(); i++) {
				answer[i] = list.get(i);
			}
			Arrays.sort(answer);
		}else {
			answer = new int[1];
			answer[0] = -1;
		}
		return answer;
	}
}