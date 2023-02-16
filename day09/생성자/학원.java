package 생성자;

public class 학원 {
	public static void main(String[] args) {
		수강신청 sub1 = new 수강신청("자바", "14:30", "홍길동");
		수강신청 sub2 = new 수강신청("JSP", "9:30", "고길동");
		
		System.out.println(sub1);
		System.out.println(sub2);
	}
}
