package 메서드연습;

public class 내가게 {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		cal.더하기(2, 3);
		cal.곱하기(30,20,10); //void
		int result = cal.빼기(500, 200); //300
		System.out.println(result-100);
	}

}
