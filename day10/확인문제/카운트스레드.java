package 확인문제;

public class 카운트스레드 extends Thread {
	static int cnt;
	public void run() {
		for (int i = 0; i < 50; i++) {
			cnt++;
			System.out.println(cnt + "초 지났습니다!");
			try {
				Thread.sleep(1000); // 1000 -> 1초
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김.");
			}
		}
	}
}
