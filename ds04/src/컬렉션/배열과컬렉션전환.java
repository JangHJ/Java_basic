package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열과컬렉션전환 {

	public static void main(String[] args) {
		int[] s = { 5, 2, 1, 9, 11, 15, 17 };
		
		intPrint(s);
		Arrays.sort(s);
		intPrint(s);
		
		String[] s2 = {"aaa", "bbb", "ccc", "ddd", "eee"};
		stringPrint(s2);
		
		List<String> list = new ArrayList<String>(Arrays.asList(s2));
		System.out.println(list);
		System.out.println(list.contains("aaa"));
		
		//1. bbb삭제
		list.remove("bbb");
		
		//2. ccc가  들어있는 위치를 찾아보세요
		System.out.println(list.indexOf("ccc"));
		
		//4. 전체 내용 프린트
		System.out.println(list);
		
		//5. 맨 앞에 ddd삽입
		list.add(0, "ddd");
		System.out.println(list);
		
		//6. 맨 뒤에 fff삽입
		list.add("fff");
		System.out.println(list);

		//7. 인덱스2번의 내용을 ggg로 변경
		list.set(2, "ggg");
		System.out.println(list);
		//8. 전체 내용 프린트 
		
		String[] s3 = (String[])list.toArray(new String[list.size()]);
		stringPrint(s3);
	}
	
	public static void intPrint(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	public static void stringPrint(String[] array) {
		System.out.println(Arrays.toString(array));
	}
}