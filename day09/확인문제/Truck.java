package 확인문제;

public class Truck extends Car {
	double ton;
	
	public void load() {
		System.out.println("짐을 차에 싣다");
	}
	
	@Override
	public void drive() {
		System.out.println("느리게 운전하다.");
	}
	@Override
	public void gasup() {
		System.out.println("최대한 많이 주유하다.");
	}
}
