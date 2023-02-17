package 상속기본;

public class 매니저 extends 직원{
	//직원 멤버 변수 4개, 멤버메서드 1개를 상속받음
	int bonus;
	
	public void test() {
		System.out.println("관리감독하다.");
	}

	@Override
	public String toString() {
		return "매니저 [bonus=" + bonus + ", name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn
				+ "]";
	}
	
	
	
	
}
	