package 반복문;

import javax.swing.JOptionPane;

public class 누적연습2 {

	public static void main(String[] args) {
		//iu = iu + 1
		//sum = sum + i
		
		//숫자누적
		int sum = 0;
		for (int i = 5; i <= 300; i++) { 
			if(i % 5 == 0)
				sum += i;
		}
		System.out.println("5의 배수만 더한 값은 >> " + sum);
		//글자누적
		String sum2 = "";
		for (int i = 0; i < 4; i++) {
			String data = JOptionPane.showInputDialog("먹고싶은 음식 입력");
			sum2 = sum2 + data + "랑 ";
		}
		System.out.println(sum2);
	}

}
