package 조건문;

import javax.swing.JOptionPane;

public class 인기조사10명 {

	public static void main(String[] args) {
		int choice1 = 0;
		int choice2 = 0;
		int choice3 = 0;
		
		for(int i=0; i<10; i++)
		{
			String reply = JOptionPane.showInputDialog("가장 좋아하는 연예인이 누구신가요? 1.뉴진스 2.아이유 3.유재석");
			switch (reply) {
			case "1":
				choice1++;
				break;
			case "2":
				choice2++;
				break;
			case "3":
				choice3++;
				break;
			default:
				JOptionPane.showMessageDialog(null, "잘못된 입력입니다. 다시 입력해주세요!");
				i--;
				break;
			}
		}
		System.out.println("뉴진스 : " + choice1 + "표");
		System.out.println("아이유 : " + choice2 + "표");
		System.out.println("유재석 : " + choice3 + "표");
	}

}
