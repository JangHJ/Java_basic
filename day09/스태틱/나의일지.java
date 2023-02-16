package 스태틱;

public class 나의일지 {
	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 8, "줌"); //4개
		System.out.println("객체 생성 횟수 : " + Day.count);
		System.out.println("총 시간 : " + Day.sum);
		Day day2 = new Day("주변산책", 1, "산책로");
		System.out.println("객체 생성 횟수 : " + Day.count);
		System.out.println("총 시간 : " + Day.sum);
		Day day3 = new Day("시험정리", 2, "집");
		System.out.println("객체 생성 횟수 : " + Day.count);	//count 이탤릭체표시 (static변수)
		System.out.println("총 시간 : " + Day.sum);
		//static이 붙은 메서드나 변수는 객체 생성하지 않아도
		//클래스 이름으로 바로 접근해서 사용 가능!
		// 총 12개 다이나믹 생성, 멤버변수 ==> 객체생성할 때마다 다이나믹하게
		// 무더기영역(heap)에 생긴 변수, 인스턴스 변수라 부른다.
		
		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
	}
}
