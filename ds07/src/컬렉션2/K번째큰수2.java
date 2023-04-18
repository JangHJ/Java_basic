package 컬렉션2;

import java.util.Arrays;

public class K번째큰수2 {

	public static void main(String[] args) {
		int[] num = { 3, 4, 5, 1, 2, 8, 7, 6 };
		int k = 3; // 3번째 큰수
		Arrays.sort(num); //원본을 정렬해서 다시 저장 
		System.out.println(Arrays.toString(num));
		System.out.println(k +"번째 큰수: " + num[num.length -k]);
	}

}