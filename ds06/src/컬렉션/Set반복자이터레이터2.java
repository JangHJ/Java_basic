package 컬렉션;

import java.util.HashSet;
import java.util.Iterator;

public class Set반복자이터레이터2 {

	public static void main(String[] args) {
		HashSet<Integer> bag = new HashSet<Integer>();
		//일주일간 받았던 용돈
		//1000, 2000, 3000, 2000, 4000, 2000, 3000
		//일주일간 받았던 용돈 중에서 
		//얼마씩 받았는지 전체 프린트
		//1000, 2000, 3000, 4000
		bag.add(1000); //월
		bag.add(2000); //화
		bag.add(3000); //수
		bag.add(2000); //목
		bag.add(4000); //금
		bag.add(2000); //토
		bag.add(3000); //일
		
		System.out.println(bag.size());
		System.out.println(bag);
		
		Iterator<Integer> it = bag.iterator();
		System.out.println(it.hasNext());
		for(int i=0; i<bag.size(); i++) {
			int x = it.next();
			System.out.println(x);
		}
		System.out.println("------------");
		Object[] bag2 = bag.toArray();
		for(Object x : bag2) {
			System.out.println(x);
		}
		
	}

}
