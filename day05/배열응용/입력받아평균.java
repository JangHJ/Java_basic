package 배열응용;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		// 입력을 여러번 여러개 받아서
		// 저장공간에 넣고 싶을때 -> 배열 사용!
		// 1. 배열 만들기
		int[] jumsu = new int[5];
		int sum = 0; // 전체 합계
		int sum2 = 0; // 300이상 되는 숫자만 합계
		// 배열에 값을 넣을 때는 index가 필요 ==> i가 있는 for문 사용
		for (int i = 0; i < jumsu.length; i++) {
			String data = JOptionPane.showInputDialog("숫자 입력");
			// 숫자로 변환한 값을 배열의 해당 인덱스에 값으로 넣자
			jumsu[i] = Integer.parseInt(data);
		}
		for (int x : jumsu) {
			System.out.println(x + " ");
		}
		System.out.println();

		// 1. 합계 구해서, 평균구해보기
		for (int k : jumsu) {
			sum += k;
		}
		System.out.println("총 합계 : " + sum);
		// 2. 300이상 되는 숫자만 찾아서, 합계를 구해보세요
		System.out.print("300 이상인 숫자의 인덱스 위치 : ");
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				sum2 += jumsu[i];
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("300 이상인 숫자의 총합 : " + sum2);
		// 3. 심화문제, 300이상 되는 위치가 어딜까? 구해보기 index
	}

}
