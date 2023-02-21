package 형변환;

import java.util.ArrayList;
import java.util.Set;

public class 컬렉션테스트 {

	public static void main(String[] args) {
		// 많은 양의 데이터를 다루는 부품류를 콜렉션(collection)
		// ==> 종류가 많다.
		// ==> 많은 양의 데이터들도 특징이 있고, 그 특징에 따라
		//     콜렉션의 종류가 많음.
		// ==> 배열 + 사이즈조절 + 타입 아무거나 넣을 수 있는 ArrayList
		
		ArrayList list = new ArrayList(); //참조형 변수
		list.add("홍길동");
		list.add(100);
		list.add(11.2);
		list.add(true);
		//toString()재정의되어있어서 가르키는 값들이 프린트!
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		//중간에 삽입
		list.add(0, "김길동");
		System.out.println(list);
		//제거
		list.remove(0); //파괴함수(o), 비파괴함수???
		//파괴함수 : 원본을 파괴시버리는 함수(원본이 변형, ram에 있는 데이터 변경)
		//비파괴함수 : 원본은 파괴되지않는 함수(ram에 있는 데이터 불변)
		System.out.println(list);
		//변경
		list.set(0, "정길동"); //파괴함수(o)
		System.out.println(list);
		
		//인덱스 위치 확인
		int index = list.indexOf(true);
		System.out.println(index);
		
		//포함여부 확인
		boolean result = list.contains(11.2);
		System.out.println(result);
		
		
		
		

	}

}																																																																																																						