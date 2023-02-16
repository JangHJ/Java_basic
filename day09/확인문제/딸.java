package 확인문제;

public class 딸 {
	String name;
	String gender;
	static int wallet = 10000;
	static int count = 0;
	
	
	public 딸(String name, String gender) {
		wallet -= 1000;
		count++;
		this.name = name;
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "딸 [name=" + name + ", gender=" + gender + "]";
	}

}
