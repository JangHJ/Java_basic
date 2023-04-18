package 큐;

import java.util.LinkedList;

public class 백준_카드2문제 {

	public static void main(String[] args) {
		int x = 6;
		LinkedList<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= x; i++) {
			queue.add(i);
		}
		System.out.println(queue);
		for (int i = 0; i <= queue.size(); i++) {
			queue.remove();
			System.out.println("remove> " + queue);
			queue.add(queue.remove());
			System.out.println("add> " + queue);
		}
		queue.remove();
		System.out.println("queue에 남은 것>> " + queue);
	}

}
