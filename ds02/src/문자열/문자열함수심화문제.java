package 문자열;

import java.util.Arrays;

public class 문자열함수심화문제 {

	public static void main(String[] args) {
		String s5 = "[  10, 20, 30, 40, 50]";
		s5 = s5.replace("[", "");
		s5 = s5.replace("]", "");
		System.out.println(s5);

		s5 = s5.trim();
		System.out.println(s5);

		System.out.println(s5.length()); // 18글자
		String[] s55 = s5.split(", "); // {"10", "20", "30", ~~~}
		System.out.println(s55[0]);
		System.out.println(s55[1]);
		System.out.println(s55[2]);

		int sum = 0; // "10" --> 10, "20" --> 20 ==> 10 + 20(30)

		for (String x : s55) { // {"10", "20", "30", ~~~}
			int x2 = Integer.parseInt(x);
			sum = sum + x2;
		}

		System.out.println(sum);
		System.out.println(s55.length);
		int[] newArray = new int[s55.length];// {0,0,0,0,0}
		// {"10", "20", "30", ~~~}
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = Integer.parseInt(s55[i]);
		}
		System.out.println(Arrays.toString(newArray));
	}
}