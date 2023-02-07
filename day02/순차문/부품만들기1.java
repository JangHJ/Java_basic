package 순차문;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 부품만들기1 {

	public static void main(String[] args) {
		// 자주 사용하지 않는 부품 만들기
		//new: 틀을 가지고 찍어낼때 사용
		//new JFrame()은 JFrame이라는 틀을 이용해서 부품을 찍어내라는 뜻
		//만든 부품은 모두다 ram에 저장됨.
		//f변수 만들어서 부품 넣어주기
		//f에는 JFrame이 저장되어야 함
		JFrame f = new JFrame();
		f.setSize(300, 300);
		
		JButton b1 = new JButton();
		b1.setText("나는 버튼1");
		f.add(b1);
		
		f.setVisible(true);
	}

}
