package 프로그래머스기본;

public class k의개수 {

	public static void main(String[] args) {
		int i = 1;
		int j = 13;
		int k = 1;
		Solutionk sol = new Solutionk();
		int answer = sol.solution(i, j, k);
		System.out.println(answer);
	}
}

class Solutionk {
	public int solution(int i, int j, int k) {
		int answer = 0;
		// 1. 숫자 자리수마다 k와 비교
		for (int x = i; x <= j; x++) {
			int x2 = x;
			while (x2 != 0) {
				if (x2 % 10 == k)
					answer++;
				x2 /= 10;
			}
		}

		// 2. 배열로 만들어서 각 자리수 k와 비교
//		String k2 = String.valueOf(k);
//		for (int x = i; x <= j; x++) {
//			String x2 = String.valueOf(x);
//			String[] arr = x2.split("");
//
//			for (int q = 0; q < arr.length; q++) {
//				if (arr[q].equals(k2))
//					answer++;
//			}
//		}

		// 3. 문자열로 변환 후 charAt으로 비교
//		String k2 = String.valueOf(k);
//		for (int x = i; x <= j; x++) {
//			if (x <= 10) {
//				if (String.valueOf(x).contains(k2)) {
//					answer++;
//					System.out.println(x);
//				}
//			} else {
//				String x2 = String.valueOf(x);
//				int len = x2.length();
//				for (int c = 0; c < len; c++) {
//					if (x2.charAt(c) - 48 == k) {
//						answer++;
//					}
//				}
//			}
//		}
		return answer;
	}
}