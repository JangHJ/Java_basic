package 부품사용하기;

import 부품만들기.강아지;

public class 강아지사용하기 {
	public static void main(String[] args) {
		//전화기를 만들어보자. 2개
		강아지 d1 = new 강아지();
		d1.breed = "포메라니안";
		d1.sex = "암컷";
		d1.weight = 3.9;
		
		System.out.println("강아지의 품종 : " + d1.breed);
		System.out.println("강아지의 성별 : " + d1.sex);
		System.out.println("강아지의 체중 : " + d1.weight);
		d1.밥을먹다();
		
		System.out.println("-------------------");
		강아지 d2 = new 강아지();
		d2.breed = "시츄";
		d2.sex = "암컷";
		d2.weight = 4.1;
		
		System.out.println("강아지의 품종 : " + d2.breed);
		System.out.println("강아지의 성별 : " + d2.sex);
		System.out.println("강아지의 체중 : " + d2.weight + "kg");
		d2.산책하다();
	}
}
