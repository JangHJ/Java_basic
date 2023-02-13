package 배열응용;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 극장예매시스템4 {

	public static void main(String[] args) {
		char[] seat_row = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' };
		JFrame f = new JFrame();

		JLabel[] labels = new JLabel[10];
		FlowLayout flow = new FlowLayout();
		Font font = new Font("돋움", 0, 10);
		Font font2 = new Font("돋움", 1, 15);
		f.setSize(1000, 800);
		f.setLayout(flow);

		
		JButton[] buttons = new JButton[200];
		int count = 1;
		int count2 = 0;
		for (int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel(seat_row[i] + "");
			labels[i].setFont(font2);
		}

		for (int i = 0; i < buttons.length; i++) {
			if (i == 0) {
				f.add(labels[count2]);
				count2++;
			} 
			else if (i % 20 == 0) {
				f.add(labels[count2]);
				count = 1;
				count2++;
			}
			buttons[i] = new JButton(count + "");
			buttons[i].setFont(font);
			f.add(buttons[i]);
			count++;
		}

		f.setVisible(true);
	}

}
