package 상속기본;

public class Car {
	String color; 	//색깔
	
	
	public void run() {
		System.out.println("지면에 바퀴를 굴리며 달리다");
	}


	@Override
	public String toString() {
		return "Car [color=" + color + "]";
	}
}
