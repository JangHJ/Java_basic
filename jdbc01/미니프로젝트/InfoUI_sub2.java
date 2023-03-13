package 미니프로젝트;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class InfoUI_sub2 {

	public void open(int no, String content) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.white);
		f.setSize(466, 500);
		f.setLayout(null);
		f.getContentPane().setBackground(new Color(240, 240, 240));
		
		Font font1 = new Font("맑은 고딕", Font.BOLD, 30);
		Font font2 = new Font("맑은 고딕", 0, 15);
		JLabel title = new JLabel("리뷰 수정하기");
		JButton button = new JButton("수정완료");
		
		title.setOpaque(true); // JLabel 배경색 넣으려면 true 해놔야함.
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setBackground(Color.gray);

		title.setFont(font1);
		button.setFont(font2);
		button.setBackground(Color.darkGray);
		button.setForeground(Color.white);
		
		JTextArea area = new JTextArea(content);
		area.setBorder(new LineBorder(Color.darkGray, 1, true));
		
		title.setBounds(0, 0, 450, 85);
		area.setBounds(5, 90, 440, 300);
		button.setBounds(145, 400, 150, 50);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ReviewDAO dao = new ReviewDAO();
				dao.update(no, area.getText());
				
				f.dispose();
			}
		});
		
		f.add(title);
		f.add(area);
		f.add(button);
		
		f.setVisible(true);
	}

}
