package 확인문제;

public class 로딩스레드 extends Thread {

	public static void main(String[] args) {
		카운트스레드 count = new 카운트스레드();
		현재시각스레드 timer = new 현재시각스레드();
		문자열스레드 image = new 문자열스레드(); 
		
		count.start();	//run()메서드 안에 정의된 내용이 동시에 실행됨.
		timer.start();
		image.start();
	}

}
