package 화면DB연결;

import java.awt.Color;

import javax.swing.JOptionPane;

import 자바DB연결.MemberDAO3;

public class StartUI {

	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("아이디 입력");
		String pw = JOptionPane.showInputDialog("비밀번호 입력");
		
		MemberDAO3 dao = new MemberDAO3();

		dao.login(id, pw);
	}
}