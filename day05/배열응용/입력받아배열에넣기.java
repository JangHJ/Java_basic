package 배열응용;

import java.util.Scanner;

public class 입력받아배열에넣기 {

	public static void main(String[] args) {
		String[] lastyear = new String[3];
		String[] thisyear = new String[3];
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < lastyear.length; i++) {
			System.out.print("작년에 가고 싶었던 세 곳 입력 : ");
			lastyear[i] = sc.next();
		}
		for (int j = 0; j < thisyear.length; j++) {
			System.out.print("올해에 가고 싶었던 세 곳 입력 : ");
			thisyear[j] = sc.next();
		}
		
		for (int k = 0; k < thisyear.length; k++) {
			if(lastyear[k].equals(thisyear[k]))
				count++;
		}
		System.out.println("작년과 올해 가고싶은 곳과 우선순위가 동일한 곳의 수 : " + count);
		
		sc.close();
	}

}
