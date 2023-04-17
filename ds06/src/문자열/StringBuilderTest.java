package 문자열;

public class StringBuilderTest {
	public static void main(String[] args) {
		String s = "pongpong";
		String s2 = "pongpong";
		System.out.println(s == s2); //주소비교
		System.out.println(s.equals(s2)); //주소가 가르키는 값 비교
		
		s = "haha";
		System.out.println(s == s2); //주소비교
		System.out.println(s.equals(s2)); //주소가 가르키는 값 비교
	}
}
