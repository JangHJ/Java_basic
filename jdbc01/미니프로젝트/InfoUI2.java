package 미니프로젝트;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class InfoUI2 {
	public static String id = "bbb";
	public static JLabel label = null;
	public static JPanel[] panel = new JPanel[3];
	// public static JButton button = null;
	public static JButton[] order_btn = new JButton[3];
	public static JButton[] order_btn2 = new JButton[3];
	public static JButton[] review_btn1 = new JButton[3];
	public static JButton[] review_btn2 = new JButton[3];
	public static JButton[] coupon_btn = new JButton[3];
	public static Object[][] all = null;
	public static OrderDAO dao1 = null;
	public static ReviewDAO dao2 = null;
	public static CouponDAO dao3 = null;
	public static int i, j, k, x;
	public static int t;

	public static InfoUI_sub1 s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 160;

		dao1 = new OrderDAO();
		ArrayList<OrderVO> orderlist = dao1.list(id);

		dao2 = new ReviewDAO();
		ArrayList<ReviewVO> reviewlist = dao2.list(id);

		all = new String[orderlist.size()][4];
//		panel.setLayout(new GridLayout(4,1));

		Font font1 = new Font("맑은 고딕", Font.BOLD, 30);
		Font font2 = new Font("맑은 고딕", Font.BOLD, 20);
		Font font3 = new Font("맑은 고딕", 0, 15);

		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(466, 700);
		f.setTitle("나의 정보");
		f.setFont(font3);
		f.getContentPane().setBackground(new Color(240, 240, 240));
		f.setLayout(null);

		Color color1 = new Color(230, 126, 34);
		Color color2 = new Color(241, 196, 15);

		JLabel title = new JLabel("나의정보");
		JLabel l1 = new JLabel("가게이름");
		JLabel l2 = new JLabel("주문한시간");
		JLabel l3 = new JLabel("메뉴이름");
		JLabel l4 = new JLabel("가격");
		JButton bb1 = new JButton("주문 내역 상세보기");

		if (orderlist.size() == 0) {
			System.out.println("검색결과없음.");
		} else {
			System.out.println("검색결과는 총 " + orderlist.size() + "개 입니다.");

			for (i = 0; i < orderlist.size(); i++) { // 13개의 가방,13개의 행
				panel[i] = new JPanel();
				panel[i].setBackground(Color.white);
				panel[i].setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
				panel[i].setLayout(new GridLayout(5, 1));
				if (i == 0)
					panel[i].setBounds(5, 140, 440, 150);
				else {
					panel[i].setBounds(5, 140 + (cnt * i), 440, 150);
				}
				label = new JLabel(orderlist.get(i).getSname());
				label.setFont(font2);
				panel[i].add(label);
				label = new JLabel(orderlist.get(i).getMname());
				label.setFont(font3);
				panel[i].add(label);
				label = new JLabel("주문번호 : " + orderlist.get(i).getOrder_no() + "번");
				label.setFont(font3);
				panel[i].add(label);
				label = new JLabel(orderlist.get(i).getPrice() + "원");
				label.setFont(font3);
				panel[i].add(label);
				order_btn[i] = new JButton("주문내역 상세보기");
				order_btn[i].setFont(font3);
				order_btn[i].setBackground(Color.DARK_GRAY);
				order_btn[i].setForeground(Color.white);
				panel[i].add(order_btn[i]);

				f.add(panel[i]);
			}
			
			for(t=0; t<order_btn.length; t++)
			{
				if(order_btn[t] != null)
				{
					order_btn[t].addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							InfoUI_sub1 s = new InfoUI_sub1();
							s.open2(id, t);
						}
					});
				}
			}
//			if(order_btn[0] != null)
//			{
//				order_btn[0].addActionListener(new ActionListener() {
//					@Override
//					public void actionPerformed(ActionEvent e) {
//						System.out.println("리뷰를 수정함.");
//						//dao2 = new ReviewDAO();
//						
//						int no = orderlist.get(0).getOrder_no();
//						String sname = orderlist.get(0).getSname();
//						String mname = orderlist.get(0).getMname();
//						String addr = orderlist.get(0).getAddr();
//						int price = orderlist.get(0).getPrice();
//						
//						InfoUI_sub1 s = new InfoUI_sub1();
//						s.open(no, sname, mname, addr, price, id);
//						System.out.println("@@@===================");
//						System.out.println("@@@0번째 정보 확인");
//						f.revalidate();
//						f.repaint();
//					}
//				});
//			}
//			if(order_btn[1] != null)
//			{
//				order_btn[1].addActionListener(new ActionListener() {
//					@Override
//					public void actionPerformed(ActionEvent e) {
//						System.out.println("리뷰를 수정함.");
//						//dao2 = new ReviewDAO();
//
//						int no = orderlist.get(1).getOrder_no();
//						String sname = orderlist.get(1).getSname();
//						String mname = orderlist.get(1).getMname();
//						String addr = orderlist.get(1).getAddr();
//						int price = orderlist.get(1).getPrice();
//						
//						InfoUI_sub1 s = new InfoUI_sub1();
//						s.open(no, sname, mname, addr, price, id);
//						
//						System.out.println("1번째 정보 확인");
//						f.revalidate();
//						f.repaint();
//					}
//				});
//			}
//			if(order_btn[2] != null)
//			{
//				order_btn[2].addActionListener(new ActionListener() {
//					@Override
//					public void actionPerformed(ActionEvent e) {
//						System.out.println("리뷰를 수정함.");
//						//dao2 = new ReviewDAO();
//						
//						int no = orderlist.get(2).getOrder_no();
//						String sname = orderlist.get(2).getSname();
//						String mname = orderlist.get(2).getMname();
//						String addr = orderlist.get(2).getAddr();
//						int price = orderlist.get(2).getPrice();
//						
//						InfoUI_sub1 s = new InfoUI_sub1();
//						s.open(no, sname, mname, addr, price, id);
//						
//						System.out.println("2번째 정보 확인");
//						f.revalidate();
//						f.repaint();
//					}
//				});
//			}
			
		}

		bb1.setBackground(Color.DARK_GRAY);
		bb1.setForeground(Color.white);

		l1.setFont(font2);

		JButton b1 = new JButton("주문내역");
		JButton b2 = new JButton("리뷰내역");
		JButton b3 = new JButton("쿠폰함");
		b1.setEnabled(false);

		JTextArea area = new JTextArea();

		area.setEditable(false); // 실행시 JtextArea edit 금지 (글을 쓸 수 없음) true면 가능
		area.setBackground(Color.DARK_GRAY);

		title.setOpaque(true); // JLabel 배경색 넣으려면 true 해놔야함.
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setBackground(color1);

		title.setFont(font1);

		bb1.setText("주문상세보기");
		bb1.setBackground(Color.DARK_GRAY);

		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dao1 = new OrderDAO();
				ArrayList<OrderVO> orderlist = dao1.list(id);

				b1.setEnabled(false);
				b2.setEnabled(true);
				b3.setEnabled(true);
				// TODO Auto-generated method stub
				b1.setBackground(color2);
				b2.setBackground(Color.white);
				b3.setBackground(Color.white);
				
				f.getContentPane().removeAll();
				f.add(title);
				f.add(b1);
				f.add(b2);
				f.add(b3);
				
				if (orderlist.size() == 0) {
					System.out.println("검색결과없음.");
//					f.getContentPane().remove(panel[i]);
				} else {
					int no[] = new int[orderlist.size()];
					System.out.println("검색결과는 총 " + orderlist.size() + "개 입니다.");

					for (j = 0; j < orderlist.size(); j++) { // 13개의 가방,13개의 행
						panel[j] = new JPanel();
						panel[j].setBackground(Color.white);
						panel[j].setBorder(new LineBorder(Color.darkGray, 1, true));
						panel[j].setLayout(new GridLayout(5, 1));
						if (j == 0)
							panel[j].setBounds(5, 140, 440, 150);
						else {
							panel[j].setBounds(5, 140 + (160 * j), 440, 150);
						}
						label = new JLabel(orderlist.get(j).getSname());
						label.setFont(font2);
						panel[j].add(label);
						label = new JLabel(orderlist.get(j).getMname());
						label.setFont(font3);
						panel[j].add(label);
						label = new JLabel("주문번호 : " + orderlist.get(j).getOrder_no() + "번");
						no[j] = orderlist.get(j).getOrder_no();
						label.setFont(font3);
						panel[j].add(label);
						label = new JLabel(orderlist.get(j).getPrice() + "원");
						label.setFont(font3);
						// string = label.getText().replaceAll("[^0-9]", "");
						panel[j].add(label);
						order_btn2[j] = new JButton("주문내역 상세보기");
						order_btn2[j].setBorderPainted(false);
						order_btn2[j].setBackground(Color.DARK_GRAY);
						order_btn2[j].setForeground(Color.white);
						order_btn2[j].setFont(font3);

						panel[j].add(order_btn2[j]);
						f.add(panel[j]);
//						order_btn[j].addActionListener(new ActionListener() {
//							@Override
//							public void actionPerformed(ActionEvent e) {
//								// TODO Auto-generated method stub
//								System.out.println("주문번호 : " + Integer.parseInt(string));
//							}
//						});
					}
					if(order_btn2[0] != null)
					{
						order_btn2[0].addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								System.out.println("주문상세정보를 확인함");
								//dao2 = new ReviewDAO();

								int no = orderlist.get(0).getOrder_no();
								String sname = orderlist.get(0).getSname();
								String mname = orderlist.get(0).getMname();
								String addr = orderlist.get(0).getAddr();
								int price = orderlist.get(0).getPrice();
								
								InfoUI_sub1 s = new InfoUI_sub1();
								s.open(no, sname, mname, addr, price, id);
								System.out.println("1번===================");	
								System.out.println("0번째 정보 확인");
								f.revalidate();
								f.repaint();
							}
						});
					}
					if(order_btn2[1] != null)
					{
						order_btn2[1].addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								System.out.println("주문상세정보를 확인함");
								//dao2 = new ReviewDAO();

								int no = orderlist.get(1).getOrder_no();
								String sname = orderlist.get(1).getSname();
								String mname = orderlist.get(1).getMname();
								String addr = orderlist.get(1).getAddr();
								int price = orderlist.get(1).getPrice();
								
								InfoUI_sub1 s = new InfoUI_sub1();
								s.open(no, sname, mname, addr, price, id);
								
								System.out.println("1번째 정보 확인");
								f.revalidate();
								f.repaint();
							}
						});
					}
					if(order_btn2[2] != null)
					{
						order_btn2[2].addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								System.out.println("리뷰를 수정함.");
								//dao2 = new ReviewDAO();
								
								int no = orderlist.get(2).getOrder_no();
								String sname = orderlist.get(2).getSname();
								String mname = orderlist.get(2).getMname();
								String addr = orderlist.get(2).getAddr();
								int price = orderlist.get(2).getPrice();
								
								InfoUI_sub1 s = new InfoUI_sub1();
								s.open(no, sname, mname, addr, price, id);
								
								System.out.println("2번째 정보 확인");
								f.revalidate();
								f.repaint();
							}
						});
					}
				}
				
				
				f.revalidate();
				f.repaint();
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dao2 = new ReviewDAO();
				ArrayList<ReviewVO> reviewlist = dao2.list(id);

				b1.setEnabled(true);
				b2.setEnabled(false);
				b3.setEnabled(true);
				// TODO Auto-generated method stub
				b1.setBackground(Color.white);
				b2.setBackground(color2);
				b3.setBackground(Color.white);

				f.getContentPane().removeAll();
				f.add(title);
				f.add(b1);
				f.add(b2);
				f.add(b3);
				
				if (orderlist.size() == 0) {
					System.out.println("검색결과없음.");
//					f.getContentPane().remove(panel[i]);
				} else {
					System.out.println("검색결과는 총 " + reviewlist.size() + "개 입니다.");

					for (k = 0; k < reviewlist.size(); k++) { // 13개의 가방,13개의 행
						panel[k] = new JPanel();
						panel[k].setBackground(Color.white);
						panel[k].setBorder(new LineBorder(Color.darkGray, 1, true));
						panel[k].setLayout(new GridLayout(0, 1));
						if (k == 0)
							panel[k].setBounds(5, 140, 440, 160);
						else {
							panel[k].setBounds(5, 140 + (170 * k), 440, 160);
						}
						label = new JLabel(reviewlist.get(k).getSname());
						label.setFont(font2);
						panel[k].add(label);
						label = new JLabel("별점 : " + reviewlist.get(k).getRating() + "점");
						label.setFont(font3);
						panel[k].add(label);
						label = new JLabel(reviewlist.get(k).getMname());
						label.setFont(font3);
						panel[k].add(label);
						label = new JLabel(reviewlist.get(k).getContent());
						label.setFont(font3);
						panel[k].add(label);
						JPanel test = new JPanel();
						test.setLayout(new FlowLayout());
						test.setSize(440, 50);
						// test.setBorder(BorderFactory.createEmptyBorder(0 , 0, 0 , 0));
						test.setBackground(Color.white);
						review_btn1[k] = new JButton("리뷰수정");
						review_btn1[k].setBorderPainted(false);
						review_btn1[k].setBackground(new Color(26, 188, 156));
						review_btn1[k].setForeground(Color.white);
						review_btn1[k].setFont(font3);
						review_btn1[k].setPreferredSize(new Dimension(210, 30));
						review_btn1[k].setMargin(new Insets(0, 0, 0, 0)); // Set margin to zero
						test.add(review_btn1[k]);
						// panel[k].add(button);
						review_btn2[k] = new JButton("리뷰삭제");
						review_btn2[k].setBorderPainted(false);
						review_btn2[k].setBackground(new Color(231, 76, 60));
						review_btn2[k].setForeground(Color.white);
						review_btn2[k].setFont(font3);
						review_btn2[k].setPreferredSize(new Dimension(210, 30));
						review_btn2[k].setMargin(new Insets(0, 0, 0, 0)); // Set margin to zero
						test.add(review_btn2[k]);

						// panel[k].add(button);
						panel[k].add(test);
						f.add(panel[k]);
					}
					//리뷰 수정 버튼 이벤트
					if(review_btn1[0] != null)
					{
						review_btn1[0].addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								System.out.println("리뷰를 수정함.");
								//dao2 = new ReviewDAO();

								String content = reviewlist.get(0).getContent();
								int no = reviewlist.get(0).getOrder_no();
								InfoUI_sub2 s = new InfoUI_sub2();
								s.open(no, content);
								
								System.out.println("0번째 목록 수정");
								f.revalidate();
								f.repaint();
							}
						});
					}
					if(review_btn1[1] != null)
					{
						review_btn1[1].addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								System.out.println("리뷰를 수정함.");
								//dao2 = new ReviewDAO();

								String content = reviewlist.get(1).getContent();
								int no = reviewlist.get(1).getOrder_no();
								InfoUI_sub2 s = new InfoUI_sub2();
								s.open(no, content);
								
								System.out.println("1번째 목록 수정");
								f.revalidate();
								f.repaint();
							}
						});
					}
					if(review_btn1[2] != null)
					{
						review_btn1[2].addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								System.out.println("리뷰를 수정함.");
								//dao2 = new ReviewDAO();

								String content = reviewlist.get(2).getContent();
								int no = reviewlist.get(2).getOrder_no();
								InfoUI_sub2 s = new InfoUI_sub2();
								s.open(no, content);
								
								System.out.println("2번째 목록 수정");
								f.revalidate();
								f.repaint();
							}
						});
					}
					//리뷰 삭제 버튼 이벤트
					if(review_btn2[0] != null)
					{
						review_btn2[0].addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								ReviewDAO dao = new ReviewDAO();
								ReviewVO bag = new ReviewVO();
								dao.delete(bag.getOrder_no());
								int result = JOptionPane.showConfirmDialog(f, "리뷰를 삭제하시겠습니까?");
								if (result == JOptionPane.YES_OPTION) {
									System.out.println("리뷰를 삭제함.");
									dao2 = new ReviewDAO();

									dao2.delete(reviewlist.get(0).getOrder_no());
									System.out.println("0번째 목록 삭제");
								} else {
									System.out.println("리뷰삭제를 그만둠");
								}
								f.revalidate();
								f.repaint();
							}
						});
					}
					if(review_btn2[1] != null)
					{
						review_btn2[1].addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								ReviewDAO dao = new ReviewDAO();
								ReviewVO bag = new ReviewVO();
								dao.delete(bag.getOrder_no());
								int result = JOptionPane.showConfirmDialog(f, "리뷰를 삭제하시겠습니까?");
								if (result == JOptionPane.YES_OPTION) {
									System.out.println("리뷰를 삭제함.");
									dao2 = new ReviewDAO();

									dao2.delete(reviewlist.get(1).getOrder_no());
									System.out.println("1번째 목록 삭제");
								} 
								else {
									System.out.println("리뷰삭제를 그만둠");
								}
								f.revalidate();
								f.repaint();
							}
						});
					}
					if(review_btn2[2] != null)
					{
						review_btn2[2].addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								ReviewDAO dao = new ReviewDAO();
								ReviewVO bag = new ReviewVO();
								dao.delete(bag.getOrder_no());
								int result = JOptionPane.showConfirmDialog(f, "리뷰를 삭제하시겠습니까?");
								if (result == JOptionPane.YES_OPTION) {
									System.out.println("리뷰를 삭제함.");
									dao2 = new ReviewDAO();

									dao2.delete(reviewlist.get(2).getOrder_no());
									System.out.println("2번째 목록 삭제");
								} 
								else {
									System.out.println("리뷰삭제를 그만둠");
								}
								f.revalidate();
								f.repaint();
							}
						});
					}
				}
				f.revalidate();
				f.repaint();
			}
		});

		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dao3 = new CouponDAO();
				ArrayList<CouponVO> couponlist = dao3.list(id);

				b1.setEnabled(true);
				b2.setEnabled(true);
				b3.setEnabled(false);
				// TODO Auto-generated method stub
				b1.setBackground(Color.white);
				b2.setBackground(Color.white);
				b3.setBackground(color2);
				
				f.getContentPane().removeAll();

				f.add(title);
				f.add(b1);
				f.add(b2);
				f.add(b3);
				if (couponlist.size() == 0) {
					System.out.println("검색결과없음.");
//					f.getContentPane().remove(panel[i]);
				} else {
					System.out.println("검색결과는 총 " + couponlist.size() + "개 입니다.");
					
					for (x = 0; x < couponlist.size(); x++) { // 13개의 가방,13개의 행
						panel[x] = new JPanel();
						panel[x].setBackground(Color.white);
						panel[x].setBorder(new LineBorder(Color.darkGray, 1, true));
						panel[x].setLayout(new GridLayout(5, 1));
						if (x == 0)
							panel[x].setBounds(5, 140, 440, 150);
						else {
							panel[x].setBounds(5, 140 + (cnt * x), 440, 150);
						}
						label = new JLabel(couponlist.get(x).getPrice() + "원 쿠폰");
						label.setFont(font2);
						panel[x].add(label);
						label = new JLabel(couponlist.get(x).getStore_name());
						label.setFont(font3);
						panel[x].add(label);
						label = new JLabel(couponlist.get(x).getMin_order() + "원 이상 구매시 사용가능");
						label.setFont(font3);
						panel[x].add(label);
						label = new JLabel(couponlist.get(x).getUse_date() + "까지 사용가능");
						label.setFont(font3);
						panel[x].add(label);
						coupon_btn[x] = new JButton("가게 바로가기");
						coupon_btn[x].setFont(font3);
						coupon_btn[x].setBackground(Color.DARK_GRAY);
						coupon_btn[x].setForeground(Color.white);
						panel[x].add(coupon_btn[x]);
						f.add(panel[x]);
					}
				}
				f.revalidate();
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
		// p.setBounds(5, 140, 440, 150);

		b1.setFont(font3);
		b2.setFont(font3);
		b3.setFont(font3);

//		bb1.setFont(font3);
//		bb2.setFont(font3);
		l1.setFont(font3);
		l2.setFont(font3);
		l3.setFont(font3);
		l4.setFont(font3);

		f.add(title);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		f.setVisible(true);

		b1.doClick();
	}
}
