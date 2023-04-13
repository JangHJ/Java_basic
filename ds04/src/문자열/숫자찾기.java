package 문자열;

public class 숫자찾기 {

	public static void main(String[] args) {
		int num = 29183;
		int k = 1;
		Solution sol = new Solution();
		int answer = sol.solution(num, k);
		System.out.println(answer);
	}
}

class Solution {
	public int solution(int num, int k) {
		int answer = 0;
		String s = String.valueOf(num);
		String s2 = String.valueOf(k);

		if (s.indexOf(s2) == -1)
			answer = -1;
		else
			answer = s.indexOf(s2) + 1;

		return answer;
	}
}