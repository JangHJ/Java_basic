package 상속응용;

public class Thread2 extends Thread{
	
	@Override
	public void run() {
		//동시에 처리하고 싶은 내용
		for (int i = 100; i > 0; i--) {
			System.out.println("감소 : " + i);
		}
	}
}
