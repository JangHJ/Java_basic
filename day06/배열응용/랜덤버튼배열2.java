package 배열응용;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열2 {
	public static void main(String[] args) {
		//1. 프레임 만들기. 실행해서 눈으로 확인
		Random r = new Random();
		JFrame f = new JFrame();
		Color[] colors = {Color.red, Color.yellow, Color.green, Color.blue, Color.darkGray};
		//2. 프레임 설정. 레이아웃 설정x
		f.setSize(1000, 1000);
		f.setLayout(null);
		f.getContentPane().setBackground(Color.lightGray);
		//3. 버튼을 넣을 배열을 먼저 만들어두기
		JButton[] buttons = new JButton[500];
		//4. 버튼을 500개 만들어서 버튼 배열에 넣어주기
		//5. 버튼 배열에 있는 버튼을 꺼내서 위치 지정 후 f에 올리기
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼 " + (i+1));
			buttons[i].setOpaque(true);
			buttons[i].setBorderPainted(false);
			buttons[i].setBounds(r.nextInt(900), r.nextInt(900), 100, 50);
			buttons[i].setBackground(colors[r.nextInt(5)]);
			f.add(buttons[i]);
		}
		f.setVisible(true);
	}
}
