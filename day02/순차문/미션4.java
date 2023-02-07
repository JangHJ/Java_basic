package 순차문;
import javax.swing.JOptionPane;

public class 미션4 {

	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("첫번째 정수를 입력하세요");
		String num2 = JOptionPane.showInputDialog("두번째 정수를 입력하세요");
		String oper = JOptionPane.showInputDialog("연산자를 입력하세요 (+, -, *, /)");
		
		int num11 = Integer.parseInt(num1);
		int num22 = Integer.parseInt(num2);
		
		switch (oper) {
		case "+":
			System.out.println(num1 + " + " + num2 + " = " + (num11+num22));
			break;
		case "-":
			System.out.println(num1 + " - " + num2 + " = " + (num11-num22));
			break;
		case "*":
			System.out.println(num1 + " * " + num2 + " = " + (num11*num22));
			break;
		case "/":
			System.out.println(num1 + " / " + num2 + " = " + (num11/num22));
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
		
		System.out.println("=========================");
		
		String num3 = JOptionPane.showInputDialog("첫번째 정수를 입력하세요");
		String num4 = JOptionPane.showInputDialog("두번째 정수를 입력하세요");
		
		int num33 = Integer.parseInt(num3);
		int num44 = Integer.parseInt(num4);
		
		double result = (double)num33 / (double)num44;
		System.out.printf(num3 + " / " + num4 + " = ");
		System.out.printf("%.2f",result);
		
	}
}
