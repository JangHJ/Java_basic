package 메서드연습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 중국음식주문 {
	static int count;
	final static int price = 5000; 
	static int sum;
	
	public static void main(String[] args) {
		String[] img = { "main.jpg", "food1.jpg", "food2.jpg", "food3.jpg" };
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.setSize(800, 700);
		f.getContentPane().setBackground(Color.green);
		Font font = new Font("맑은 고딕", Font.BOLD, 40);
		Font font2 = new Font("맑은 고딕", 0, 30);
		Font font3 = new Font("맑은 고딕", Font.BOLD, 45);

		JButton b1 = new JButton("짬뽕");
		JButton b2 = new JButton("우동");
		JButton b3 = new JButton("짜장");

		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b1.setBackground(Color.magenta);
		b2.setBackground(Color.orange);
		b3.setBackground(Color.cyan);
		b1.setBorderPainted(false);
		b2.setBorderPainted(false);
		b3.setBorderPainted(false);

		JLabel label1 = new JLabel("개수: ");
		JTextField countField = new JTextField(5);
		countField.setText("0개");

		label1.setFont(font2);
		countField.setFont(font3);
		countField.setForeground(Color.blue);
		countField.setBackground(Color.yellow);
		// b4.setEnabled(false);

		ImageIcon icon = new ImageIcon(img[0]);
		JLabel imgLabel = new JLabel(icon);

		JLabel result = new JLabel("결제금액 0원");
		result.setFont(font3);
		result.setForeground(Color.red);
		// result.setHorizontalAlignment(-1);

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(label1);
		f.add(countField);
		f.add(imgLabel);
		f.add(result);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count++;
				sum = count * price;
				result.setText("결제금액 " + sum + "원");
				countField.setText(count + "개");
				imgLabel.setIcon(new ImageIcon(img[1]));
			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count++;
				sum = count*price;
				result.setText("결제금액 " + sum + "원");
				countField.setText(count + "개");
				imgLabel.setIcon(new ImageIcon(img[2]));
			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count++;
				sum = count*price;
				result.setText("결제금액 " + sum + "원");
				countField.setText(count + "개");
				imgLabel.setIcon(new ImageIcon(img[3]));
			}
		});

		f.setVisible(true);
	}

}
