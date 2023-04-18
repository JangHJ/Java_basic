package 스택;

import java.util.Arrays;
import java.util.Stack;

public class 자연수뒤집어배열로만들기 {

	public static void main(String[] args) {
		long n = 12345;
		
		//하나씩 분리시키고,
		String[] s = String.valueOf(n).split(""); 
		//       s = {"1", "2", "3", "4", "5"};
		//stack에 순서대로 넣고,
		Stack<String> stack = new Stack<>();
		for (String x : s) {
			stack.push(x);
		}
		System.out.println(stack);
		System.out.println(stack.peek()); //top을 확인
		System.out.println(stack.get(0)); //0이 bottom
		
		//int[]에 옮기기 
		int[] answer = new int[stack.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = Integer.parseInt(stack.pop());
		}
		System.out.println(Arrays.toString(answer));
	}

}
