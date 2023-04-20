package 정렬;

import java.util.Arrays;

public class SwapTest_자리바꾸기2 {

	public static void main(String[] args) {
		int[] num = {6,1,2,3,5,9};
		print(num);
		
		//num[0] --> 6, num[5] --> 9
		swap(num[0], num[5]);
		
		int temp = num[5];
		num[5] = num[0];
		num[0] = temp;
		print(num);
	}
	public static void swap(int x, int y) {
		System.out.println(x + ", " + y);
		int temp = y;
		y = x;
		x = temp;
		System.out.println(x + ", " + y);
	}
	public static void print(int[] num) {
		System.out.println(Arrays.toString(num));
	}
}
