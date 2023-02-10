package 배열응용;

import java.lang.reflect.Array;
import java.util.Random;

public class 수능만점자문제 {
	public static void main(String[] args) {
//		수능 10000명의 점수를 처리! ==> 배열 필요
		int[] jumsu = new int[10000];
		// jumsu = {0 , 0 ,0, 0, 0, .....};
		// 주소 jumsu[0] jumsu[1]

//		랜덤으로 10000명의 넣어주세요. ==> Random필요
		Random r = new Random(42);
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(451); // 0-450
		}

		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(i + ": " + jumsu[i]);
		}
		System.out.println("--------------------");
//		0~450
//		1) 만점자가 몇 명인지?? 누구인지(인덱스)
//		2) 0점이 몇 명인지??
		int maxCount = 0;
		int zeroCount = 0;
		for (int x : jumsu) {
			// 점수가 450과 동일한지 체크해서 true이면
			// 카운트 증가하면 됨.
			if (x == 450) {
				maxCount++; // maxCount = maxCount + 1;
			} // if
			if (x == 0) {
				zeroCount++;
			} // if
		} // for
		System.out.println("수능 만점자: " + maxCount + "명");
		System.out.println("수능 0점자: " + zeroCount + "명");
//		3) 평균은 어떻게 되었는지?? 합계를 먼저 구해야함.
		int sum = 0;
		for (int x : jumsu) {
			sum = sum + x; // sum += x;
		}
		double avg = (double) sum / jumsu.length;
		System.out.println("전체 수험생의 평균은 " + avg);

//		4) 심화)) 평균보다 +-50점 인 학생 카운트(포함)>=
		int avgPlusMinus = 0; // 선언!할때 자바는 변수를 만들어준다.!!
		// 250~350, avg = 300인 경우
		// avg-50 <= x <= avg+50 --> avg-50 <= x && x <= avg+50
		for (int x : jumsu) {
			if ((avg - 50 <= x) && (x <= avg + 50)) {
				avgPlusMinus++;
			}
		} // for
		System.out.println("평균 범위에 있는 수험생수는 " + avgPlusMinus + "명");
		
		//점수의 상위 30%

	}
}