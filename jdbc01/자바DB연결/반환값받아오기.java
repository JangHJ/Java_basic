package 자바DB연결;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

import javax.swing.JOptionPane;

public class 반환값받아오기 {

	public static void main(String[] args) {
//		전화기 tel = new 전화기();
//		tel.인터넷하다();
//		tel.전화통화하다();
		반환값연습 re = new 반환값연습(); //메서드 12개
		
		re.add2();	//void 함수
		
		int result1 = re.add(200, 100); //int 300
		System.out.println("더한 값은 " + result1);
		
		//JOptionPane.showInputDialog(message);
		

		double result2 = re.add(22.1, 10); //double 32.1
		System.out.println("더한 값은 " + result2);
		
		String result3 = re.add("나는", "바보");
		System.out.println("더한 값은 " + result3);
		
		String result4 = re.add(1, "번 바보");
		System.out.println("더한 값은 " + result4);
		
		int[] result5 = re.add(); // {1, 2, 3}
		result5[0] = 100;
		System.out.println(result5[0]);
		System.out.println(result5[1]);
		System.out.println(result5[2]);
		
		Date result6 = re.getDate(); // 실행했을 때 년월일시분초요일
		System.out.println(result6.getMinutes());
		System.out.println(result6.getSeconds());

		System.out.println(result6.getDay()); 
		//0:일요일, 1:월요일, 2:화요일 ...

		int result7 = re.getHour();
		System.out.println(result7 + "시 입니다. 수업중.");
		
		int result8 = re.getRandom2();
		System.out.println("랜덤한 정수는 " + result8);
		
		ArrayList result9 = re.getList();
		result9.set(0,  "양파");
		
		for(int i=0; i<result9.size(); i++)
		{
			System.out.println(result9.get(i));
		}
		System.out.println(result9);
		
		HashSet result10 = re.getSet();
		System.out.println(result10);
		
		
	}

}
