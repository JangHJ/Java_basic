package 형변환;

import java.util.HashSet;

public class 로또문제 {

	public static void main(String[] args) {
		HashSet bag = new HashSet();
		bag.add("휴대폰");
		bag.add("휴지");
		bag.add("볼펜");
		System.out.println(bag);
		bag.add("볼펜");
		System.out.println(bag);
	}

}