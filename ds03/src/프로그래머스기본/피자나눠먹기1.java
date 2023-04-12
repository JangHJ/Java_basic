package 프로그래머스기본;

public class 피자나눠먹기1 {
	public static void main(String[] args) {
		int n = 15;
		Solution4 sol = new Solution4();
		int answer = sol.solution(n);
		System.out.println(answer);
	}
}

class Solution4 {
    public int solution(int n) {
        int add = n%7==0 ? 0 : 1;
        return n/7 + add;
    }
}