package 반복문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 확인문제 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400,500);
		f.getContentPane().setBackground(Color.green);
		
		FlowLayout flow = new FlowLayout();
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		JButton b4 = new JButton();
		Font font = new Font("굴림", 1, 60);
		
		f.setLayout(flow);
		b1.setBackground(Color.magenta);
		b2.setBackground(Color.cyan);
		b3.setBackground(Color.magenta);
		b4.setBackground(Color.cyan);
		b1.setText("별 10개");
		b2.setText("커피*5");
		b3.setText("커피*우유3");
		b4.setText("1:짱!");
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		//버튼에다 액션기능 추가
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10; i++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for (int i = 0; i < 5; i++) {
					System.out.print("커피*");
				}
				System.out.println("");
			}
		});
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for (int i = 0; i < 3; i++) {
					System.out.println("커피*우유");
				}
			}
		});
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for (int i = 0; i < 5; i++) {
					System.out.println((i+1) + " : 짱!");
				}
			}
		});
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		f.setVisible(true);
		/*
		for (int i = 0; i < 10; i++) {
			System.out.print("*");
		}
		System.out.println("");
		System.out.println("=========================");
		for (int i = 0; i < 5; i++) {
			System.out.print("커피*");
		}
		System.out.println("");
		System.out.println("=========================");
		for (int i = 0; i < 3; i++) {
			System.out.println("커피*우유");
		}
		System.out.println("=========================");
		for (int i = 0; i < 5; i++) {
			System.out.println((i+1) + " : 짱!");
		}*/
		

	}

}
