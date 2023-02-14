package 배열복습;

public class 이차원배열프린트2 {
	public static void main(String[] args) {
		String[][] s = {
				{"미국", "싱가포르", "런던"}, //가고싶은 여행지
				{"오이", "샐러리", "당근"},	//싫어하는 채소
				{"파랑", "초록", "빨강"}	//좋아하는 색
		};
		
		for (int i = 0; i < s.length; i++) {
			if(i == 0)
				System.out.print("가고싶은 여행지 : ");
			else if(i == 1)
				System.out.print("싫어하는 채소 : ");
			else 
				System.out.print("좋아하는 색깔 : ");
			for (int j = 0; j < s[i].length; j++) {
				System.out.print(s[i][j] + " ");
			}
			System.out.println();
		}
	}
}
