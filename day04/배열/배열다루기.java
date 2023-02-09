package 배열;

public class 배열다루기 {
	public static void main(String[] args) {
//		int[] x = new int[10];	//length: 10
//		//index는 0부터 시작, 마지막 위치의 인덱스는 10보다 작음.
//		//0~9
//		x[0] = 10;
//		x[1] = 20;
//		
//		for (int i = 0; i < x.length; i++) {
//			System.out.print(x[i] + " ");
//		}
//		System.out.println(x[0]);
//		System.out.println(x[1]);
		
		//우리가족의 성별을 char[]로 저장, 프린트
		//우리가족의 이름을 String[]로 저장, 프린트
		//우리가족의 시력을 double[]로 저장, 프린트
		//우리가족이 점심을 먹었는지 boolean[]로 저장, 프린트
		char[] gender = {'남', '여', '남', '남'};
		String[] name = {"김철수","이영희","김놀부","김흥부"};
		double[] eye = {1.5, 2.0, 1.1, 0.8};
		boolean[] lunch = {true, true, true, false};
		
		System.out.print("가족들의 성별 : ");
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i] + " ");
		}
		System.out.println("");
		System.out.print("가족들의 이름 : ");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println("");
		System.out.print("가족들의 시력 : ");
		for (int i = 0; i < eye.length; i++) {
			System.out.print(eye[i] + " ");
		}
		System.out.println("");
		System.out.print("가족들이 점심 먹었는지 : ");
		for (int i = 0; i < lunch.length; i++) {
			System.out.print(lunch[i] + " ");
		}
	}
}
