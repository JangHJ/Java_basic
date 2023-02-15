package 메서드연습;

import java.util.Random;

import javax.swing.JOptionPane;

public class 입력값반환값체크 {
	public static void main(String[] args) {
		Random r = new Random();
		int data1 = r.nextInt(5); //0~4
		String data2 = JOptionPane.showInputDialog("이름 입력 >> ");	//String으로 return
		JOptionPane.showMessageDialog(null, data2);	//void
	}
}
