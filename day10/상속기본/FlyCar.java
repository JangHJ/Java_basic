package 상속기본;

public class FlyCar extends Car{
	//직원 멤버 변수 4개, 멤버메서드 1개를 상속받음
	boolean fly;
	
	public void fly() {
		System.out.println("공중에서 날다");
	}

	@Override
	public String toString() {
		return "FlyCar [fly=" + fly + ", color=" + color + "]";
	}
}
	