package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열의유사도 {

	public static void main(String[] args) {
		String[] s1 = {"a", "b", "c"};
		String[] s2 = {"com", "b", "d", "p", "c"};
		Solution5 sol = new Solution5();
		int answer = sol.solution(s1,s2);
		System.out.println(answer);
	}
}

class Solution5 {
	public int solution(String[] s1, String[] s2) {
		int answer = 0;
		List<String> list1 = new ArrayList<String>(Arrays.asList(s1));
		List<String> list2 = new ArrayList<String>(Arrays.asList(s2));

		for(String s : list2) {
			if(list1.contains(s))
				answer++;
		}
		return answer;
	}
}