package 문자열;

public class 수박수박수박수 {

	public static void main(String[] args) {
		int n = 3;
		StringBuilder answer = new StringBuilder();
		char[] c = { '수', '박' };
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0)
				answer.append(c[1]);
			else
				answer.append(c[0]);
		}
		System.out.println(answer.toString());
	}

}
