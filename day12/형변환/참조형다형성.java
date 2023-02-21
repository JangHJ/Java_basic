package 형변환;

import java.util.ArrayList;

import javax.swing.JButton;

public class 참조형다형성 {

	public static void main(String[] args) {
		//클래스 다형성 == 참조형 다형성
		//상속관계일때만 형변환 가능!
		
		ArrayList list = new ArrayList();
		//자동형변환(업캐스트)
		list.add("홍길동");	//Object(큰) <- String(작)
		list.add(100);		//Object(큰) <- Integer(작)
		list.add(11.22);	//Object(큰) <- Double(작)
		list.add(new JButton("나는 버튼"));		//Object(큰) <- JButton(작)
		
		//강제형변환(다운캐스팅)
		String name = (String)list.get(0);
		//String이 가진 메서드(기능)을 쓰려면 반드시 String으로 강제형변환을 해줘야한다.
		System.out.println(name.charAt(0));
		System.out.println(name.length());
		
		int age = (Integer)list.get(1);
		System.out.println(age + 1); //강제형변환을 해주지 않았다면 object형이기 때문에 +1 불가
		
		double jumsu = (Double)list.get(2);
		System.out.println(jumsu + 10);
		
		JButton b = (JButton)list.get(3);
		b.setText("나는 진짜 버튼");
	}

}
