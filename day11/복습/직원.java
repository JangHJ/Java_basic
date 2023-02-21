package 복습;

public class 직원 {
	public String name;	//같은 + 다른 패키지(아무데서나 접근가능)
	String address; 	//같은 패키지 접근 가능
	public int salary;	//같은 패키지 + 다른 패키지(상속할 때만)
	public int rrn;	//이 클래스 안에서만
	
	public int getrrn() {
		return rrn;
	}

	public void setAddress(String string) {
	}
}
