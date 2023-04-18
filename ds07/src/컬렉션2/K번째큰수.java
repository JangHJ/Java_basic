package 컬렉션2;

import java.util.Arrays;

public class K번째큰수 {

	public static void main(String[] args) {
		int[] num = {3, 4, 5, 1, 2, 8, 7, 6};
		int k = 2; //2번째
		//일단 정렬하기
		//정렬한 데이터 중에 2번째 위치 찾기
		Arrays.sort(num);
		for(int x : num) {
			System.out.println(x + " ");
		}
		System.out.println();
		String num2 = Arrays.toString(num);
		System.out.println(num2);
		System.out.println(Arrays.toString(num));
		
		//System.out.println("제일 큰 수 : " + num[4]);
		System.out.println("제일 큰 수 : " + num[num.length-1]);
		//첫번째 큰수 num.length -1
		//두번째 큰수 num.length -2
		System.out.println("두번째 큰수 : " + num[num.length-2]);
		System.out.println("세번째 큰수 : " + num[num.length-3]);
		System.out.println(k + "번째 큰수 : " + num[num.length-k]);
	}
}
