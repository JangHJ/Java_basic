package 상속;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MyThread extends Thread{
	int x, y;
	JLabel label; //전역변수로 선언!
	public MyThread(String file, int x, int y) {
		this.x = x;
		this.y = y;
		ImageIcon icon = new ImageIcon(file);
		label = new JLabel();
		label.setIcon(icon);
		label.setBounds(x, y, 100, 100); //jframe에 붙은 위치 지정
	}
	
	@Override
	public void run() {
		//동시에 실행하고 싶은 내용!! 
		//모든 스레드가 오른쪽으로 움직이고 싶음.
		//화면에서 오른쪽으로 움직이는 것은 x을 늘려주는 것.!
		Random r = new Random();
		for (int i = 0; i < 200; i++) {
			int move = r.nextInt(50); //0~49
			x = x + move; //100 + 45
			label.setBounds(x, y, 100, 100); //다시 위치 지정
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
}