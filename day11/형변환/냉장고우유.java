package 형변환;

import java.util.LinkedList;

public class 냉장고우유 {
	public static void main(String[] args) {
		//Queue 대기줄, 먼저 들어온 요소(element)가 먼저 나감
		LinkedList milk = new LinkedList();
		milk.add("어제 상한 우유");
		milk.add("오늘 싱싱한 우유");
		milk.add("내일 더 싱싱한 우유");
		milk.remove();
		System.out.println(milk);
		milk.remove();
		System.out.println(milk);
	}
}
