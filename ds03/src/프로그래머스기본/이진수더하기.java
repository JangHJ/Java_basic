package 프로그래머스기본;

public class 이진수더하기 {
	public static void main(String[] args) {
		String bin1 = "10"; // 이진수1
		String bin2 = "11"; // 이진수2
		Solution3 sol = new Solution3();
		String answer = sol.solution(bin1, bin2);
		System.out.println(answer);
	}
}

class Solution3 {
	public String solution(String bin1, String bin2) {
		int b1 = Integer.parseInt(bin1, 2);
		int b2 = Integer.parseInt(bin2, 2);
		return Integer.toBinaryString(b1 + b2);
	}
}