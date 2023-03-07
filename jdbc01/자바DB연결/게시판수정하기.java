package 자바DB연결;

import java.util.Scanner;

public class 게시판수정하기 {

	public static void main(String[] args) {
		//입력해보자.
		Scanner sc = new Scanner(System.in);
		System.out.println("<게시판 수정하기>");
		System.out.println("no/content순으로 입력하세요.");

		int no = sc.nextInt();
		sc.nextLine();
		String content = sc.nextLine();
		
		BbsDAO dao = new BbsDAO();
		dao.update(no, content);
	}

}
