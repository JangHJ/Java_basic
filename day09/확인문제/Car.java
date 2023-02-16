package 확인문제;

public class Car {
	//차의 기본적인 성질 ==>
	int tire;
	String color;
	
	public void drive() {
		System.out.println("운전하다.");
	}
	public void gasup() {
		System.out.println("주유를 하다.");
	}
	
	@Override
	public String toString() {
		return "Car [tire=" + tire + ", color=" + color + "]";
	}
	
	
}
