package 정렬;

import java.util.Arrays;

public class SwapTest_자리바꾸기3 {

	public static void main(String[] args) {
		int[] num = {6,1,2,3,5,9};
		print(num);
		swap(num, 0, 5);
		print(num);
	}
	public static void swap(int[] num, int x, int y) {
		System.out.println(num[x] + ", " + num[y]);
		int temp = num[x];
		num[x] = num[y];
		num[y] = temp;
		System.out.println(num[x] + ", " + num[y]);
	}
	public static void print(int[] num) {
		System.out.println(Arrays.toString(num));
	}
}
