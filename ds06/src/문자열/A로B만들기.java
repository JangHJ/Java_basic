package 문자열;

import java.util.Arrays;

public class A로B만들기 {

	public static void main(String[] args) {
		String before = "olleh";
		String after = "hello";
		Solution1 sol = new Solution1();
		int answer = sol.solution(before, after);
		System.out.println(answer);
	}
}
class Solution1 {
	public int solution(String before, String after) {
		int answer = 0;
		
		char[] b = before.toCharArray();
		char[] a = after.toCharArray();
		
		Arrays.sort(b);
		Arrays.sort(a);
		
		if(Arrays.equals(a, b))
			answer = 1;
		
		return answer;
	}
}