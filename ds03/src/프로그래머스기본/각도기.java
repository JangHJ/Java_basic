package 프로그래머스기본;

public class 각도기 {

	public static void main(String[] args) {
		int angle = 70;
		Solution sol = new Solution();
		int answer = sol.solution(angle); //1
		System.out.println(answer);
	}
}

class Solution {
    public int solution(int angle) {
    	int answer = 0;
    	if (angle > 0 && angle < 90) {
			answer = 1;
		}else if(angle == 90) {
			answer = 2;
		}else if(angle > 90 && angle < 180) {
			answer = 3;
		}else if(angle == 180) {
			answer = 4;
		}else {
		}
        return answer;
    }
}