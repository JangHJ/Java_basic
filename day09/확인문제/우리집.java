package 확인문제;

public class 우리집 {

	public static void main(String[] args) {
		딸 d1 = new 딸("홍길순", "여");
		딸 d2 = new 딸("홍길진", "여");
		
		System.out.println("1. 딸들의 정보 출력");
		System.out.println(d1);
		System.out.println(d2);

		System.out.println("2. 딸이 몇명인가? >> " + 딸.count + "명");
		System.out.println("3. 현재 아빠 지갑에 남은 돈 >> " + 딸.wallet);
		
	}

}
