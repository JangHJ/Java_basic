package 배열문제;

import java.util.Arrays;

public class 문자열길이배열로리턴2 {

	public static void main(String[] args) {
		String[] strlist = { "I", "Love", "Programmers." };

		Solution4 sol = new Solution4();
		int[] answer = sol.solution(strlist);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution4 {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        
        for(int i=0; i<strlist.length; i++)
        {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}