package 순차문;

import javax.swing.JOptionPane;

//부품이 있는 위치를 알려주는 역할


public class 미션3 {

	public static void main(String[] args) {
		//기본 순차문 == 입력 -> 처리 -> 출력
		//입력 -> 부품사용, 망치같은 언제나 바로 사용할 수 있는것!! 사용해보기
		String pw = JOptionPane.showInputDialog("암호를 대시오");
		
		if(pw.equals("pass"))
		{
			System.out.println("들어오세요");
		}
		else {
			System.out.println("나가세요");
		}
		
		System.out.println("=========================");
		
		String menu = JOptionPane.showInputDialog("당신이 먹고 싶은 메뉴는?(자장면, 라면, 회)에서 선택");
		
		switch (menu) {
		case "자장면":
			System.out.println("중국집으로 가요");
			break;
		case "라면":
			System.out.println("분식집으로 가요");
			break;
		case "회":
			System.out.println("횟집으로 가요");
			break;
		default:
			System.out.println("그냥 안먹어요");
			break;
		}
		
		System.out.println("=========================");
		
		String num1 = JOptionPane.showInputDialog("첫번째 정수를 입력하세요");
		String num2 = JOptionPane.showInputDialog("두번째 정수를 입력하세요");
		
		int num11 = Integer.parseInt(num1);
		int num22 = Integer.parseInt(num2);
		
		if(num11 > num22) {
			System.out.println("첫번째 정수 " + num1 + "가 더 큽니다");
		}
		else if(num22 > num11) {
			System.out.println("두번째 정수 " + num2 + "이(가) 더 큽니다");
		}
		else {
			System.out.println("두 정수의 크기가 같습니다");
		}
		
		System.out.println("=========================");
		
		String no = "A100EX";
		char c = no.charAt(0);
		
		switch (c) {
		case 'A':
			System.out.println("기획부");
			break;
		case 'B':
			System.out.println("총무부");
			break;
		case 'C':
			System.out.println("개발부");
			break;
		default:
			System.out.println("해당 부서 없음");
			break;
		}
	}
}
