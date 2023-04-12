package 프로그래머스기본;

public class 피자나눠먹기3 {
	public static void main(String[] args) {
		int slice = 7;
		int n = 10;
		Solution6 sol = new Solution6();
		int answer = sol.solution(slice, n);
		System.out.println(answer);
	}
}

class Solution6 {
    public int solution(int slice, int n) {
        for(int i=1; i<=n; i++){
            if((slice * i) >= n) return i;
        }
        return 1;
    }
}