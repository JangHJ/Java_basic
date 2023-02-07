package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 미션2 {

	public static void main(String[] args) {
		// JFrame
		// JButton
		JFrame f = new JFrame();
		
		
		f.setSize(580, 820);
		
		//물흐르듯 순서대로 배치해주는 부품을 램에 복사해서 가져오기\
		//FlowLayout
		FlowLayout flow = new FlowLayout();
		//f에 물흐르듯 배치해주는 부품을 쓰겠다 설정
		f.setLayout(flow);
		
		ImageIcon icon1 = new ImageIcon("img1.png");
		ImageIcon icon2 = new ImageIcon("img2.png");
		ImageIcon icon3 = new ImageIcon("img3.png");
		
		JLabel img1 = new JLabel();
		img1.setIcon(icon1);
		JLabel img2 = new JLabel();
		img1.setIcon(icon2);
		JLabel img3 = new JLabel();
		img1.setIcon(icon3);
		
		JLabel title1 = new JLabel();
		title1.setText("K-pop 인기 투표");
		
		JLabel text1 = new JLabel();
		text1.setText("아이유-라일락");
		
		JLabel text2 = new JLabel();
		text2.setText("프로미스나인-we go");
		
		JLabel text3 = new JLabel();
		text3.setText("스테이씨-ASAP");
		
		Font font = new Font("굴림", 1, 60);
		
		text1.setFont(font);
		text2.setFont(font);
		
		f.add(img1);
		f.add(text1);
		f.add(text2);
		//프레임 보여주기
		f.setVisible(true);
	}

}
