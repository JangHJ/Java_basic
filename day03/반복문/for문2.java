package 반복문;

import javax.swing.JOptionPane;

public class for문2 {
	public static void main(String[] args) {
		for (;;) {  //무한루프 반복 while(true)
			System.out.println("잘쓰지않음.");
			String data = JOptionPane.showInputDialog("종료할까요? y/n");
			//==연산자는 기본데이터만 비교 가능
			//String부품에서 제공하는 기능을 사용해서 비교해줘야함
			if(data.equals("y")) {
				System.out.println("안녕히가세요~");
				break;
			}
		}
	}
}
