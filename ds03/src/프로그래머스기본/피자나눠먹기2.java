package 프로그래머스기본;

public class 피자나눠먹기2 {
	public static void main(String[] args) {
		int n = 10;
		Solution5 sol = new Solution5();
		int answer = sol.solution( n);
		System.out.println(answer);
	}
}

class Solution5{
    public int solution(int n) {
//    	for(int i=1; i<=n; i++)
//        {
//            if( (i * 6) % n == 0)
//                return i;
//        }
        for(int i=1; i<=6; i++)
        {
            if( (n * i) % 6 == 0)
                return (n * i)/6;
        }
        return 0;
    }
}