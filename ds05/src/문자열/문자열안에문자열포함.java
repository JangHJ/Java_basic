package 문자열;

public class 문자열안에문자열포함 {

	public static void main(String[] args) {
		String str1 = "ab6CDE443fgh22iJKlmn1o";
		String str2 = "6CD";
		Solution1 sol = new Solution1();
		int answer = sol.solution(str1, str2);
		System.out.println(answer);
	}
}

class Solution1 {
	public int solution(String str1, String str2) {
		return str1.contains(str2) ? 1 : 2;
	}
}