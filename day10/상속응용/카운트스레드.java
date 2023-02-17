package 상속응용;

public class 카운트스레드 extends Thread {

	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.println("카운트>> " + i);
			//cpu에게 스레드 쉬는 텀을 알려주기
			//thread를 잠깐 쉬게할 수 있음.
			//cpu는 외부자원. 자바가 외부자원을 연결할 때는 try~catch
			try {
				Thread.sleep(2000); // 1000 -> 1초
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김.");
			}
		}
	}
}
