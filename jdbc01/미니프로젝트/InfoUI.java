package 미니프로젝트;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.attribute.standard.PagesPerMinute;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class InfoUI {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Font font1 = new Font("맑은 고딕", Font.BOLD, 30);
		Font font2 = new Font("맑은 고딕", Font.BOLD, 20);
		Font font3 = new Font("맑은 고딕", 0, 15);
		
		JFrame f = new JFrame();
		f.setSize(466, 600);
		f.setTitle("나의 정보");
		f.setFont(font3);
		f.getContentPane().setBackground(new Color(240,240,240));
		f.setLayout(null);

		Color color1 = new Color(230, 126, 34);
		Color color2 = new Color(241, 196, 15);
		
		JLabel title = new JLabel("나의정보");
		JLabel l1 = new JLabel("가게이름");
		JLabel l2 = new JLabel("주문한시간");
		JLabel l3 = new JLabel("메뉴이름");
		JLabel l4 = new JLabel("가격");
		JButton bb1 = new JButton("주문 내역 상세보기");
		bb1.setBackground(Color.DARK_GRAY);
		bb1.setForeground(Color.white);
		l1.setFont(font2);
		
		JPanel p = new JPanel();
		p.setBackground(Color.white);
		p.setBorder(new LineBorder(Color.black, 1, true));
		p.setLayout(new GridLayout(5,1));
		JLabel ll1 = new JLabel("가게이름");
		JLabel ll2 = new JLabel("주문한 시간");
		JLabel ll3 = new JLabel("메뉴이름");
		JLabel ll4 = new JLabel("가격");
		ll1.setFont(font2);
		ll2.setFont(font3);
		ll3.setFont(font3);
		ll4.setFont(font3);
		p.add(ll1);
		p.add(ll2);
		p.add(ll3);
		p.add(ll4);
		p.add(bb1);
		JButton b1 = new JButton("주문내역");
		JButton b2 = new JButton("리뷰내역");
		JButton b3 = new JButton("쿠폰함");
		b1.setEnabled(false);
		
		JTextArea area = new JTextArea();
		
		area.setEditable(false); //실행시 JtextArea edit 금지 (글을 쓸 수 없음) true면 가능
		area.setBackground(Color.DARK_GRAY);
		//LineBorder border = new LineBorder(Color.black, 1, true);
		title.setOpaque(true); // JLabel 배경색 넣으려면 true 해놔야함.
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setBackground(color1);
		//title.setBorder(border);
		title.setFont(font1);

		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b1.setEnabled(false);
				b2.setEnabled(true);
				b3.setEnabled(true);
				// TODO Auto-generated method stub
				b1.setBackground(color2);
				b2.setBackground(Color.white);
				b3.setBackground(Color.white);
				
				OrderDAO dao = new OrderDAO();
				OrderVO result = dao.one("aaa");
				ll1.setText(result.getSname());
				ll2.setText(result.getTime().toString());
				ll3.setText(result.getMname());
				ll4.setText(result.getPrice() + "원");
				
				f.repaint();
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b1.setEnabled(true);
				b2.setEnabled(false);
				b3.setEnabled(true);
				// TODO Auto-generated method stub
				b1.setBackground(Color.white);
				b2.setBackground(color2);
				b3.setBackground(Color.white);
				
				ReviewDAO dao = new ReviewDAO();
				ReviewVO result = dao.one(1);
				ll1.setText(result.getSname());
				ll2.setText("평점 : " + result.getRating() + "점");
				ll3.setText(result.getMname());
				ll4.setText(result.getContent());
				bb1.setText("리뷰 수정");
				f.repaint();
			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				b1.setEnabled(true);
				b2.setEnabled(true);
				b3.setEnabled(false);
				// TODO Auto-generated method stub
				b1.setBackground(Color.white);
				b2.setBackground(Color.white);
				b3.setBackground(color2);
				
				ll1.setText("5000원 쿠폰");
				ll2.setText("사용가능한 가게");
				ll3.setText("최소주문금액");
				ll4.setText("사용기간");
				bb1.setText("가게 바로가기");
				
				f.repaint();
			}
		});
		b1.setBorderPainted(false);
		b2.setBorderPainted(false);
		b3.setBorderPainted(false);
		b1.setSize(150, 50);
		b2.setSize(150, 50);
		b3.setSize(150, 50);
		b1.setBackground(color2);
		b2.setBackground(Color.white);
		b3.setBackground(Color.white);
		title.setBounds(0, 0, 450, 85);
		b1.setBounds(0, 85, 150, 50);
		b2.setBounds(150, 85, 150, 50);
		b3.setBounds(300, 85, 150, 50);
		p.setBounds(5, 140, 440, 150);
		b1.setFont(font3);
		b2.setFont(font3);
		b3.setFont(font3);
		bb1.setFont(font3);
		l1.setFont(font3);
		l2.setFont(font3);
		l3.setFont(font3);
		l4.setFont(font3);		
		
		f.add(title);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(p);

		f.setVisible(true);
	}
}
