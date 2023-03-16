package multi;

import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Locale;

import javax.swing.JOptionPane;

import multi.BbsVO;
import multi.MemberVO;

//테이블 하나당 DAO하나! => CUD를 완성!!
public class BbsDAO {
	public BbsVO one(int no) {
		ResultSet rs = null;
		BbsVO bag = null;
		try {
			// 1.mySQL 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mySQL과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); // 맥 locale에러나신 분들만!!!

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			// String url = "jdbc:mysql://localhost:3306/multi";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			//String data = JOptionPane.showInputDialog("이름입력"); //String, 김아무개
			System.out.println("2. mySQL 연결 성공.");
			
			//3. sql문을 만들다
			//String url = "http://www.naver.com";
			//자바는 부품조립식이라서, String에 넣은 문자열을 특정한 부품으로 인식하지 못함
			//특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			//SQL부품으로 만들어주어야 함.
			//PreparedStatement가 SQL부품!
			
			//URL u = new URL(url);
			String sql = "select * from BBS where no = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no); //ps.setInt(1,no);
			
			System.out.println("3. SQL문 부품(객체)으로 만들어주기");
		
			//4. sql문을 프로그램에 전송
			rs = ps.executeQuery();
			System.out.println("4. SQL문을 프로그램에 전송하기");
			if(rs.next()) {
				System.out.println("검색결과 있음. 성공.");
				int no2 = rs.getInt(1);
				String title = rs.getString(2); //title
				String content = rs.getString(3); //content
				String writer = rs.getString(4); //writer
				
				System.out.println(no2 + " "
						+ title + " "
						+ content + " "
						+ writer);
				bag = new BbsVO();
				bag.setNo(no);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);
			}
			else {
				System.out.println("검색결과 없음.");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return bag;
	}
	
	public void delete(int no) {
		try {
			// 1.mySQL 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mySQL과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); // 맥 locale에러나신 분들만!!!

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			// String url = "jdbc:mysql://localhost:3306/multi";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			//String data = JOptionPane.showInputDialog("이름입력"); //String, 김아무개
			System.out.println("2. mySQL 연결 성공.");
			
			//3. sql문을 만들다
			//String url = "http://www.naver.com";
			//자바는 부품조립식이라서, String에 넣은 문자열을 특정한 부품으로 인식하지 못함
			//특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			//SQL부품으로 만들어주어야 함.
			//PreparedStatement가 SQL부품!
			
			//URL u = new URL(url);
			String sql = "delete from BBS where no = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no); //ps.setInt(1,no);
			
			System.out.println("3. SQL문 부품(객체)으로 만들어주기");
			
			//4. sql문을 프로그램에 전송
			ps.executeUpdate();
			System.out.println("4. SQL문을 프로그램에 전송하기");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update(BbsVO bag) {
		try {
			// 1.mySQL 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mySQL과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); // 맥 locale에러나신 분들만!!!

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			// String url = "jdbc:mysql://localhost:3306/multi";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			//String data = JOptionPane.showInputDialog("이름입력"); //String, 김아무개
			System.out.println("2. mySQL 연결 성공.");
			
			//3. sql문을 만들다
			//String url = "http://www.naver.com";
			//자바는 부품조립식이라서, String에 넣은 문자열을 특정한 부품으로 인식하지 못함
			//특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			//SQL부품으로 만들어주어야 함.
			//PreparedStatement가 SQL부품!
			
			//URL u = new URL(url);
			String sql = "update BBS set content = ? where no = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getContent());
			ps.setInt(2, bag.getNo());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기");
			
			//4. sql문을 프로그램에 전송
			ps.executeUpdate();
			System.out.println("4. SQL문을 프로그램에 전송하기");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void insert(int no, String title, String content, String writer) {
		try {
			// 1.mySQL 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mySQL과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); // 맥 locale에러나신 분들만!!!

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			// String url = "jdbc:mysql://localhost:3306/multi";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			//String data = JOptionPane.showInputDialog("이름입력"); //String, 김아무개
			System.out.println("2. mySQL 연결 성공.");
			
			//3. sql문을 만들다
			//String url = "http://www.naver.com";
			//자바는 부품조립식이라서, String에 넣은 문자열을 특정한 부품으로 인식하지 못함
			//특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			//SQL부품으로 만들어주어야 함.
			//PreparedStatement가 SQL부품!
			
			//URL u = new URL(url);
			String sql =  "insert into BBS values(?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			ps.setString(2, title);
			ps.setString(3, content);
			ps.setString(4, writer);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기");
			
			//4. sql문을 프로그램에 전송
			ps.executeUpdate();
			System.out.println("4. SQL문을 프로그램에 전송하기");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public int insert2(BbsVO bag) { //가방VO을 이용한 insert
		int result = 0;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mySQL과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); // 맥 locale에러나신 분들만!!!

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			// String url = "jdbc:mysql://localhost:3306/multi";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			//String data = JOptionPane.showInputDialog("이름입력"); //String, 김아무개
			System.out.println("2. mySQL 연결 성공.");
			
			//3. sql문을 만들다
			//String url = "http://www.naver.com";
			//자바는 부품조립식이라서, String에 넣은 문자열을 특정한 부품으로 인식하지 못함
			//특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			//SQL부품으로 만들어주어야 함.
			//PreparedStatement가 SQL부품!
			
			//URL u = new URL(url);
			String sql = "insert into BBS (title, content, writer) values (?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			//con부품으로 sql스트링에 있는 걸 SQL부품으로 만들어주세요.
			ps.setString(1, bag.getTitle()); 
			ps.setString(2, bag.getContent()); 
			ps.setString(3, bag.getWriter()); 
			
			System.out.println("3. SQL문 부품(객체)으로 만들어주기");
			
			
			//4. sql문을 프로그램에 전송
			result = ps.executeUpdate(); //1
			System.out.println("4. SQL문을 프로그램에 전송하기");
			if(result == 1) {
				System.out.println("글 작성 완료!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}