package 미니프로젝트;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class InfoUI_sub1 {

	public void open2(String id, int no) {
		OrderDAO dao1 = new OrderDAO();
		ArrayList<OrderVO> orderlist = dao1.list(id);

		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(466, 550);
		f.setLayout(null);

		OrderVO bag = new OrderVO();

		String sname = orderlist.get(no).getSname();
		String mname = orderlist.get(no).getMname();
		String addr = orderlist.get(no).getAddr();
		int price = orderlist.get(no).getPrice();
		int order_no = orderlist.get(no).getOrder_no();
		String id2 = id;

		Font font1 = new Font("맑은 고딕", Font.BOLD, 30);
		Font font2 = new Font("맑은 고딕", 1, 20);
		Font font3 = new Font("맑은 고딕", 0, 16);
		JLabel title = new JLabel("주문 상세보기");

		JLabel label1 = new JLabel(sname);
		label1.setFont(font1);
		f.getContentPane().setBackground(Color.white);

		title.setOpaque(true); // JLabel 배경색 넣으려면 true 해놔야함.
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setBackground(Color.gray);

		JLabel label2 = new JLabel("주문번호 : " + order_no + "번");
		JLabel label3 = new JLabel("주문한 메뉴 : " + mname);
		JLabel label4 = new JLabel("주소 : " + addr);
		JLabel label5 = new JLabel("가격 : " + price + "원");
		JLabel label6 = new JLabel("주문한 사람 : " + id2);
		JButton button = new JButton("가게 바로가기");
		title.setFont(font1);
		label1.setFont(font2);
		label2.setFont(font3);
		label3.setFont(font3);
		label4.setFont(font3);
		label5.setFont(font3);
		label6.setFont(font3);
		button.setFont(font3);
		button.setBackground(Color.darkGray);
		button.setForeground(Color.white);
		title.setBounds(0, 0, 450, 85);
		label1.setBounds(10, 100, 400, 50);
		label2.setBounds(10, 150, 400, 50);
		label3.setBounds(10, 200, 400, 50);
		label4.setBounds(10, 250, 400, 50);
		label5.setBounds(10, 300, 400, 50);
		label6.setBounds(10, 350, 400, 50);
		button.setBounds(145, 450, 150, 50);

		f.add(title);
		f.add(label1);
		f.add(label2);
		f.add(label3);
		f.add(label4);
		f.add(label5);
		f.add(label6);
		f.add(button);

		f.setVisible(true);
	}

	public void open(int no, String sname, String mname, String addr, int price, String id) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(466, 550);
		f.setLayout(null);

		OrderVO bag = new OrderVO();

		Font font1 = new Font("맑은 고딕", Font.BOLD, 30);
		Font font2 = new Font("맑은 고딕", 1, 20);
		Font font3 = new Font("맑은 고딕", 0, 16);
		JLabel title = new JLabel("주문 상세보기");

		JLabel label1 = new JLabel(sname);
		label1.setFont(font1);
		f.getContentPane().setBackground(Color.white);

		title.setOpaque(true); // JLabel 배경색 넣으려면 true 해놔야함.
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setBackground(Color.gray);

		JLabel label2 = new JLabel("주문번호 : " + no + "번");
		JLabel label3 = new JLabel("주문한 메뉴 : " + mname);
		JLabel label4 = new JLabel("주소 : " + addr);
		JLabel label5 = new JLabel("가격 : " + price + "원");
		JLabel label6 = new JLabel("주문한 사람 : " + id);
		JButton button = new JButton("가게 바로가기");
		title.setFont(font1);
		label1.setFont(font2);
		label2.setFont(font3);
		label3.setFont(font3);
		label4.setFont(font3);
		label5.setFont(font3);
		label6.setFont(font3);
		button.setFont(font3);
		button.setBackground(Color.darkGray);
		button.setForeground(Color.white);
		title.setBounds(0, 0, 450, 85);
		label1.setBounds(10, 100, 400, 50);
		label2.setBounds(10, 150, 400, 50);
		label3.setBounds(10, 200, 400, 50);
		label4.setBounds(10, 250, 400, 50);
		label5.setBounds(10, 300, 400, 50);
		label6.setBounds(10, 350, 400, 50);
		button.setBounds(145, 450, 150, 50);

		f.add(title);
		f.add(label1);
		f.add(label2);
		f.add(label3);
		f.add(label4);
		f.add(label5);
		f.add(label6);
		f.add(button);

		f.setVisible(true);
	}

}
