package 배열;

public class 짝홀수판별기 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i % 2 == 0)
				sum = sum-i;
			else
				sum = sum+i;
		}
		System.out.println(sum);
	}
}
