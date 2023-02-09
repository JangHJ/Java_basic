package 제어문문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 케이팝인기투표2 {
	static int x=0;
	public static void main(String[] args) {
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		JLabel title = new JLabel();
		JLabel list1 = new JLabel();
		JLabel vote1 = new JLabel();
		JLabel list2 = new JLabel();
		JLabel vote2 = new JLabel();
		JLabel list3 = new JLabel();
		JLabel vote3 = new JLabel();
		ImageIcon icon1 = new ImageIcon("album1.jpg");
		ImageIcon icon2 = new ImageIcon("album2.jpg");
		ImageIcon icon3 = new ImageIcon("album3.jpg");
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		
		Font listfont = new Font("돋움", 1, 20);	
		Font votefont = new Font("맑은 고딕", 1, 25);	
		Font titlefont = new Font("돋움", 1, 35);
		
		title.setText("K-pop 인기 투표");
		list1.setText("1. 아이유-라일락");
		list2.setText("2. 프로미스나인-we go");
		list3.setText("3. 스테이씨-ASAP");
		b1.setIcon(icon1);
		b2.setIcon(icon2);
		b3.setIcon(icon3);
		
		title.setFont(titlefont);
		list1.setFont(listfont);
		list2.setFont(listfont);
		list3.setFont(listfont);
		vote1.setFont(votefont);
		vote2.setFont(votefont);
		vote3.setFont(votefont);
		vote1.setText("0표");
		vote2.setText("0표");
		vote3.setText("0표");
		
		
		
		f.setSize(400, 950);
		
		b1.addActionListener(new ActionListener() {
			int v1 = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				v1++;
				vote1.setText(v1 + "표");
				if(v1 >= 5)
					vote1.setForeground(Color.blue);
			}
		});
		b2.addActionListener(new ActionListener() {
			int v2 = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				v2++;
				x++;
				vote2.setText(v2 + "표");
				if(v2 >= 5)
					vote2.setForeground(Color.blue);
			}
		});
		b3.addActionListener(new ActionListener() {
			int v3 = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				v3++;
				vote3.setText(v3 + "표");
				if(v3 >= 5)
					vote3.setForeground(Color.blue);
			}
		});
		
		f.add(title);
		f.add(b1);
		f.add(list1);
		f.add(vote1);
		f.add(b2);
		f.add(list2);
		f.add(vote2);
		f.add(b3);
		f.add(list3);
		f.add(vote3);
		f.setVisible(true);
		//sc.close();
	}
}