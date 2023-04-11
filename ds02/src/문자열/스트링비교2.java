package 문자열;

import java.util.Arrays;

public class 스트링비교2 {

	public static void main(String[] args) {
		String all = "국어, 영어, 수학, 컴퓨터";
		String all2[] = all.split(",");
		for(int i=0; i<all2.length; i++) {
			if(all2[i].contains(" "))
				all2[i] = all2[i].trim();
		}
		
		System.out.println("과목 수 : " + all2.length);
		System.out.println(Arrays.toString(all2));
		for(int i=0; i<all2.length; i++) {
			if(all2[i].equals("컴퓨터"))
				System.out.println("컴퓨터의 위치는 " + i + "번째");
		}
		int count = 0;
		for(String a : all2) {
			if(a.length() < 3)
				count ++;
		}
		System.out.print("과목명이 3글자 미만인 과목 수 : " + count);
	}

}
