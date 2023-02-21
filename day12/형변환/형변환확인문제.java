package 형변환;

import java.util.ArrayList;

public class 형변환확인문제 {

	public static void main(String[] args) {
		ArrayList me = new ArrayList();
		me.add(1000);	//object <- 업캐스팅 - Integer <- 오토박싱 - int
		me.add(189.1);	//object <- Double <- double
		me.add(false);	//object <- Boolean <- boolean
		me.add('남');	//object <- Character <- char
		
		//ArrayList는 toString()이 재정의
		//list라는 참조형이기 때문에 list를 프린트하면 주소!가 프린트됨
		//toString()이 재정의한 내용은 주소가 가르키는 값들을 String으로 만들어주도록 정의함
		//list를 찍어보면 주소대신 String으로 만든 내용이 출력
		
		int money = (Integer)me.get(0);			//int <- 오토언박싱 - Integer <- 다운캐스팅 - object
		double height = (double)me.get(1);		//double <- Double <- object
		boolean ate = (boolean)me.get(2);		//boolean <- Boolean <- object
		char gender = (char)me.get(3);
		
		System.out.println(money + 1000);				
		System.out.println(height + 10);
		
		if(ate)
			System.out.println("배불러요");
		else
			System.out.println("배고파요");
		
		if(gender == '남')
			System.out.println("주민번호 1,3");
		else
			System.out.println("주민번호 2,4");
			
	}

}
