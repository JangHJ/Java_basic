package 배열응용;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열정리 {

	public static void main(String[] args) {
		//1. 프레임을 만들어보세요. 
		JFrame f = new JFrame();
		
		//2. 프레임 설정해보세요. 실행해서 눈으로 확인
		f.setSize(800, 500);
		
		//   레이아웃 부품 설정하지 않음.
		f.setLayout(null);
		
		//3. 버튼을 넣을 배열을 먼저 만들어두세요. 500개
		JButton[] btn = new JButton[500]; //기본형이 아닌 데이터는 참조형
		//참조형은 배열에 null로 초기화
		               //{null, null, null, null,....};
		
		//4. 버튼을 500개만들어서 배열에 넣어주세요. 반복문
		Random r = new Random();
		//colors[r.nextInt(colors.length)] //0~5
		Color[] colors = {Color.red, Color.blue, Color.white, 
				Color.gray, Color.green, Color.orange};
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i + "번 버튼");
			int x = r.nextInt(800); //가로 위치
			int y = r.nextInt(500); //세로 위치
			btn[i].setBounds(x, y, 100, 50);
			btn[i].setBackground(colors[r.nextInt(colors.length)]);
			f.add(btn[i]);			
		}
		
		f.getContentPane().setBackground(Color.yellow);
		//5. 배열에 있는 버튼을 꺼내서 위치를 지정후, f에 붙여주세요.
		//심화-1)) 버튼 색을 몇 가지 지정해서 임의로 설정, 힌트 Color배열
		//        colors배열 중 아무 인덱스나 색으로 지정하면 됨.
		//        buttons[i].setBackgroundColor(Color.red);
		//Color[] colors = {Color.red, Color.blue, Color.white, 
		// 					Color.gray, Color.green, Color.orange};
		//심화-2)) f에 배경색을 넣어보세요.
		f.setVisible(true);
	}
}