package 스택;

import java.util.Arrays;
import java.util.Stack;

public class 제일작은수제거하기 {

	public static void main(String[] args) {
		int[] n = {4,3,2,1};
		Arrays.sort(n);
		Stack<Integer> stack = new Stack<Integer>();

		for(int item : n) {
			stack.push(item);
		}
		
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		int[] answer = new int[stack.size()];
		
		for(int i=answer.length-1; i >= 0; i--) {
			answer[i] = stack.pop();
		}
		System.out.println(Arrays.toString(answer));
		
		/*       
//      int len = arr.length - 1;
// 		int[] answer = null;
// 		int min = arr[0];
		
// 		for(int i=0; i<arr.length; i++) {//제일 작은 수 구하기
// 			if(arr[i] < min)
// 				min = arr[i];
// 		}
		
// 		if (len > 0) { //배열의 크기가 1 이상일 때
// 			answer = new int[len];
// 			int count = 0;
// 			for (int i = 0; i < arr.length; i++) {
// 				if(arr[i] != min) {
// 					answer[count] = arr[i];
// 					count++;
// 				}
// 			}
// 		} else {
// 			answer = new int[1];
// 			answer[0] = -1;
// 		}
		*/
	}

}
