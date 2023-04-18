package 컬렉션2;

import java.util.Arrays;

public class K번째수 {

	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		int[] answer = new int[commands.length];

		for (int i = 0; i < answer.length; i++) {
			int[] cut = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			int k = commands[i][2];
			Arrays.sort(cut);
			answer[i] = cut[k - 1];

		}
		System.out.println(Arrays.toString(answer));
	}

}