package 배열문제;

import java.util.Arrays;

public class 리턴여러개배열로 {
	public static void main(String[] args) {
		int money = 5500;
		Solution3 sol = new Solution3();
		int[] answer = sol.solution(money);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution3 {
    public int[] solution(int money) {
        int[] arr = new int[2];
        int price = 5500;
        
        arr[0] = money / price;
        arr[1] = money % price;
        return arr;
    }
}