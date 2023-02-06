package 확인문제;

import javax.swing.JOptionPane;

public class 문제풀이1 {

	public static void main(String[] args) {
		String today = JOptionPane.showInputDialog("오늘은 무슨 요일인가요 ex)월요일, 화요일 ...?");
		String todo = JOptionPane.showInputDialog("수업이 끝나고 무엇을 하실 예정인가요?");
		
		String result = "오늘 " + today + "에 수업 후 나는 " + todo + "를 할 예정";
		
		System.out.println(result);

	}

}
