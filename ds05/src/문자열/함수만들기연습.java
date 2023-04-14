package 문자열;

public class 함수만들기연습 {

	public static void 빨래하다() {
		System.out.println("빨래1) 세제넣다.");
		System.out.println("빨래2) 물을 채우다.");
		System.out.println("빨래3) 세탁기 뚜껑 닫다.");
	}
	public static void 헹구다() {
		System.out.println("헹굼1) 물을 가득 넣다.");
		System.out.println("헹굼2) 강하게 돌리다.");
	}
	public static void 탈수하다() {
		System.out.println("탈수1) 강하게 회전하게 하다.");
		System.out.println("탈수2) 발란스를 맞추다. ");
	}
	
	public static void main(String[] args) {
		// 메서드(방법을 정의, 함수 --> 메서드)
		//1. 빨래를 모아서
		System.out.println("1. 빨래를 모아서");
		//2. 세탁기에 넣고
		System.out.println("2. 세탁기에 넣고");
		//3. 빨래하다.
		빨래하다();
		//4. 헹구다.
		헹구다();
		//5. 탈수하다.
		탈수하다();
		//6. 빨래하다.
		빨래하다();
		//7. 헹구다.
		헹구다();
		//8. 탈수하다.
		탈수하다();
		//9. 빨래를 널다. 
		System.out.println("9. 빨래를 널다.");
	}
}