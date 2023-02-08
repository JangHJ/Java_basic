package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품조립하기 {

	public static void main(String[] args) {
		//1. 자주써서 Ram에 언제든 사용할 수 있도록 준비되있음
		//	망치
		//	부품명.기능()
		
		//2.쓸때마다 제공되는 틀을 이용해 찍어내서 여러개 만들기
		//	저장해두고 사용
		//	벽돌
		//	JFrame f = new JFrame();
		
		JFrame f = new JFrame();
		f.setSize(500, 400);
		
		JLabel label = new JLabel();
		label.setText("당신이 생각한 숫자를 입력하세요.");
		
		JTextField text = new JTextField(10);
		JButton b = new JButton();
		
		FlowLayout flow = new FlowLayout();
		
		Font font = new Font("d2coding", 1, 20);
		Font font2 = new Font("d2coding", 1, 30);
		
		f.setLayout(flow);
		f.getContentPane().setBackground(Color.green);
		f.add(label);
		f.add(text);
		f.add(b);
		
		label.setFont(font);
		

		text.setFont(font2);
		text.setBackground(Color.pink);
		text.setForeground(Color.blue);
		
		b.setFont(font2);
		b.setText("숫자맞추기 게임");
		b.setBackground(Color.yellow);
		
		
		f.setVisible(true);
		
	}

}
