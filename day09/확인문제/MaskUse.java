package 확인문제;

public class MaskUse {
	public static void main(String[] args) {
		Mask m1 = new Mask("흰색", 3000, 5);	//색, 가격, 개수
		Mask m2 = new Mask("검정색", 2500, 2);
		System.out.println(m1);
		System.out.println(m2);
	}
}
