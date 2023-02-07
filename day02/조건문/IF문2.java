package 조건문;

public class IF문2 {
	public static void main(String[] args) {
		int x=0;
		int y=0;
		//x와 y가 같은지 비교하고
		//같으면 "동일합니다" 프린트
		//같지않으면 "동일하지않습니다" 프린트
		
		if (x == y) {//true
			System.out.println("동일합니다");
		} else {
			System.out.println("동일하지 않습니다");
		}
		
		int id1=1111;
		int id2=2222;
		//x와 y가 같은지 비교하고
		//같으면 "동일합니다" 프린트
		//같지않으면 "동일하지않습니다" 프린트
		if (id1 == id2) {//true
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		
		
	}
}
