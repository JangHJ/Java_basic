package 생성자;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter {
	static int count =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setTitle("나의 카운터 프로그램");
		FlowLayout flow = new FlowLayout();
		f.setSize(300,250);
		f.setLayout(flow);
		
		Font font = new Font("궁서", 1, 100);
		JButton b1 = new JButton("1더하기");
		b1.setBackground(Color.green);
		JButton b2 = new JButton("0으로 초기화");
		b2.setBackground(Color.blue);
		b2.setForeground(Color.white);
		JButton b3 = new JButton("1빼기");
		b3.setBackground(Color.green);
		
		JLabel label = new JLabel("0");
		label.setHorizontalAlignment(0);
		label.setFont(font);
		label.setForeground(Color.red);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				label.setText(String.valueOf(count));
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count = 0;
				label.setText(String.valueOf(count));
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count--;
				label.setText(String.valueOf(count));
			}
		});
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(label);
		f.setVisible(true);
	}

}
