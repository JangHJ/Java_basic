package 화면DB연결;

import java.util.ArrayList;

import 자바DB연결.MemberDAO3;

public class MemberUI4 {

	public static void main(String[] args) {
		// 프로그램 시작하자 마자 db에서 데이터를 가지고 와서
		// 화면을 만들어주고 싶음.
		MemberDAO3 dao = new MemberDAO3();
		ArrayList<MemberVO> list = dao.list(); // ArrayList<MemberVO>
		if (list.size() == 0) {
			System.out.println("검색결과 없음. ");
		} else {
			System.out.println("검색결과는 전체 " + list.size() + "개 입니다.");

			for (MemberVO bag : list) {
				System.out.println(bag.getId());
				System.out.println(bag.getPw());
				System.out.println(bag.getName());
				System.out.println(bag.getTel());
				System.out.println("---------------");
				
			}
		}    
	}

}
