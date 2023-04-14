package 문자열;

import java.util.Arrays;

public class String에서Char배열에옮기기3 {

	public static void main(String[] args) {
		String s = "s205621"; //index 이용해서 추출
		char c1 = s.charAt(3);
		char c2 = s.charAt(4);
		
		String s2 = String.valueOf(c1) + String.valueOf(c2);
		System.out.println(s2);
		
		System.out.println(s.substring(3, 5));
		
		char[] result = new char[2];
		s.getChars(3, 5, result, 0);
		System.out.println(Arrays.toString(result));
			
	}
}
