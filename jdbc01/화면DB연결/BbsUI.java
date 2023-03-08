package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BbsUI {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 회원가입 화면");
		f.setSize(400, 700);
		f.getContentPane().setBackground(Color.green);
		
		JLabel l1 = new JLabel("나의 게시판");
		JLabel l2 = new JLabel("--------------------");
		JLabel l3 = new JLabel("게시판 ID");
		JLabel l4 = new JLabel("게시판 제목");
		JLabel l5 = new JLabel("게시판 내용");
		JLabel l6 = new JLabel("게시판 글쓴이");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		
		JButton b1 = new JButton("게시물 작성 완료");
		JButton b2 = new JButton("게시물 삭제 완료");
		JButton b3 = new JButton("게시물 검색 완료");
		
		//f위에 있는 요소들을 add로 붙여주어야 하는데
		//붙이는 순서대로 물흐르듯이 붙여주고 싶음
		FlowLayout flow = new FlowLayout();
		
		//폰트부품
		Font font1 = new Font("굴림", Font.BOLD, 40);
		Font font2 = new Font("굴림", Font.BOLD, 30);
		//필요한 부품(객체)
		f.setLayout(flow);
		
		f.add(l1);
		f.add(l2);
		f.add(l3); f.add(t1);
		f.add(l4); f.add(t2);
		f.add(l5); f.add(t3);
		f.add(l6); f.add(t4);
		f.add(b1); 
		f.add(b2);
		f.add(b3);
		
		l1.setFont(font1);
		l2.setFont(font1);
		l3.setFont(font2);
		l4.setFont(font2);
		l5.setFont(font2);
		l6.setFont(font2);
		t1.setFont(font2);
		t2.setFont(font2);
		t3.setFont(font2);
		t4.setFont(font2);
		b1.setFont(font2);
		b2.setFont(font2);
		b3.setFont(font2);
		
		b1.setBackground(Color.yellow); //배경색
		b2.setBackground(Color.red);
		b3.setBackground(Color.blue);
		
		f.setVisible(true);;
	}

}
