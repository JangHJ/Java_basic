package 부품만들기;

public class 전화기 {
	//일반적인 부품은 main이 없음
	//성질 : 멤버변수
	public int price;	//멤버 변수는 자동초기화 (0)
	public String shape;	//기본형이 아닌 참조형의 경우 모두 null로 초기화
	
	//동작(기능) : 멤버메소드(함수와 동일), 동적인 기능을 수행
	public void 인터넷하다() {
		//기능 처리하는 방법을 나열
		System.out.println("와이파이연결하다");
		System.out.println("데이터를 써서 연결하다");
	}
	public void 카톡하다() {
		System.out.println("자바 단체톡을 하다");
		System.out.println("게시물을 올리다");
	}
}
