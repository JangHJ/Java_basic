package 상속기본;

public class 커피전문점 {
	public static void main(String[] args) {
		매니저 m = new 매니저();
		m.name = "홍길동";
		m.address = "강남구";
		m.salary = 250;
		m.rrn = "920506";
		m.bonus = 50;
		System.out.println(m);
	}
}
