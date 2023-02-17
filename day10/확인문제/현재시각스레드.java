package 확인문제;

import java.text.SimpleDateFormat;
import java.util.Date;

public class 현재시각스레드 extends Thread {

	public void run() {
		for (int i = 0; i < 50; i++) {
			Date date = new Date();

			SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd/a hh:mm");
			System.out.println(f.format(date));
			try {
				Thread.sleep(1000); // 1000 -> 1초
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김.");
			}
		}
	}
}
