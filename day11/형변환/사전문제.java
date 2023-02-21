package 형변환;

import java.util.HashMap;

public class 사전문제 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("사과", "apple");
		map.put("메론", "melon");
		map.put("물", "water");
		System.out.println(map);
		System.out.println(map.get("사과"));	//get(키)
		map.remove("물");
		System.out.println(map);
		map.replace("메론", "melons");
		System.out.println(map);		
	}
}
