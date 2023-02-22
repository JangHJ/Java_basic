package 인터페이스;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class 글자길이판독기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400, 500);
		f.setLayout(new FlowLayout());

		JLabel label1 = new JLabel("Words:     ");
		label1.setHorizontalAlignment(JLabel.LEFT);
		JTextArea area = new JTextArea(15, 30);
		area.setBackground(Color.darkGray);
		area.setForeground(Color.white);
		JButton b1 = new JButton("length");
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String text = area.getText(); //입력한 문장 가져오기
				JOptionPane.showMessageDialog(f, "글자수는 " + text.length());
			}
		});
		JButton b2 = new JButton("Pad Color");
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Random rand = new Random();
				int r = rand.nextInt(256);
				int g = rand.nextInt(256);
				int b = rand.nextInt(256);
				
				area.setBackground(new Color(r, g, b));
			}
		});

		JButton b3 = new JButton("Text Color");
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Random rand = new Random();
				int r = rand.nextInt(256);
				int g = rand.nextInt(256);
				int b = rand.nextInt(256);
				
				area.setForeground(new Color(r, g, b));
			}
		});

		f.add(label1);
		f.add(area);
		f.add(b1);
		f.add(b2);
		f.add(b3);

		f.setVisible(true);
	}

}
