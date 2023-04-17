package 문자열;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 문자열내림차순배치 {

	public static void main(String[] args) {
		String s = "Zbcdefg";
		String answer = "";
		
		//1-1. 내림차순으로 정렬을 한 후,
		//문자들을 하나씩 떨어뜨려야 한다. ==> ArrayList, 배열
		String[] s2 = s.split("");
		List<String> list = Arrays.asList(s2);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
		//1-2. for문을 이용해서 하나씩 꺼낸 후,
		//2. answer에 붙인다. 
		for (String x : list) {
			answer = answer + x; //answer += x;
		}
		
		System.out.println(answer);
	}

}