package 프로그래머스;

public class 최대값구하기2 {
	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		double answer = sol.solution(numbers); // int[]
		System.out.println(answer);
	}
}

class Solution7 {
	public double solution(int[] numbers) {
		int post = numbers[numbers.length - 2] * numbers[numbers.length - 1];
		int pre = numbers[0] * numbers[1];
		int answer = 0;
		if(post > pre) {
			
			answer = post;
		}else {
			answer = pre;
		}
		return answer;
	}
}
