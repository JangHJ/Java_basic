package 배열;

public class 배열최소값구하기1{

	public static void main(String[] args) {
		int[] s = {90, 80, 20, 60, 70};
		int min = s[0];
		for(int x : s) {
			if(min > x)
				min = x;
		}
		System.out.println("최소값 : " + min);
		
		for(int i=0; i<s.length-1; i++) {
			if(s[i] > s[i+1]) {
				int temp = s[i];
				s[i] = s[i+1];
				s[i+1] = temp;
			}
		}
		for(int n : s) {
			System.out.println(n);
		}
	}
}
