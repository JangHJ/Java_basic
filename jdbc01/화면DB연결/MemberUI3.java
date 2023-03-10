package 화면DB연결;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import 자바DB연결.MemberDAO3;

public class MemberUI3 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 회원가입 화면");
		f.setSize(600, 500);
		
		JLabel l1 = new JLabel("<<<< 회원가입화면 >>>>");
		JLabel l2 = new JLabel("아이디");
		JLabel l3 = new JLabel("패스워드");
		JLabel l4 = new JLabel("이 름");
		JLabel l5 = new JLabel("전화번호");

		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);

		JButton b1 = new JButton("회원가입 처리");
		JButton b2 = new JButton("회원탈퇴 처리");
		JButton b3 = new JButton("회원수정 처리");
		JButton b4 = new JButton("회원검색 처리");

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원가입처리");
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText(); // ""

				if (id.equals("")) { // 기본형 4가지만 == 로 값을 비교 가능!
					JOptionPane.showMessageDialog(f, "id는 필수입력항목입니다.");
				}
				MemberDAO3 dao = new MemberDAO3();

				// 1. 가방을 만들어주세요.
				MemberVO bag = new MemberVO();
				// 2. 가방에 값들을 넣어주세요.
				bag.setId(id);
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);
				// 3. 값들이 들어있는 가방을 전달하자.
				int result = dao.insert(bag);// 1 or 0

				if (result == 1) {
					JOptionPane.showMessageDialog(f, "회원가입 성공");
				} else {
					JOptionPane.showMessageDialog(f, "회원가입 실패, 재입력해주세요.");
				}
			}// action
		}); // b1

		// 탈퇴기능
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원탈퇴처리");
				String id = t1.getText();

				MemberDAO3 dao = new MemberDAO3();
				int result = dao.delete(id);
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "회원탈퇴 성공");
				} else {
					JOptionPane.showMessageDialog(f, "회원탈퇴 실패, 재입력해주세요.");
				}
			}// action
		}); // b2

		// 수정기능
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원수정처리");
				String id = t1.getText(); // 조건
				String tel = t4.getText(); // 바꾸는 항목

				MemberDAO3 dao = new MemberDAO3();
				// 1. 가방을 만들자.
				MemberVO bag = new MemberVO();
				// 2. 가방에 값을 넣자.
				bag.setId(id);
				bag.setTel(tel);
				// 3. 가방을 전달하자.
				int result = dao.update(bag);
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "회원수정 성공");
				} else {
					JOptionPane.showMessageDialog(f, "회원수정 실패, 재입력해주세요.");
				}
			}// action
		}); // b3

		//자바는 변수에들어갈데이터타입 변수명을 써주어야
		//ram에 저장공간이 만들어진다.
		//String test = null; ==> 선언!
		//자바는 선언시 변수가 만들어진다.
		//자바는 선언시 변수에 들어갈 타입도 결정!

		// 검색기능
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원검색처리");
				String id = t1.getText();

				MemberDAO3 dao = new MemberDAO3();
				MemberVO bag = dao.one(id);//MemberVO
				if(bag != null) {
					t2.setText(bag.getPw());
					t3.setText(bag.getName());
					t4.setText(bag.getTel());
					t2.setBackground(Color.pink);
					t3.setBackground(Color.pink);
					t4.setBackground(Color.pink);
				}else {
					t2.setText("");
					t3.setText("");
					t4.setText("");
					JOptionPane.showMessageDialog(f, "검색결과 없음");
				}
			}// action
		}); // b4


		// 폰트를 설정하기 위해 font부품 필요
		Font font = new Font("궁서", Font.BOLD, 40);
		JPanel p1 = new JPanel();
		p1.setSize(300, 500);
		JPanel p2 = new JPanel();
		p2.setSize(300, 500);
		f.add(p1, BorderLayout.WEST);
		f.add(p2, BorderLayout.EAST);
		p1.setLayout(new FlowLayout());
		p2.setLayout(new FlowLayout());
		f.add(l1, BorderLayout.NORTH);
		p1.add(l2);
		p2.add(t1);
		p1.add(l3);
		p2.add(t2);
		p1.add(l4);
		p2.add(t3);
		p1.add(l5);
		p2.add(t4);


		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);

		t1.setBackground(Color.yellow);
		t1.setForeground(Color.blue);
		t2.setBackground(Color.yellow);
		t2.setForeground(Color.blue);
		t3.setBackground(Color.yellow);
		t3.setForeground(Color.blue);
		t4.setBackground(Color.yellow);
		t4.setForeground(Color.blue);

		b1.setBackground(Color.pink); // 배경색
		b1.setForeground(Color.red); // 글자색
		b2.setBackground(Color.pink);
		b2.setForeground(Color.red);
		b3.setBackground(Color.pink);
		b3.setForeground(Color.red);
		b4.setBackground(Color.pink);
		b4.setForeground(Color.red);

		f.getContentPane().setBackground(Color.green);
		// 맨 끝으로~~~~~
		f.setVisible(true);

	}

}
