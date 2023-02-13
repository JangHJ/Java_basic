package 배열심화;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 이차원배열테이블2 {
	public static void main(String[] args) {
		Random r = new Random();
		JFrame f = new JFrame();
		f.setSize(500, 500);
		String header[] = {"컴퓨터", "영어", "수학", "체육"};
		String contents[][] = new String[30][header.length];
		
		for (int i = 0; i < contents.length; i++) {
			for (int j = 0; j < header.length; j++) {
				contents[i][j] = Integer.toString(r.nextInt(51)+50); //최소 50점 부터 100점까지
			}
		}
		JTable table = new JTable(contents, header);
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);
		f.setVisible(true);
	}
}
