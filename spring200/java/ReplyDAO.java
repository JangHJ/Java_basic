package com.multi.mvc200;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class ReplyDAO { // CRUD

	public ArrayList<ReplyVO> list(int bbsno) {
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블

		// 가방들 넣어줄 큰 컨테이너 역할을 부품이 필요!
		// ArrayList<ReplyVO> ==> ReplyVO만 들어간 arraylist라는 의미
		ArrayList<ReplyVO> list = new ArrayList<ReplyVO>();

		ReplyVO bag = null;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mySQL과 자바 연결할 부품 설정 성공.");

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			// String url = "jdbc:mysql://localhost:3306/sys";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. mySQL 연결 성공.");
			
			String sql = "select * from reply where bbsno = ?";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			// 삭제!!!! ps.setString(1, id);
			ps.setInt(1, bbsno);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery(); // select문 전송시
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			while (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				// true이면 있다라는 의미, false이면 없다라는 의미
				// 1. 검색겨로가가 있으면,
				// System.out.println("검색결과 있음. 성공.");
				// 2. 각 컬럼에서 값들을 꺼내오자.
				int no = rs.getInt(1); // id
				int bbsno2 = rs.getInt(2); // title
				String content = rs.getString(3); // content
				String writer = rs.getString(4); // writer
				System.out.println( no + " "	+ bbsno + " " + content + " " + writer);
				// 검색결과를 검색화면 UI부분을 주어야 함.
				// 3. 가방을 만들자.
				bag = new ReplyVO();
				bag.setNo(no);
				bag.setBbsno(bbsno2);
				bag.setContent(content);
				bag.setWriter(writer);

				// 4. list에 bag을 추가해주자.
				list.add(bag);
			}
			// System.out.println(result);
			ps.close();
			rs.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}
	// 메서드를 만드는 것 ==> 메서드 정의(define)!
	// 메서드를 정의했다고 실행되는 것은 아니다.!
	// 메서드를 쓰는 것 ==> 메서드 호출(call)!
	
	public ReplyVO one(int no) {
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블
		// 기본형 정수/실수/문자/논리만 값으로 초기화
		// 나머지 데이터형(참조형) 주소가! 들어가 있음.
		// 참조형 변수를 초기화할 때는 null(주소가 없다라는 의미)
		ReplyVO bag = null;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mySQL과 자바 연결할 부품 설정 성공.");

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			// String url = "jdbc:mysql://localhost:3306/sys";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. mySQL 연결 성공.");

			String sql = "select * from reply where no = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setInt(1, no);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery(); // select문 전송시
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				// true이면 있다라는 의미, false이면 없다라는 의미
				System.out.println("검색결과 있음. 성공.");
				int no2 = rs.getInt(1); // no2
				int bbsno = rs.getInt(2); // title
				String content = rs.getString(3); // content
				String writer = rs.getString(4); // writer
				System.out.println(no + " " + bbsno + " " + content + " " + writer);
				// 검색결과를 검색화면 UI부분을 주어야 함.
				bag = new ReplyVO();
				bag.setNo(no);
				bag.setBbsno(bbsno);
				bag.setContent(content);
				bag.setWriter(writer);
			} else {
				System.out.println("검색결과 없음. 성공.");
			}
			// System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bag;

	}

	public int delete(int no) {
		int result = 0;

		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mySQL과 자바 연결할 부품 설정 성공.");

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			// String url = "jdbc:mysql://localhost:3306/sys";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. mySQL 연결 성공.");
			
			String sql = "delete from reply where no = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setInt(1, no);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("탈퇴 성공.");
			}
			// System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;

	}

	// 1. 가방을 받아서 저장해두자.
	// 2. 필요할 때 가방에서 값들을 하나씩 꺼내자.
	public int update(ReplyVO bag) {
		int result = 0;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mySQL과 자바 연결할 부품 설정 성공.");

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			// String url = "jdbc:mysql://localhost:3306/sys";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			
			System.out.println("2. mySQL 연결 성공.");

			String sql = "update reply set content = ? where no = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, bag.getContent());
			ps.setInt(2, bag.getNo());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			result = ps.executeUpdate(); // 1
			// insert, update, delete문만!! sql문 실행결과가 int
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("수정 성공.");
			}
			// System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	// public void add2() {
	public int insert(ReplyVO bag) {
		// 1. 가방을 받아서 변수에 넣어주세요.
		int result = 0;

		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mySQL과 자바 연결할 부품 설정 성공.");

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			// String url = "jdbc:mysql://localhost:3306/sys";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. mySQL 연결 성공.");

			String sql = "insert into reply(bbsno, content, writer) values (?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql); 
			ps.setInt(1, bag.getBbsno());
			ps.setString(2, bag.getContent());
			ps.setString(3, bag.getWriter());

			// ==> insert into hr.MEMBER values ('a','a','a','a');
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			result = ps.executeUpdate(); // 1
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("책 등록 성공!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(result);
		return result;
	}
}
