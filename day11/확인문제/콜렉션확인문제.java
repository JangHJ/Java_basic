package 확인문제;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class 콜렉션확인문제 {

	public static void main(String[] args) {
		//1.한번 갔던 여행지X 여행지 5곳을 만들어서 전체 프린트
		HashSet trip = new HashSet();
		trip.add("도쿄");
		trip.add("부산");
		trip.add("뉴욕");
		trip.add("파리");
		trip.add("싱가포르");
		System.out.println(trip);
		//2.각 방에 물건 배치. 안방-tv / 거실-쇼파 / 부엌-냉장고 / 현관-신발 
		HashMap room = new HashMap();
		room.put("안방", "TV");
		room.put("거실", "소파");
		room.put("부엌", "냉장고");
		room.put("현관", "신발");
		System.out.println(room);
		System.out.println(room.get("현관"));
		room.replace("거실", "책상");
		System.out.println(room);
		//전체프린트 -> 현관엔 무엇이 있나요? -> 거실에 책상으로 변경해 프린트
		//3.오늘 할일 우선순위 5개 목록만들어서 전체프린트 -> 첫번째할일과 마지막 할일 프린트 -> 2번째 할일을 청소로 변경해서 프린트
		ArrayList dolist = new ArrayList();
		String[] todo = {"잠자기", "밥먹기", "산책하기", "TV보기", "샤워하기"};
		for (int i = 0; i < todo.length; i++) {
			dolist.add(todo[i]);
		}
		System.out.println(dolist);
		System.out.println(dolist.get(0));
		System.out.println(dolist.get(dolist.size()-1));
		dolist.set(1, "청소");
		System.out.println(dolist);
	}

}
