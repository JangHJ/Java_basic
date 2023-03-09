package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Locale;

import 화면DB연결.ProductVO;

public class ProductDAO {
	//crud기능을 메서드로 만들어준다.
	public void insert(ProductVO bag)
	{
		//1. 가방이 전달되면 저장
		//2. 필요할 때 가방에서 데이터를 하나씩 꺼내줌
		System.out.println("전달된 id는 " + bag.getId());
		System.out.println("전달된 name은 " + bag.getName());
		System.out.println("전달된 content는 " + bag.getContent());
		
		
	}
	
	
}
