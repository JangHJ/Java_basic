package 미니프로젝트;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import oracle.jdbc.proxy.annotation.GetCreator;
import 자바DB연결.MemberDAO3;

public class TestUI {

	public static void main(String[] args) {
		
//		String resname = JOptionPane.showInputDialog("가게이름 입력");
//		String id = JOptionPane.showInputDialog("아이디 입력");
		JFrame f = new JFrame();
		JButton b = new JButton("리뷰삭제");
		f.setSize(500, 700);
//		ReviewDAO dao = new ReviewDAO();
//		OrderDAO dao = new OrderDAO();
		String id = "bbb";
//		dao.delete(3);
//		System.out.println("삭제완료");
//		dao.insert(2, 3.5, "별로별로");
//		dao.update(3, "진짜별로");
//		dao.update(2, "별로");
//		dao.one(id);
//		dao.one(id);

		ReviewDAO dao = new ReviewDAO();
		ArrayList<ReviewVO> list = dao.list(id); // ArrayList<MemberVO>
		ReviewVO bag = new ReviewVO();
		
		String[] header = {"가게이름", "평점", "메뉴이름", "리뷰내용"};
		Object[][] all = new String[list.size()][4];
		
		if (list.size() == 0) {
			System.out.println("검색결과 없음. ");
		} else {
			System.out.println("검색결과는 전체 " + list.size() + "개 입니다.");
			for (int i = 0; i < all.length; i++) { //13개의 가방,13개의 행  
				all[i][0] = list.get(i).getSname();
				String str = String.valueOf(list.get(i).getRating());
				all[i][1] = str;
				all[i][2] = list.get(i).getMname();
				all[i][3] = list.get(i).getContent();
			}
		}//else  
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dao.delete(bag.getOrder_no());
			}
		});
		JTable table = new JTable(all, header);
		JScrollPane scroll = new JScrollPane(table);
		f.setLayout(new FlowLayout());
		f.add(scroll);
		f.add(b);
		
		
		
		
		
		
		f.setVisible(true);
	}
}