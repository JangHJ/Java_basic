package 컬렉션2;

import java.util.HashMap;

public class 좋아하는과일투표 {

	public static void main(String[] args) {
		String[] all = {"apple", "banana", "apple", "banana", "melon", "apple"};
		String[] find = {"apple", "banana", "melon"};
		
		HashMap<String, Integer> map = new HashMap<>();
		//key타입		value타입
		
		for(String x : find) {
			map.put(x, 0); //명단을 map에 넣자.
		}
		
		for(String x : all) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		System.out.println(map);
		int maxValue = 0;
		String maxKey = "";
		for(String key : map.keySet()) { //키의 목록 구하기
			System.out.println(key + " : " + map.get(key));
			if(map.get(key) > maxValue) {
				maxValue = map.get(key);
				maxKey = key;
			}
		}
		System.out.println("가장 많이 나온 과일명 : " + maxKey);
		System.out.println("카운트 : " + maxValue);
	}
}
