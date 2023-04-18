package 컬렉션2;

import java.util.HashMap;

public class 완주하지못한선수 {

	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		String answer = "empty";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		//key타입		value타입
		
		for(String x : completion) {
			if(map.get(x) != null) 
				map.put(x, map.getOrDefault(x, 0) + 1);
			else
				map.put(x, 1);
		}
		
		for(String x : participant) {
			if(map.get(x) != null) {
				int data = map.get(x);
				if(data > 0)
					map.put(x, data-1);
				else
					answer = x;
			}
			else
				answer = x;
		}
		System.out.println(answer);
	}
}
