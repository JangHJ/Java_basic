package 문자열;

import java.util.Arrays;

public class 서울에서김서방찾기2 {

	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		String answer = "";
		int index = Arrays.asList(seoul).indexOf("Kim");
		
		answer = "김서방은 " + index + "에 있다";
		System.out.println(answer);
	}

}
