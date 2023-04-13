package 문자열;

public class 편지 {

	public static void main(String[] args) {
		String message = "happy birthday!";
		Solution2 sol = new Solution2();
		int answer = sol.solution(message);
		System.out.println(answer);
	}
}

class Solution2 {
	public int solution(String message) {
		return message.length()*2;
	}
}