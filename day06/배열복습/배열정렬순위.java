package 배열복습;

import java.util.Arrays;
import java.util.Random;

//import javax.swing.JOptionPane;

public class 배열정렬순위 {

	public static void main(String[] args) {
		//정렬을 할 때는 Arrays
		Random r = new Random(42); //seed 씨앗값
		int[] jumsu = new int[10000];
		
		//for문: 입력, 출력, i활용 가능
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(1000)+1; //1~1000
		}
		System.out.println("-----정렬전-----");
		//for-each : 알아서 위치값을 옮겨주면서 하나씩 출력
		//	출력용
		for (int x : jumsu) {
			System.out.println(x);
		}
		Arrays.sort(jumsu);
		//sort(jumsu) ==> jumsu가 바뀌어 버림(원본파괴)
		//파괴형 함수
		
//		String n = JOptionPane.showInputDialog("숫자입력 : ");
//		int n2 = Integer.parseInt(n);
		//parseInt(n) ==> ram에 저장된 n이 변경된 건 아님(원본이 비파괴)
		//비파괴형 함수
		
		System.out.println("-----정렬후-----");
		for (int x : jumsu) {
			System.out.println(x);
		}
		
		//정렬 후 최대값 최소값 출력
		System.out.println("최소값 : " + jumsu[0]);
		System.out.println("최댓값 : " + jumsu[jumsu.length-1]);

		//상위 30%, 인원 3000명, 높은 점수부터 3000개 추출
		System.out.println("-----상위 30% 추출-----");
		int sum = 0;
		for (int i = 1; i <= 3000; i++) {
			System.out.println(i + "번째 :" + jumsu[jumsu.length-i]);
			sum += jumsu[jumsu.length-i];
		}
		System.out.println("상위 30%의 평균 : "+ sum / 3000.0);
		int sum2 = 0;
		
		//하위 30%의 평균
		for (int i = 1; i < 3000; i++) {
			sum2 += jumsu[i];
		}System.out.println("하위 30%의 평균 : "+ sum2 / 3000.0);
		
		String result = Arrays.toString(jumsu);
		System.out.println(result);
	}

}
