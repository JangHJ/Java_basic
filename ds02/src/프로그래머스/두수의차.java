package 프로그래머스;
import java.util.Scanner;

public class 두수의차 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		Solution sol = new Solution();
		int answer = sol.solution(num1, num2); //int
		System.out.println(answer);
		sc.close();
	}
}

class Solution {
    public int solution(int num1, int num2) {
        int answer = num1 - num2;
        return answer;
    }
}
