package 배열응용;

public class 우리반성적변동 {

	public static void main(String[] args) {
		int[] n1 = { 44, 66, 77, 22, 11 };
		int[] n2 = { 33, 55, 77, 22, 40 };
		
		int count = 0;
		int count2 = 0;
		
		for (int i = 0; i < n1.length; i++) {
			if(n1[i] == n2[i])
				count++;
			else 
				count2++;
		}
		System.out.println("1-2학기 성적이 동일한 학생 수 : " + count + "명");
		System.out.println("1-2학기 성적이 동일하지 않은 학생 수 : " + count2 + "명");
	}

}
