package 클래스복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 앨범설명 {
	public void showAlbum(int index) {
		String[] days = {"2020-05-25", "2022-08-24", "2023-01-02", "2022-12-17", "2022-10-17"};
		String[] titles = { "Delight - The 2nd Mini Album", "유영", "NewJeans 'OMG'", "쇼미더머니 11 Episode 3", "ANTIFRAGILE" };
	
		JFrame f = new JFrame();
		f.setTitle("앨범 설명");
		FlowLayout flow = new FlowLayout(FlowLayout.CENTER,10,20);
		Font font = new Font("맑은 고딕", Font.BOLD, 25);
		Font font2 = new Font("맑은 고딕", Font.BOLD, 30);
		
		JLabel title = new JLabel("앨범명: ");
		JLabel day = new JLabel("발매일: ");
		

		title.setText("앨범명 : " + titles[index]);
		day.setText("발매일 : " + days[index]);
		
		
		f.setLayout(flow);
		f.setSize(500,200);
		f.getContentPane().setBackground(Color.yellow);
		
		title.setFont(font);
		day.setFont(font);
		
		f.add(day);
		f.add(title);

		f.setVisible(true);
	}
}
