package 문자열;

public class StringBuilderTest2 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		sb1.append("honghong");
		System.out.println(sb1);
		
		StringBuilder sb11 = new StringBuilder("honghong");
		System.out.println(sb11);
		
		StringBuilder sb2 = new StringBuilder("honghong");
		System.out.println(sb2);
		
		System.out.println(sb1 == sb2);
		sb1.append("hahaha");
		System.out.println(sb1);
		sb1.replace(0, 8, "hohohoh");
		System.out.println(sb1);
		sb1.delete(0, 8);
		System.out.println(sb1);		
	}
}