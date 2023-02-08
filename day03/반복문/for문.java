package 반복문;

public class for문 {
	public static void main(String[] args) {
		
		//for(초기값; 조건식; 증감식)
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "내가 반복1");
		}
		
		for (int i = 0; i < 100; i++) {
			System.out.println("내가 반복2 >> " + i);
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("내가 반복3 >> " + (i+1) + "번째 실행중");
		}
	}
}
