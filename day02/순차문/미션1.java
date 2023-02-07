package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 미션1 {

	public static void main(String[] args) {
		// JFrame
		// JButton
		JFrame f = new JFrame();
		
		
		f.setSize(540, 820);
		
		//물흐르듯 순서대로 배치해주는 부품을 램에 복사해서 가져오기\
		//FlowLayout
		FlowLayout flow = new FlowLayout();
		//f에 물흐르듯 배치해주는 부품을 쓰겠다 설정
		f.setLayout(flow);
		
		ImageIcon icon = new ImageIcon("img1.png");
		
		JLabel img1 = new JLabel();
		img1.setIcon(icon);
		
		JLabel text1 = new JLabel();
		text1.setText("숫자1");
		
		JLabel text2 = new JLabel();
		text2.setText("숫자2");
		
		JButton b1 = new JButton();
		b1.setText("+");
		JButton b2 = new JButton();
		b2.setText("-");
		JButton b3 = new JButton();
		b3.setText("*");
		JButton b4 = new JButton();
		b4.setText("/");
		
		//글자 넣는 곳.
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		
		Font font = new Font("굴림", 1, 50);
		
		text1.setFont(font);
		input1.setFont(font);
		text2.setFont(font);
		input2.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		b1.setBackground(Color.blue);
		b1.setForeground(Color.white);
		b2.setBackground(Color.blue);
		b2.setForeground(Color.white);
		b3.setBackground(Color.blue);
		b3.setForeground(Color.white);
		b4.setBackground(Color.blue);
		b4.setForeground(Color.white);
		input1.setBackground(Color.gray);
		input1.setForeground(Color.white);
		input2.setBackground(Color.gray);
		input2.setForeground(Color.white);
		
		f.add(img1);
		f.add(text1);
		f.add(input1);
		f.add(text2);
		f.add(input2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		//프레임 보여주기
		f.setVisible(true);
	}

}
