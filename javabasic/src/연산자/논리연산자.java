package 연산자;

public class 논리연산자 {

	public static void main(String[] args) {
		//논리적으로 판단하고싶을 때 조건이 2개이상이라면?
		//
		int id = 1111; //변수에 값을 넣을 때 = 사용
		int id2 = 2222; 
		
		int pw = 3333;
		int pw2 = 3333;
		
		//아이디가 동일한지 비교 //비교할때 사용 ==
		//패스워드가 동일한지 비교
		System.out.println(id == id2); //false
		System.out.println(pw == pw2); //true
		//&&, and조건, 두 조건이 모두 맞아야 맞다라고 판단
		//로그인 처리!!
		System.out.println(id == id2 && pw == pw2); //false
		
		int mem1 = 111;
		int mem2 = 222;
		
		System.out.println(mem1 == 111 || mem2 == 111);
	}
}
