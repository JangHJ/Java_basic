package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import 자바DB연결.MemberDAO2;

public class MemberUI {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 회원가입 화면");
		f.getContentPane().setBackground(Color.green);
		f.setSize(450, 400);

		JLabel l1 = new JLabel("<<<<회원가입화면>>>>");
		JLabel l2 = new JLabel("아이디");
		JLabel l3 = new JLabel("패스워드");
		JLabel l4 = new JLabel("이름");
		JLabel l5 = new JLabel("전화번호");

		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);

		JButton b1 = new JButton("회원가입 처리");
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(">>>회원가입 처리!");
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				
				if(id.equals(""))
				{
					JOptionPane.showMessageDialog(f, "아이디는 필수입력 항목입니다.");
				}
				MemberDAO2 dao = new MemberDAO2();
				int result = dao.insert(id, pw, name, tel);//1 or 0
				if(result == 1) {
					JOptionPane.showMessageDialog(f, "회원가입 성공");
				}else {
					JOptionPane.showMessageDialog(f, "회원가입 실패, 재입력해주세요.");
				}
			}//actionPerformed
		});//b1
		JButton b2 = new JButton("회원탈퇴 처리");
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(">>>회원탈퇴 처리!");
				String id = t1.getText();
				
				if(id.equals(""))
				{
					JOptionPane.showMessageDialog(f, "아이디는 필수입력 항목입니다.");
				}
				MemberDAO2 dao = new MemberDAO2();
				int result = dao.delete(id);//1 or 0
				if(result == 1) {
					JOptionPane.showMessageDialog(f, "회원탈퇴 성공");
				}else {
					JOptionPane.showMessageDialog(f, "회원탈퇴 실패, 재입력해주세요.");
				}
//				deleteUI d = new deleteUI();
//				d.deleteAccount();
			}
		});
		JButton b3 = new JButton("회원수정 처리");
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(">>>회원수정 처리!");
				String id = t1.getText();
				String tel = t4.getText();
				
				if(id.equals(""))
				{
					JOptionPane.showMessageDialog(f, "아이디는 필수입력 항목입니다.");
				}
				MemberDAO2 dao = new MemberDAO2();
				int result = dao.update(id, tel);//1 or 0
				if(result == 1) {
					JOptionPane.showMessageDialog(f, "회원수정 성공");
				}else {
					JOptionPane.showMessageDialog(f, "회원수정 실패, 재입력해주세요.");
				}
//				updateUI u = new updateUI();
//				u.updateAccount();
			}
		});
		JButton b4 = new JButton("회원검색 처리");
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(">>>회원검색 처리!");
			}
		});

		// f위에 있는 요소들을 add로 붙여주어야 하는데
		// 붙이는 순서대로 물흐르듯이 붙여주고 싶음
		FlowLayout flow = new FlowLayout();

		// 폰트부품
		Font font = new Font("맑은 고딕", Font.BOLD, 30);
		Font font2 = new Font("맑은 고딕", Font.BOLD, 25);
		// 필요한 부품(객체)
		f.setLayout(flow);

		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(l3);
		f.add(t2);
		f.add(l4);
		f.add(t3);
		f.add(l5);
		f.add(t4);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);
		b1.setFont(font2);
		b2.setFont(font2);
		b3.setFont(font2);
		b4.setFont(font2);

		t1.setBackground(Color.yellow);
		t1.setForeground(Color.blue);
		t2.setBackground(Color.yellow);
		t2.setForeground(Color.blue);
		t3.setBackground(Color.yellow);
		t3.setForeground(Color.blue);
		t4.setBackground(Color.yellow);
		t4.setForeground(Color.blue);

		b1.setBackground(Color.white); // 배경색
		b1.setForeground(Color.red); // 글자색
		b2.setBackground(Color.white);
		b2.setForeground(Color.red);
		b3.setBackground(Color.white);
		b3.setForeground(Color.red);
		b4.setBackground(Color.white);
		b4.setForeground(Color.red);

		f.setVisible(true);
		;
	}

}
