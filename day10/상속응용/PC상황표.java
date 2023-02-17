package 상속응용;

public class PC상황표 extends Thread {

	public static void main(String[] args) {
		카운트스레드 count = new 카운트스레드();
		타이머스레드 timer = new 타이머스레드();
		이미지스레드 image = new 이미지스레드(); 
		
		count.start();	//run()메서드 안에 정의된 내용이 동시에 실행됨.
		timer.start();
		image.start();
	}

}
