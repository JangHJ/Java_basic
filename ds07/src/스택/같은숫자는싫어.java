package 스택;

import java.util.Arrays;
import java.util.Stack;

public class 같은숫자는싫어 {

	public static void main(String[] args) {
		int arr[] = {1,1,3,3,0,1,1};
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(arr[0]);
		for(int i=0; i<arr.length; i++) {
			if(stack.peek() != arr[i])
				stack.push(arr[i]);
		}
		int[] answer = new int[stack.size()];
		for(int i=0; i<stack.size(); i++) {
			answer[i] = stack.get(i);
		}
		System.out.println(Arrays.toString(answer));
	}

}
