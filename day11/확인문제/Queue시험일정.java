package 확인문제;

import java.util.LinkedList;

public class Queue시험일정 {
	public static void main(String[] args) {
		String[] sub = {"국어", "수학", "영어", "컴퓨터"};
		LinkedList test = new LinkedList();
		
		for (int i = 0; i < sub.length; i++) {
			test.add(sub[i]);
		}
//		test.add("국어");
//		test.add("수학");
//		test.add("영어");
//		test.add("컴퓨터");
		System.out.println("전체 시험볼 과목: " + test);
		
//		test.remove();
//		System.out.println("1일차 시험본 후 남은 과목: " + test);
//		test.remove();	
//		System.out.println("2일차 시험본 후 남은 과목: " + test);
//		test.remove();
//		System.out.println("3일차 시험본 후 남은 과목: " + test);
		
		for (int i = 0; test.size() > 1; i++) {
			test.remove();
			System.out.println((i+1) + "일차 시험본 후 남은 과목: " + test);
		}
	}
}
