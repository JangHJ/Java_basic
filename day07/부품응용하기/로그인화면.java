package 부품응용하기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 로그인화면 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 일기장");
		FlowLayout flow = new FlowLayout();
		Font font = new Font("맑은 고딕", 1, 25);
		JLabel top = new JLabel();

		JLabel id = new JLabel("아이디:     ");
		JLabel pw = new JLabel("비밀번호:     ");

		JTextField idText = new JTextField(10);
		JTextField pwText = new JTextField(10);

		JButton btnLogin = new JButton();
		JButton btnReset = new JButton();

		ImageIcon icon1 = new ImageIcon("diary2.png");
		ImageIcon icon2 = new ImageIcon("login.png");
		ImageIcon icon3 = new ImageIcon("reset.png");

		f.setLayout(flow);
		f.setSize(500, 800);
		f.getContentPane().setBackground(Color.green);

		top.setIcon(icon1);
		top.setBounds(250, 30, 200, 200);
		btnLogin.setIcon(icon2);
		btnLogin.setBorderPainted(false);
		btnLogin.setContentAreaFilled(false);
		btnReset.setIcon(icon3);
		btnReset.setBorderPainted(false);
		btnReset.setContentAreaFilled(false);

		id.setFont(font);
		pw.setFont(font);
		idText.setFont(font);
		pwText.setFont(font);
		idText.setHorizontalAlignment(JTextField.CENTER);
		pwText.setHorizontalAlignment(JTextField.CENTER);

		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String id2 = idText.getText();
				String pw2 = pwText.getText();

				if (id2.equals("root") && pw2.equals("1234")) {
					일기장화면 screen = new 일기장화면();
					JOptionPane.showMessageDialog(f, "로그인 성공!");
					f.setVisible(false);
					screen.showDiary();
				} else {
					JOptionPane.showMessageDialog(f, "잘못된 아이디 혹은 비밀번호입니다!");
					idText.setText("");
					pwText.setText("");
				}
			}
		});

		btnReset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				idText.setText("");
				pwText.setText("");
				JOptionPane.showMessageDialog(f, "리셋되었습니다.");

			}
		});

		f.add(top);
		f.add(id);
		f.add(idText);
		f.add(pw);
		f.add(pwText);
		f.add(btnLogin);
		f.add(btnReset);

		f.setVisible(true);
	}

}
