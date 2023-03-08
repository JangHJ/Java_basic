package 자바DB연결;

import java.util.Scanner;

public class 회원정보수정 {

	public static void main(String[] args) {
		//입력해보자.
		Scanner sc = new Scanner(System.in);
		System.out.println("id/tel순으로 입력하세요.");

		String id = sc.next();
		String tel = sc.next();
		
		MemberDAO2 dao = new MemberDAO2();
		dao.update(id, tel);
	}

}
