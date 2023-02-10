package 배열기본;

public class 확인문제 {
	public static void main(String[] args) {
		String[] trip = { "런던", "파리", "뉴욕", "싱가포르", "캐나다" };
		char[] color = { 'r', 'g', 'b', 'y', 'o' };
		double[] height = { 173.5, 181.5, 159.8, 160.4, 175.2 };

		for (int i = 0; i < trip.length; i++) {
			System.out.println("인덱스 " + i + "번째 : " + trip[i]);
		}
		for (int j = 0; j < color.length; j++) {
			System.out.println("인덱스 " + j + "번째 : " + color[j]);
		}
		for (Double h : height) {
			System.out.println(h);
		}
//		for (int i = 0; i < height.length; i++) {
//
//		}

	}
}
