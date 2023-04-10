package 배열;

import java.util.Scanner;

public class 입력해서배열에넣기2 {

	public static void main(String[] args) {
//		11.1
//		22.2
//		33.3
//		44.4
//		55.5
		Scanner sc = new Scanner(System.in);
		double[] numbers = new double[5]; 
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextDouble();
		}
		sc.close();//stream close
		for (double x : numbers) {
			System.out.println(x);
		}
		
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] == 33.3) {
				System.out.println("33.3위치는 " + i);
			}
			if(numbers[i] == 22.2) {
				System.out.println("22.2위치는 " + i);
			}
		}
	}
}