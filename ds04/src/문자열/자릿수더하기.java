package 문자열;

public class 자릿수더하기 {

	public static void main(String[] args) {
		int n = 930211;
		Solution1 sol = new Solution1();
		int answer = sol.solution(n);
		System.out.println(answer);
	}
}

class Solution1 {
	public int solution(int n) {
		int answer = 0;
		//방법1 n을 문자열로 만들어 split후 각 앞자리 숫자로 다시 변환해 더해줌
//		String num = String.valueOf(n);
//
//		for (String s : num.split("")) {
//			int temp = Integer.parseInt(s);
//			answer += temp;
//		}
		
		//방법2. 10으로 나눠주면서 뒤 자릿수부터 더해줌. 
		while(n > 0) {
			answer += n%10;
			n /= 10;
		}
		return answer;
	}
}