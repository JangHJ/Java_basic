package 배열심화;

public class 배열깊은복사 {

	public static void main(String[] args) {
		int[] num3 = {100, 200, 300};
		int[] num4 = num3; //얕은 복사, 주소를 복사
		System.out.println(num3);
		System.out.println(num4);
		
		num3[0] = 999;
		for (int i = 0; i < num3.length; i++) {
			System.out.println(num3[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < num4.length; i++) {
			System.out.println(num4[i] + " ");
		}

		
		int[] num33 = {100, 200, 300};
		int[] num44 = num33.clone(); //깊은 복사, 주소가 가리키는 값만 복사
		System.out.println(num33);
		System.out.println(num44);
		
		num33[0] = 999;
		for (int i = 0; i < num33.length; i++) {
			System.out.println(num33[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < num44.length; i++) {
			System.out.println(num44[i] + " ");
		}
	}

}
