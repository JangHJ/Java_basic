package 스태틱;

public class 직원 {
	String name;
	int age;
	String gender;
	static int count=0;
	static int sum=0;
	
	public static void getAvg() {
		//static메서드에서 전역변수에 접근할 때에는
		//같은 성격을 가진 static변수만 접근 가능!
		System.out.println(sum / count + "살");
	}
	public 직원(String name, int age, String gender) {
		count += 1;
		sum += age;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	


}
