package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품만들기2 {

	public static void main(String[] args) {
		// JFrame
		// JButton
		JFrame f = new JFrame();
		f.setSize(780, 1000);
		
		//물흐르듯 순서대로 배치해주는 부품을 램에 복사해서 가져오기\
		//FlowLayout
		FlowLayout flow = new FlowLayout();
		//f에 물흐르듯 배치해주는 부품을 쓰겠다 설정
		f.setLayout(flow);
		
		JButton b1 = new JButton();
		b1.setText("Button1");
		JButton b2 = new JButton();
		b2.setText("Button2");
		
		JLabel text1 = new JLabel();
		text1.setText("아이디");
		
		JLabel text2 = new JLabel();
		text2.setText("패스워드");
		
		//글자 넣는 곳.
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		
		Font font = new Font("궁서", 1, 20);
		
		text1.setFont(font);
		text2.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		input1.setFont(font);
		input2.setFont(font);
		
		b1.setBackground(Color.red);
		b1.setForeground(Color.white);
		b2.setBackground(Color.blue);
		b2.setForeground(Color.white);
		input1.setBackground(Color.red);
		input1.setForeground(Color.white);
		input2.setBackground(Color.blue);
		input2.setForeground(Color.white);

		//cat.jpg 파일명을 쓰면 해당 프로젝트 바로 아래에 있는 것으로 인식
		ImageIcon icon = new ImageIcon("cat.jpg");
		ImageIcon icon2 = new ImageIcon("puppy.jpg");
		
		b1.setIcon(icon);
		b2.setIcon(icon2);
		
		f.add(text1);
		f.add(input1);
		f.add(b1);
		f.add(text2);
		f.add(input2);
		f.add(b2);		
		//프레임 보여주기
		f.setVisible(true);
	}

}
