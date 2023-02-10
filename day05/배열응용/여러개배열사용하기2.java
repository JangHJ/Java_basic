package 배열응용;

public class 여러개배열사용하기2 {

	public static void main(String[] args) {
		String[] names = {"홍길동", "이순신", "뉴진스", "방탄", "블랙핑크"};
		int[] term1 = { 77, 88, 99, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };
		int count = 0;
		int equalcnt = 0;
		int avg1 = 0, avg2 = 0;
		//1. 1학기보다 2학기 성적이 오른 학생 몇명?
		for (int i = 0; i < term1.length; i++) {
			if(term1[i] < term2[i])
				count++;
		}
		System.out.println("2학기 성적이 오른 학생수 : " + count);
		//2. 1학기, 2학기 성적이 동일한 학생 몇명?
		for (int i = 0; i < term1.length; i++) {
			if(term1[i] == term2[i])
				equalcnt++;
		}
		System.out.println("1학기와 2학기 성적이 동일한 학생 수 : " + equalcnt);
		//3. 2학기 학생 중 만점(100)인 학생의 이름과 번호는?
		for (int i = 0; i < term2.length; i++) {
			if(term2[i] == 100)
				System.out.println("2학기 학생 중 만점인 학생의 이름과 번호 : " + names[i] + "\t" + (i+1) + "번"); //인덱스0 -> 1번 인덱스1 -> 2번으로 출력
		}
		//4. 1학기 성적의 평균과 2학기 성적의 평균 중 누가 더 높았는지
		for (int i = 0; i < term1.length; i++) {
			avg1 += term1[i];
			avg2 += term2[i];
		}
		System.out.println("<1학기 성적 평균 : " + avg1 + ">");
		System.out.println("<2학기 성적 평균 : " + avg2 + ">");
		if(avg1 > avg2)
			System.out.println("1학기 성적평균이 더 높습니다.");
		else if (avg1 < avg2)
			System.out.println("2학기 성적평균이 더 높습니다.");
		else
			System.out.println("1학기와 2학기 성적 평균이 같습니다.");
		//5. 심화)뉴진스의 1학기 성적, 2학기 성적은?
		for (int i = 0; i < names.length; i++) {
			if(names[i].equals("뉴진스"))
			{
				System.out.println("뉴진스의 1학기 성적 : " + term1[i]);
				System.out.println("뉴진스의 2학기 성적 : " + term2[i]);
			}
		}
	}

}
