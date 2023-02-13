package 배열응용;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열 {
	public static void main(String[] args) {
		// 배열에는 기본형 뿐만 아니라 참조형도 가능
		// 정수, 실수, 문자1, 논리 + String, JButton..
		// 기본형은 변수에 값이 저장
		// 참조형은 무조건 주소가 저장

		JFrame f = new JFrame();
		f.setSize(1000, 800);
		// 버튼 200개 들어갈 배열 만들기
		JButton[] buttons = new JButton[200];

		f.setLayout(null); // 위치 자동으로 잡아주는 부품 안씀.
		// null -> 조립해서 넣을 부품의 주소가 램에 없음.
		// 버튼 200개 만들어 배열에 저장
		for (int i = 0; i < buttons.length; i++) {
			Random r = new Random();
			int x=r.nextInt(800);
			int y=r.nextInt(700);
			buttons[i] = new JButton("버튼 " + i);
			buttons[i].setBounds(x, y, 100, 50);
			f.add(buttons[i]);
		}
		f.setVisible(true);
	}
}
