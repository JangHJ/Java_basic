package 부품응용하기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 일기장화면 {
	public void showDiary() {
		
		JFrame f = new JFrame();
		f.setTitle("일기장 쓰기");
		FlowLayout flow = new FlowLayout(FlowLayout.CENTER,10,20);
		Font font = new Font("맑은 고딕", 1, 25);
		Font font2 = new Font("맑은 고딕", 1, 30);
		
		JLabel day = new JLabel("오늘의 날짜");
		JLabel title = new JLabel("오늘의 제목");
		JLabel content = new JLabel("오늘의 내용");
		JButton save = new JButton("파일에 일기 저장");

		JTextField field1 = new JTextField(10);
		JTextField field2 = new JTextField(10);
		JTextArea area = new JTextArea(5, 10);
		
		save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String day2 = field1.getText();
				String title2 = field2.getText();
				String content2 = area.getText();
				System.out.println(day2 + " " + title2 + " " + content2);
				
				//파일도 만들어주고, 자바 프로그램과 file간에 연결통로(강물, stream)을 만들어준다.
				//외부에 있는 파일, 네트워크, cpu등을 자바에서 연결할 때 위험한 상황이라 인식
				//만약 문제가 생긴다면 어떻게 처리할 지 꼭 써줘야함.
				try {
					FileWriter file = new FileWriter(day2 + ".txt");
					file.write(day2 + "\n");
					file.write(title2 + "\n");
					file.write(content2 + "\n");
					file.close();
				} catch (IOException e1) {
					System.out.println("파일로 저장되는 중 문제가 생김!");
				}
			}
		});
		
		
		f.setLayout(flow);
		f.setSize(500,500);
		f.getContentPane().setBackground(Color.yellow);
		
		day.setFont(font);
		title.setFont(font);
		content.setFont(font);
		day.setHorizontalAlignment(JLabel.LEFT);
		title.setHorizontalAlignment(JLabel.LEFT);
		content.setHorizontalAlignment(JLabel.LEFT);
		save.setFont(font2);
		save.setBackground(Color.magenta);
		field1.setFont(font);
		field2.setFont(font);
		area.setFont(font);
		field1.setForeground(Color.blue);
		field2.setForeground(Color.blue);
		area.setForeground(Color.blue);
		
		f.add(day);
		f.add(field1);
		f.add(title);
		f.add(field2);
		f.add(content);
		f.add(area);
		f.add(save);
		f.setVisible(true);
	}
}
