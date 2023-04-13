package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열과컬렉션전환2 {

	public static void main(String[] args) {
		String[] 냉장고음식 = {"감자", "고구마", "우유", "감자", "양파"};
		stringPrint(냉장고음식);
		List<String> list = new ArrayList<String>(Arrays.asList(냉장고음식));
		
		//1. 감자가 들어있는 마지막 위치를 구해보세요.
		System.out.println(list.indexOf("감자"));

		//2. 양파를 포함하고 있으면 "양파는 안사도 된다" 출력, 포함되어있지 않다면 "양파사서 냉장고에 넣어야한다" 출력
		if(list.contains("양파")) {
			System.out.println("양파는 안사도 된다.");
		}else {
			System.out.println("양파사서 냉장고에 넣어야한다.");
		}
		
		//3. 우유를 "춘식이 우유"로 수정해보자. 전체출력
		list.set(2, "춘식이 우유");
		System.out.println(list);
		
		//4. 양파의 위치를 찾은 후, 해당 위치에 "양파즙"이라고 수정. 전체출력
		int index = list.indexOf("양파");
		list.set(index, "양파즙");
		System.out.println(list);
		
		//5. 다시 배열로 반환하여 전체 내용 출력.
		String[] 냉장고음식2 = (String[])list.toArray(new String[list.size()]);
		stringPrint(냉장고음식2);
	}
	
	public static void intPrint(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	public static void stringPrint(String[] array) {
		System.out.println(Arrays.toString(array));
	}
}