package 상속응용;

public class 골뱅이스레드 extends Thread{

	
	@Override
	public void run() {
		//동시에 처리하고 싶은 내용
		for (int i = 0; i < 1000; i++) {
			System.out.println("@");
		}
	}
}
