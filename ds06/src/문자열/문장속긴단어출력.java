package 문자열;

import java.util.Scanner;

public class 문장속긴단어출력 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] total = in.nextLine().split(" ");
		int maxLength = total[0].length();
		String maxString = total[0];
		
		for(String s : total) {
			if(s.length() > maxLength) {
				maxLength = s.length();
				maxString = s;
			}
		}
		System.out.println(maxString);
		in.close();
	}	
}
