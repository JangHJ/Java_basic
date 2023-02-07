package 순차문;

import javax.swing.JOptionPane;

//부품이 있는 위치를 알려주는 역할


public class BMI {

	public static void main(String[] args) {
		//기본 순차문 == 입력 -> 처리 -> 출력
		//입력 -> 부품사용, 망치같은 언제나 바로 사용할 수 있는것!! 사용해보기
		String height = JOptionPane.showInputDialog("신장(cm)을 입력하세요 ");
		String weight = JOptionPane.showInputDialog("체중(kg)을 입력하세요 ");
		
		
		double h = Double.parseDouble(height);
		double w = Double.parseDouble(weight);
		
		double result = w / ((h/100)*(h/100));
		
		//출력 -> 모니터 화면에 보이고 싶음.
		System.out.println(result);
	}

}
