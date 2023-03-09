package 자바DB연결;

import java.util.Scanner;

public class 회원1명검색 {

	public static void main(String[] args) {
	
		//입력해보자.
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 id를 입력하세요.");
		
		String id = sc.next();
		
		MemberDAO3 dao = new MemberDAO3();
		dao.one(id);
		
	}

}