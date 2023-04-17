package 문자열;

import java.util.Arrays;

public class 문자열내림차순배치2 {
	public static void main(String[] args) {
		String s = "Zbcedfg";
		char[] c = s.toCharArray();
		Arrays.sort(c);
		String s2 = new String(c);
		StringBuilder sb = new StringBuilder(s2);
		String answer = sb.reverse().toString();
		System.out.println(answer);
	}
}
