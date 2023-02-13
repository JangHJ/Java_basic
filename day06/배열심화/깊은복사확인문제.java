package 배열심화;

public class 깊은복사확인문제 {
	public static void main(String[] args) {
		String[] sub1 = {"국어", "영어", "수학", "컴퓨터", "회화"};
		int[] score1 = {44, 66, 22, 99, 100};
		//깊은 복사이용
		int[] score2 = score1.clone();
		
		System.out.println(score1==score2);
		
		score2[0] = 22;
		score2[2] = 88;

		// 0. 전체 1학기, 2학기 성적 프린트
		System.out.print("1학기 성적 >> ");
		for (int i = 0; i < score1.length; i++) {
			System.out.print(score1[i] + " ");
		}
		System.out.println();
		System.out.print("2학기 성적 >> ");
		for (int i = 0; i < score2.length; i++) {
			System.out.print(score2[i] + " ");
		}
		System.out.println();
		// 1. 1학기, 2학기 성적 중 동일한 성적과목수
		int cnt1 = 0; //성적이 동일한 과목 수
		int cnt2 = 0; //성적이 오른 과목 수
		
		for (int i = 0; i < score1.length; i++) {
			if(score1[i] == score2[i])
				cnt1++;
			else if(score1[i] < score2[i])
				cnt2++;
		}
		System.out.println("1학기, 2학기 성적이 동일한 과목 수 >> " + cnt1 + "과목");
		// 2. 1학기, 2학기 성적 중 오른 과목 수
		System.out.println("1학기보다 2학기 성적이 오른 과목 수 >> " + cnt2 + "과목");
		
		// 3. 1학기, 2학기 성적 중 오른 과목명
		System.out.print("1학기보다 2학기 성적이 오른 과목명 >> ");
		for (int i = 0; i < score1.length; i++) {
			if(score1[i] < score2[i])
				System.out.println(sub1[i] + " ");
		}
		
		
	}
}
