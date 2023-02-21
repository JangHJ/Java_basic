package 상속;

import 복습.직원;

public class 직원사용 {
	public static void main(String[] args) {
		직원 work = new 직원();
		work.name = "홍길동";
		work.setAddress("강남구");
		work.salary = 100;
		
		work.getrrn();
	}
}
