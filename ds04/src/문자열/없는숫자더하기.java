package 문자열;

import java.util.Arrays;

public class 없는숫자더하기 {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6,7,8,0};
		
		Solution3 sol = new Solution3();
		int answer = sol.solution(numbers);
		System.out.println(answer);
	}
}

class Solution3 {
	public int solution(int[] numbers) {
		int answer = 0;
		boolean[] arr = new boolean[10];

		System.out.println(Arrays.toString(arr));
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<10; j++) {
				if(numbers[i] == j){
					arr[j] = true;

					System.out.println(j + "번째" + Arrays.toString(arr));
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == false) {
				answer += i;
			}
		}
		return answer;
	}
}