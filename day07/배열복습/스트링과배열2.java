package 배열복습;

public class 스트링과배열2 {

	public static void main(String[] args) {
		String s = "감자, 고구마, 양파";
		// 스트링에 들어있는 문자열을 분리시키고 싶을 때 split(기준)
		// 분리된 결과는 배열에 들어감
		String[] s2 = s.split(",");
		System.out.println(s2.length);
		System.out.println(s2[0]);
		String ss = "감자 고구마 양파";
		String[] ss2 = ss.split(" ");
		System.out.println(ss2[0]);
		
		String s3 = "    홍길동"; //4
		System.out.println(s3.trim());
		String s4 = s3.trim();
		System.out.println(s4.length());
		
		String s5 = s3.replace("    ", "");
		System.out.println(s5.length());
		
		String s6 = "홍길동";	//각각의 글자를 하나씩 분리하고 싶을 때
		char[] s7 = s6.toCharArray();
		System.out.println(s7[0]);
		System.out.println(s7[1]);
		System.out.println(s7[2]);

	}

}
