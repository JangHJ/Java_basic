package 배열;

import java.util.function.IntPredicate;

public class 배열개념 {
	public static void main(String[] args) {
		//여러개 데이터를 램에 저장해두면 cpu가 접근하여 사용하고
		//싶은 경우 사용하는 부품
		//1. 값을 이미 알고있는 경우
		int[] point = {10,20,30,40}; //length 만들어서 몇 개인지 카운팅 한 후 값에 넣어줌
		System.out.println(point);
		System.out.println(point[0]); //첫번째 값
		System.out.println(point[1]); //두번째 값
		System.out.println(point[2]); //세번째 값
		System.out.println(point[3]); //네번째 값
		System.out.println(point.length); //이 주소가 가리키는 length변수
		
		point[0] = 100;
		System.out.println(point[0]);
		
		//2. 값은 아직 모르지만 먼저 저장공간을 만들어두고 나중에 값을 넣는 경우
		int[] point2 = new int[4];
		point2[0] = 200;
		System.out.println(point2[0]);
	}
}
