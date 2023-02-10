package 복습;

public class 배열만들기 {
	public static void main(String[] args) {
		//1. 배열 만들기-이미 값을 알고 있는 경우
		String[] hobby = {"run", "book", "swim", "walk"};
		// hobby : 참조형 변수, 주소가 들어있음
		System.out.println(hobby);
		System.out.println("0 : " + hobby[0]);
		System.out.println("1 : " + hobby[1]);
		System.out.println(hobby.length);
		System.out.println(hobby[3]);
		System.out.println(hobby[hobby.length-1]);
		for (int i = 0; i < hobby.length; i++) {
			System.out.println(i + " : " + hobby[i]);
		}
		//for-each문
		for (String s : hobby) {
			System.out.println(s);
		}
		//2. 배열 만들기-값을 아직 모르는 경우, 공간부터 만들어놓기
		String[] jobs = new String[5];
		System.out.println(jobs);
		jobs[0] = "백엔드 프로그래머";
		jobs[1] = "카페주인";
		System.out.println(jobs[0]);
		System.out.println(jobs[1]);
		System.out.println(jobs[jobs.length - 1]); // == jobs[4]
		//System.out.println(jobs[5]); 인덱스 범위초과로 오류
		for (String x : jobs) {
			System.out.println(x);
		}
		
	}
}
