package 정렬;

import java.util.Arrays;

public class SwapTest_자리바꾸기4 {

	public static void main(String[] args) {
		String[] str = {"햄버거", "샌드위치", "커피"};
		System.out.println("수정 전 출력");
		print(str);
		swap(str, 0, 1); //햄버거, 샌드위치 바꾸어보세요.
		System.out.println("수정 후 출력");
		print(str);
	}
	
	public static void swap(String[] str, int idx1, int idx2) {
		System.out.println(str[idx1] + ", " + str[idx2]);
		String temp = str[idx1];
		str[idx1] = str[idx2];
		str[idx2] = temp;
	}
	
	public static void print(int[] num) {
		System.out.println(Arrays.toString(num));
	}
	public static void print(String[] str) {
		System.out.println(Arrays.toString(str));
	}
}