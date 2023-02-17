package 상속응용;

public class 이미지스레드 extends Thread {

	public void run() {
		String[] images = {"1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg"};
		for (int i = 0; i < images.length; i++) {
			System.out.println("이미지>> " + images[i]);
			if(i == images.length-1)
				i=-1;
			try {
				Thread.sleep(2000); // 1000 -> 1초
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김.");
			}
		}
	}
}
