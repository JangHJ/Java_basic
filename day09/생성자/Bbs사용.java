package 생성자;

public class Bbs사용 {
	public static void main(String[] args) {
		Bbs b1 = new Bbs(1, "java", "fun java", "park");
		Bbs b2 = new Bbs(2, "jsp", "fun jsp", "hong");
		Bbs b3 = new Bbs(3, "spring", "fun spring", "kim");
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}
}
