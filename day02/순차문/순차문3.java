package 순차문;

import javax.swing.JOptionPane;

//부품이 있는 위치를 알려주는 역할


public class 순차문3 {

	public static void main(String[] args) {
		//기본 순차문 == 입력 -> 처리 -> 출력
		//입력 -> 부품사용, 망치같은 언제나 바로 사용할 수 있는것!! 사용해보기
		String data1 = JOptionPane.showInputDialog("당신의 취미는? ");
		String data2 = JOptionPane.showInputDialog("언제하시나요? ");
		//처리 -> 글자연결
		String result = data1 + " " + data2;
		
		//출력 -> 모니터 화면에 보이고 싶음.
		JOptionPane.showMessageDialog(null, result);
	}

}
