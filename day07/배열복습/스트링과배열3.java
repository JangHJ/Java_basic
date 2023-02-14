package 배열복습;

public class 스트링과배열3 {

	public static void main(String[] args) {
		String tel = "  010-245-1234  ";
		String s1 = tel.trim();
		System.out.println(s1);
		String[] s2 = s1.split("-");
		System.out.println(s2[0]);
		System.out.println(s2[1]);
		System.out.println(s2[2]);
		switch (s2[0]) {
		case "011":
			System.out.println("SK");
			break;
		case "019":
			System.out.println("LG");			
			break;
		default:
			System.out.println("나머지");
			break;
		}
		
		if(s2[1].length() >= 4)
			System.out.println("최신폰");
		else 
			System.out.println("올드폰");
		
		String s3 = s1.replace("-", ""); // s2[0].length() + s2[1].length() + s2[2].length();
		System.out.println(s3.length());
		if(s3.length() >= 10)
			System.out.println("유효한 전화번호");
		else
			System.out.println("유효하지 않은 전화번호");

	}

}
