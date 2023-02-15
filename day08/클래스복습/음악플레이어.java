package 클래스복습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 음악플레이어 {
	static int index = 2; // 현재 2부터 시작
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] title = { "love again", "숲", "OMG", "NOT SORRY(feat.pH-1)", "Impurities" };
		String[] singer = { "백현", "최유리", "NewJeans", "이영지", "LE SSERAFIM" };
		String[] album = { "album1.jpg", "album2.jpg", "album3.jpg", "album4.jpg", "album5.jpg" };

		JFrame f = new JFrame();
		f.setSize(600, 600);
		f.getContentPane().setBackground(Color.black);
		f.setTitle("요즘 즐겨듣는 노래 TOP5");
		Font font = new Font("휴먼 필기체", Font.BOLD, 35);

		JLabel top = new JLabel(title[2]);
		top.setFont(font);
		top.setHorizontalAlignment(0);
		top.setForeground(Color.white);
		f.add(top, BorderLayout.NORTH);

		JButton center = new JButton(new ImageIcon(album[2]));
		center.setFont(font);
		center.setHorizontalAlignment(0);
		center.setBackground(Color.black);
		center.setBorderPainted(false);
		center.setFocusPainted(false);
		f.getContentPane().add(center, BorderLayout.CENTER);
		
		center.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				앨범설명 detail = new 앨범설명();
				detail.showAlbum(index);
			}
		});

		JLabel bottom = new JLabel(String.valueOf(singer[2]));
		bottom.setHorizontalAlignment(0);
		bottom.setFont(font);
		bottom.setForeground(Color.white);
		f.getContentPane().add(bottom, BorderLayout.SOUTH);

		JButton left = new JButton(" < ");
		left.setFont(font);
		left.setBackground(Color.black);
		left.setForeground(Color.white);
		left.setBorderPainted(false);
		left.setFocusPainted(false);
		f.add(left, BorderLayout.WEST);

		left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (index == 0) {
					index = 4;
					top.setText(title[index]);
					center.setIcon(new ImageIcon(album[index]));
					bottom.setText(String.valueOf(singer[index]));
				} else {
					index -= 1;
					top.setText(title[index]);
					center.setIcon(new ImageIcon(album[index]));
					bottom.setText(String.valueOf(singer[index]));
				}
			}
		});
		
		JButton right = new JButton(" > ");
		right.setFont(font);
		right.setBackground(Color.black);
		right.setForeground(Color.white);
		right.setBorderPainted(false);
		right.setFocusPainted(false);
		f.add(right, BorderLayout.EAST);

		right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (index == 4) {
					index = 0;
					top.setText(title[index]);
					center.setIcon(new ImageIcon(album[index]));
					bottom.setText(String.valueOf(singer[index]));
				} else {
					index += 1;
					top.setText(title[index]);
					center.setIcon(new ImageIcon(album[index]));
					bottom.setText(String.valueOf(singer[index]));
				}
			}
		});

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setVisible(true);
	}

}
