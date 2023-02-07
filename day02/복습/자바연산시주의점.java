package 복습;

public class 자바연산시주의점 {

	public static void main(String[] args) {
		//자바 연산시 주의점
		int x = 20;
		int y = 30;
		
		System.out.println(x / y);
		
		//소숫점까지 구할 수는 없음
		//정수와 정수의 계산 결과는 무조건 정수
		//계산시 하나라도 실수라면 결과는 실수
		
		int x2 = 20;
		double y2 = 30;	//30.0, 30(double에 정수를 넣을 수 있음)
		System.out.println(x2 / y2);
		
		//이미 정수로 저장된 값을 cpu가 가져다가 실수 연산을 하고 싶은 경우
		//cpu가 정수를 실수로 변환해서 할 수 있음.
		System.out.println(x / (double)y);
		
		
	}

}
