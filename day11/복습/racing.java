package 복습;

import java.awt.Font;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class racing extends JFrame {

	boolean count = false;
	float posY = 0;

	public static void main(String[] args) {
		racing f = new racing();

	}

	public racing() {
		setTitle("나의 경마게임");
		setSize(700, 700);
		setLayout(null);

		JLabel n1 = new JLabel("1번 마");
		JLabel n2 = new JLabel("2번 마");
		JLabel n3 = new JLabel("3번 마");
		Font f1 = new Font("맑은 고딕", 1, 20);

		MyThread car1 = new MyThread("horse1.jpg", 100, 0);
		MyThread car2 = new MyThread("horse2.jpg", 100, 200);
		MyThread car3 = new MyThread("horse3.jpg", 100, 400);

		n1.setFont(f1);
		n2.setFont(f1);
		n3.setFont(f1);

		n1.setBounds(0, 50, 100, 100);
		n2.setBounds(0, 250, 100, 100);
		n3.setBounds(0, 450, 100, 100);
		add(n1);
		car1.start();
		add(n2);
		car2.start();
		add(n3);
		car3.start();

		setVisible(true);
	}

	public class MyThread extends Thread {
		int x, y;
		JLabel label; // 전역변수로 선언!

		public MyThread(String file, int x, int y) {
			this.x = x;
			this.y = y;
			ImageIcon icon = new ImageIcon(file);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 300, 200);
			add(label);
		}

		@Override
		public void run() {
			// 동시에 실행하고 싶은 내용!!
			// 모든 스레드가 오른쪽으로 움직이고 싶음.
			// 화면에서 오른쪽으로 움직이는 것은 x을 늘려주는 것.!
			Random r = new Random();
			for (int i = 0; i < 10; i++) {
				int move = r.nextInt(60);
				x = x + move;
				label.setBounds(x, y, 300, 200);
				if (label.getX() >= 450 && count == false) { // 결승전 도착하면 게임종료
					JOptionPane.showMessageDialog(null, label.getIcon() + "우승!");
					count = true;
					stop();
				}
				if(count == true)
					stop();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//위치 확인 테스트
				System.out.println(label.getIcon() + " " + label.getX());
			}
		}
	}

}
