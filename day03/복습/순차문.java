package 복습;

import javax.swing.JOptionPane;

public class 순차문 {

	public static void main(String[] args) {
		//입력 --> 처리 --> 출력
		//두개의 숫자를 입력받아 처리해서 출력
		//입력되는 값은 모두 string으로 취급
		//선언할 때 램에 저장공간인 변수가 만들어짐
		//데이터타입 변수명
		//입력
		 String n1= JOptionPane.showInputDialog("숫자 1 입력");
		 String n2= JOptionPane.showInputDialog("숫자 2 입력");
		 
		 //처리
		 //정수로 바꿔서 처리하고 싶으면 프로그래머가
		 //정수로 바꾸어주는 부품을 사용해 처리해야함
		 int n11 = Integer.parseInt(n1);
		 int n22 = Integer.parseInt(n2);
		 
		 //출력
		 System.out.println((double)n11 / n22);
	}

}
