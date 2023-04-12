package 배열문제;

public class 좌표위치구하기 {

	public static void main(String[] args) {
		int[] dot = { 3, 2 };
		Solution2 sol = new Solution2();
		int answer = sol.solution(dot);
		System.out.println(answer);
	}
}

class Solution2 {
	public int solution(int[] dot) {
		if (dot[0] > 0) {
			if (dot[1] > 0)
				return 1;
			else
				return 4;
		} else {
			if (dot[1] > 0)
				return 2;
			else
				return 3;
		}
	}
}