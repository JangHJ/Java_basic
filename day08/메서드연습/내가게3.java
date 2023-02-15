package 메서드연습;

public class 내가게3 {

	public static void main(String[] args) {
		계산기3 cal3 = new 계산기3();
		int price = 7000;
		int count1 = 5;	//오전에 온 손님 수
		int count2 = 4;	//오후에 온 손님 수
		
		//계산기3 이용
		//1. 전체 손님수를 반환받아서 다음과 같이 프린트 -> 오늘 온 손님의 총 합은 9명입니다.
		int result1 = cal3.add(count1, count2);
		System.out.println("오늘 온 손님의 총 합은 " + result1 + "명입니다.");
		
		//2. 오전과 오후 손님수 차이는? -> 손님 수 차이는 1명입니다.
		int result2 = cal3.minus(count1, count2);
		System.out.println("손님 수 차이는 " + result2 + "명입니다.");
		System.out.println(Math.ceil(3.334));
		System.out.println(Math.floor(3.334));
		System.out.println(Math.round(3.334));
		System.out.println(Math.sqrt(100)); //루트
		System.out.println(Math.max(100, 200));
		System.out.println(Math.min(100, 200));
		System.out.println(Math.pow(2, 3)); //2의 3승
		
		//3. 오전에 들어온 손님의 결제금액은? 오전 결제금액은 35000원입니다.
		int result3 = cal3.multi(price, count1);
		System.out.println("오전 결제금액은 " + result3 + "원입니다.");
		
		//4. 오후에 들어온 손님의 결제금액은? 오후 결제금액은 28000원입니다.
		int result4 = cal3.multi(price, count2);
		System.out.println("오전 결제금액은 " + result4 + "원입니다.");
		
		//5. 오전과 오후에 들어온 손님의 총 결제금액은? -> 오늘 하루 총 결제 금액은 63000원입니다.
		int result5 = cal3.multi(price, count1) + cal3.multi(price, count2);
		System.out.println("오전 결제금액은 " + result5 + "원입니다.");
		
		//6. 5번에서 계산한 결제 금액으로 1인당 결제금액을 계산해주세요. -> 1인당 결제금액은 7000원입니다.
		int result6 = cal3.div(result5, result1);	// ==> 총 결제금액 / 손님의 총 합
		System.out.println("1인당 결제금액은 " + result6 + "원입니다.");
	}

}
