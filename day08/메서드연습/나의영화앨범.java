package 메서드연습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 나의영화앨범 {

	static int index = 2; // 현재 2부터 시작

	public static void main(String[] args) {
		String[] title = { "더 퍼스트 슬램덩크", "타이타닉", "아바타:물의 길", "영웅", "유령" };
		String[] img = { "movie1.jpg", "movie2.jpg", "movie3.jpg", "movie4.jpg", "movie5.jpg" };
		double[] grade = { 9.28, 9.72, 8.82, 8.43, 6.88 };
		Font font = new Font("맑은 고딕", Font.BOLD, 35);

		JFrame f = new JFrame();
		f.setSize(560, 560);
		f.getContentPane().setBackground(Color.cyan);

		// 배치부품(객체)를 바꾸어주지 않으면 경계레이아웃을 사용하도록 세팅
		// BorderLayout
		JLabel top = new JLabel(title[2]);
		top.setFont(font);
		top.setHorizontalAlignment(0);
		f.add(top, BorderLayout.NORTH);

		JLabel center = new JLabel(new ImageIcon(img[2]));
		center.setFont(font);
		center.setHorizontalAlignment(0);
		f.getContentPane().add(center, BorderLayout.CENTER);

		JLabel bottom = new JLabel(String.valueOf(grade[2]));
		bottom.setHorizontalAlignment(0);
		bottom.setFont(font);
		bottom.setForeground(Color.blue);
		f.getContentPane().add(bottom, BorderLayout.SOUTH);

		JButton left = new JButton("왼  쪽");
		left.setFont(font);
		left.setBackground(Color.green);
		f.add(left, BorderLayout.WEST);

		left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (index == 0) {
					index = 4;
					top.setText(title[index]);
					center.setIcon(new ImageIcon(img[index]));
					bottom.setText(String.valueOf(grade[index]));
				} else {
					index -= 1;
					top.setText(title[index]);
					center.setIcon(new ImageIcon(img[index]));
					bottom.setText(String.valueOf(grade[index]));
				}
			}
		});
		
//		left.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				if (index > 0) {
//					index -= 1;
//					top.setText(title[index]);
//					center.setIcon(new ImageIcon(img[index]));
//					bottom.setText(String.valueOf(grade[index]));
//				}else{ 
//					JOptionPane.showMessageDialog(f,"왼쪽 끝입니다.");
//				}
//			}
//		});

		JButton right = new JButton("오른쪽");
		right.setFont(font);
		right.setBackground(Color.green);
		f.add(right, BorderLayout.EAST);

		right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (index == 4) {
					index = 0;
					top.setText(title[index]);
					center.setIcon(new ImageIcon(img[index]));
					bottom.setText(String.valueOf(grade[index]));
				} else {
					index += 1;
					top.setText(title[index]);
					center.setIcon(new ImageIcon(img[index]));
					bottom.setText(String.valueOf(grade[index]));
				}
			}
		});

//		right.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				if (index < 4) {
//					index += 1;
//					top.setText(title[index]);
//					center.setIcon(new ImageIcon(img[index]));
//					bottom.setText(String.valueOf(grade[index]));
//				} else {
//					JOptionPane.showMessageDialog(f, "오른쪽 끝입니다.");
//				}
//			}
//		});

f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

f.setVisible(true);}

}
