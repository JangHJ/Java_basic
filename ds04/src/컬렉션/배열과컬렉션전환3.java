package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열과컬렉션전환3 {

	public static void main(String[] args) {
		String[] s2 = {"aaa", "bbb", "ccc", "aaa"};
		stringPrint(s2);
		
		//배열을 가지고 하면 복잡한 처리가 있다면 List로 바꿔서 하면 편하다.
		List<String> list = new ArrayList<String>(Arrays.asList(s2));
		
		//1. aaa가 포함되어 있나요?
		System.out.println(list.contains("aaa"));
		
		//2. 맨 뒤에 "fff"를 추가해라
		list.add("fff");
		System.out.println(list);
		
		//3. 원하는 index에 "ggg"를 삽입해라
		list.add(1, "ggg");
		System.out.println(list);
		
		//4. "ccc"를 삭제해라.
		list.remove("ccc");
		System.out.println(list);
		
		//배열로 옮겨야 한다면 새로 배열을 만들어 옮기기
		String[] s3 = new String[list.size()];
		for(int i=0; i<s3.length; i++) {
			s3[i] = list.get(i);
		}
		stringPrint(s3);
	}
	
	public static void intPrint(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	public static void stringPrint(String[] array) {
		System.out.println(Arrays.toString(array));
	}
}