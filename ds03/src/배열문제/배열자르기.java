package 배열문제;

import java.util.Arrays;

public class 배열자르기 {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		int num1 = 1;
		int num2 = 3;
		Solution6 sol = new Solution6();
		int[] answer = sol.solution(numbers, num1, num2);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution6 {
    public int[] solution(int[] numbers, int num1, int num2) {
    	int size = (num2 - num1) + 1;
        int[] answer = new int[size];
        int index = num1;
        for(int i=0; i<size; i++)
        {
            answer[i] = numbers[index];
            index++;   
        }
        return answer;
    }
}