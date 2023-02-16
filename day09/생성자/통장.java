package 생성자;

public class 통장 {
	String name; //이름
	String ssn;	//주민번호
	int money;	//돈
	
	public 통장(String name, String ssn, int money) {
		this.name = name;
		this.ssn = ssn;
		this.money = money;
	}

	@Override
	public String toString() {
		return "통장 [name=" + name + ", ssn=" + ssn + ", money=" + money + "]";
	}
	
	//이름, 주민번호, 돈을 입력해야 통장을 만들 수 있게 한다.
}
