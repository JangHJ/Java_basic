package 문자열;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class String에서Char배열에옮기기2 {

	public static void print(String[] s) {
		System.out.println(Arrays.toString(s));
	}
	
	public static void main(String[] args) {
		String s = "2056521"; // index 이용해서 추출
		//1. 마지막 위치의 숫자가 1이면 서대문구에서 출생
		char c1 = s.charAt(s.length()-1);
		//		1이 아니라면 다른 구에서 출생 출력
		if(c1 == '1') {
			System.out.println("서대문구에서 출생");
		}else {
			System.out.println("다른 구에서 출생");
		}
		//2. "52"를 추출하여 두 숫자를 더해보세요.
		//		더해서 10이 넘지 않아야 유효한 주민번호
		//		유효한 주민번호인지 아닌지 출력
		char[] two = new char[2];
		s.getChars(4, 6, two, 0);
		//원본인 String s에서 4~5를 추출해서 char[]인 two에 인덱스 0부터 넣어준다.
		System.out.println(Arrays.toString(two));
		
		int n1 = Character.getNumericValue(two[0]);
		int n2 = Character.getNumericValue(two[1]);
		int sum = n1 + n2;
		if(sum < 10)
			System.out.println("유효한 주민번호입니다.");
		else
			System.out.println("유효한 주민번호가 아닙니다.");
		
		//3. 주민번호에 포함된 5의 갯수를 출력
		//1) String배열 - split
		String stringArray[] = s.split("");
		int count = 0;
		for(int i=0; i<stringArray.length; i++) {
			if(stringArray[i].equals("5"))
				count++;
		}
		System.out.println("5의 갯수 : " + count);
		
		//2)charAt(i)
		int count2 = 0;
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c == '5') {
				count2++;
			}
		}
		System.out.println("5의 갯수 : " + count2);
		
		//인덱스를 빨리 찾는 방법(함수)
		System.out.println(Arrays.binarySearch(stringArray, "5"));
		
		//배열에 특정한 값을 한꺼번에 변경할 수 있는 함수
		Arrays.fill(stringArray, 0, 3, "hoho");
		print(stringArray);
		
		//배열의 순서를 다 뒤집는 방법(함수)
		Arrays.sort(stringArray); //정렬 reverse
		//Arrays로 내림차순을 할 수는 있으나 너무 복잡하다.
		//==> collection으로 변환해서 reverse시키기
		print(stringArray);
		
		List<String> list = Arrays.asList(stringArray);
		Collections.sort(list); //정렬(오름차순)
		Collections.reverse(list); //정렬(내림차순)
		System.out.println(list);
		
		//배열안에 데이터의 빈도수(횟수)구하는 방법(함수)
		int count3 = Collections.frequency(list, "hoho");
		System.out.println(count3);
	}
}
