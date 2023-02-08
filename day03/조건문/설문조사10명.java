package 조건문;

import javax.swing.JOptionPane;

import 반복문.for문;

public class 설문조사10명 {

	public static void main(String[] args) {
		int yes = 0;
		int no = 0;
		for (int i = 0; i < 10; i++) {
			String reply = JOptionPane.showInputDialog("배가 고프신가요? (맞으면 1 아니면 2)");
			switch (reply) {
			case "1":
				yes++;
				break;
			case "2":
				no++;
				break;
			default:
				JOptionPane.showMessageDialog(null, "잘못된 입력입니다. 다시 입력해주세요");
				i--;
				break;
			}
		}
		System.out.println("배고픈 사람 : " + yes + "명");
		System.out.println("안 배고픈 사람 : " + no + "명");
	}

}
