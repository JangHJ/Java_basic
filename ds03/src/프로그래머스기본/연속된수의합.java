package 프로그래머스기본;

public class 연속된수의합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		double num = -49.5;
		int i=0;
		while(i < 100) {
			sum += num;
			num++;
			i++;
		}
		System.out.println(sum);
	}

}
