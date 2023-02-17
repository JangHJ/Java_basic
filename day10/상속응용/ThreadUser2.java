package 상속응용;

public class ThreadUser2 {
	public static void main(String[] args) {
//		Thread1 t1 = new Thread1();
//		Thread2 t2 = new Thread2();
		별스레드 t3 = new 별스레드();
		이름스레드 t4 = new 이름스레드();
		
//		t1.start();
//		t2.start();
		t3.start();
		t4.start();
	}
}
