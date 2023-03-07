package 자바DB연결;

import java.util.Scanner;

public class 게시판글쓰기 {

	public static void main(String[] args) {
		//입력해보자.
		Scanner sc = new Scanner(System.in);
		System.out.println("<게시판 글쓰기>");
		System.out.println("no/title/content/writer순으로 입력하세요.");
		
		int no = sc.nextInt();
		String title = sc.next();
		sc.nextLine();
		String content = sc.nextLine();
		String writer = sc.next();
		
		BbsDAO dao = new BbsDAO();
		dao.insert(no, title, content, writer); //win6
	}

}
