package 컬렉션;

import java.util.HashSet;
import java.util.Iterator;

public class Set반복자이터레이터 {

	public static void main(String[] args) {
		HashSet<String> bag = new HashSet<String>();
		bag.add("휴대폰");
		bag.add("휴지");
		bag.add("볼펜");
		bag.add("볼펜"); //중복된 값은 들어가지지 않음.
		System.out.println(bag.size());
		System.out.println(bag);
		
		//set에서 꺼내올 때는 iterator를 만들어줘야함.
		Iterator<String> it = bag.iterator();
		System.out.println(it.hasNext());
		for(int i=0; i<bag.size(); i++) {//3
			String x = it.next();
			System.out.println(x);
		}
		System.out.println("------------");
		Object[] bag2 = bag.toArray();
		for(Object x : bag2) {
			System.out.println(x);
		}
	}

}
