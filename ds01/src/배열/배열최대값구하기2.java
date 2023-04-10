package 배열;

import java.util.Random;

public class 배열최대값구하기2{

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		Random r = new Random();
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(1000);
		}
		int max = arr[0];
		for(int x : arr) {
			if(max < x)
				max = x;
		}
		System.out.println("최대값 : " + max);
	}
}
