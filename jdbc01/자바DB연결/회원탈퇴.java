package 자바DB연결;

import java.util.Scanner;

public class 회원탈퇴 {

	public static void main(String[] args) {
		
		//입력해보자.
		Scanner sc = new Scanner(System.in);
		System.out.println("탈퇴할 id를 입력하세요.");
		
		String id = sc.next();
		
		MemberDAO2 dao = new MemberDAO2();
		dao.delete(id);
	}


}
