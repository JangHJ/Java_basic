package 자바DB연결;

import java.util.Scanner;

import 화면DB연결.ProductVO;

public class 상품등록 {

	public static void main(String[] args) {
		//입력해보자.
		Scanner sc = new Scanner(System.in);
		System.out.println("id/name/content순으로 입력하세요.");
		String id = sc.next();
		String name = sc.next();
		String content = sc.next();
		
		//1. 가방 만들어주기
		ProductVO bag = new ProductVO();
		
		//2. 가방에 데이터 넣어주기
		bag.setId(id);
		bag.setName(name);
		bag.setContent(content); //값을 하나씩 set해줌.
		
		//3. 가방 전달하기 => VO를 만들어서 DAO에 넣어주기
		ProductDAO dao = new ProductDAO();
		dao.insert(bag); //win6
	}

}
