package 복습;

import java.util.ArrayList;

import javax.swing.JButton;

public class 아무거나 {

	public static void main(String[] args) {
		//인덱스, 순서, 직접 접근! ==> ArrayList
		ArrayList list = new ArrayList();
		list.add("홍길동");	//object <- String (자동형변환)
		list.add(100);		//object <- Integer(Wrapper클래스) <- 오토박싱 <- int(기본형)
		list.add(11.22);	//object <- Double(Wrapper클래스, 포장클래스) <- 오토박싱 <- double(기본형)
		list.add(new JButton());	//object <- JButton
		// 기본형만 오토언박싱 <- 언박싱 : Wrapper클래스에서 기본형으로 변환
		
		String name = (String)list.get(0);	//직접 접근! 랜덤액세스 가능! 강제형변환
		//String <- object, 강제형변환
		int age = (Integer)list.get(1);
		//int <- Integer <- object, 오토언박싱, 강제형변환
		
		
		
		
	}

}
