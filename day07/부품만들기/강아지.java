package 부품만들기;

public class 강아지 {
	//일반적인 부품은 main이 없음
	//성질 : 멤버변수
	public String breed;	//멤버 변수는 자동초기화 (0)
	public String sex;	//기본형이 아닌 참조형의 경우 모두 null로 초기화
	public double weight;
	
	//동작(기능) : 멤버메소드(함수와 동일), 동적인 기능을 수행
	public void 밥을먹다() {
		//기능 처리하는 방법을 나열
		System.out.println("사료를 먹는다");
		System.out.println("다 먹은 후 물을 마신다");
	}
	public void 산책하다() {
		System.out.println("리드줄을 채운다");
		System.out.println("주변 산책로를 걷는다");
	}
}
