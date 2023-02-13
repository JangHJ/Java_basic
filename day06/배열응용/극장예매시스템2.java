package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 극장예매시스템2 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
		f.setSize(450, 600);
		f.setLayout(flow);
		f.getContentPane().setBackground(Color.lightGray);
		Font font = new Font("굴림", 1, 45);
		Font font2 = new Font("굴림", 1, 25);
		
		JLabel title = new JLabel("극장예매시스템");
		JLabel result = new JLabel("결과내용이 나오는 곳입니다");
		f.add(title);
		
		JButton[] buttons = new JButton[10];
		JButton reset = new JButton("예약초기화");
		reset.setFont(font);
		
		title.setFont(font);
		result.setFont(font2);		
		
		//예약 여부를 저장하는 배열 만들기
		int[] seat = new int[11]; //{0,0,0,0,0,0,0,0,0,0}
		
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < seat.length; i++) {
					seat[i] = 0;
				}
				for (int i = 0; i < buttons.length; i++) {
					buttons[i].setBackground(Color.white);
					buttons[i].setEnabled(true);
				}
				result.setText("예약이 초기화 되었습니다!");
			}
		});
		
		
		
		for (int i = 0; i < buttons.length; i++) {
			if(i == 0)
			{
				//buttons[i].setBackground(Color.white);
				buttons[i] = new JButton("예약확인");
				//버튼 액션
				buttons[i].addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// 클릭했을 때 내용 넣기
						// 배열안에 저장된 값이 1인지 체크해서 카운트
						int count = 0;
						for (int x : seat) {
							if (x == 1) {
								count++;
							} //if
						}//for
						JOptionPane.showMessageDialog(f, (count * 10000) + "원 결제하시면 됩니다.");
						// 영화예매비 1장당 1만원, 결제금액 출력
					}
				});
			}
			else
			{
				buttons[i] = new JButton((i+1) + "");
				//버튼 액션
				buttons[i].addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						result.setForeground(Color.blue);
						String text = e.getActionCommand();
						int no = Integer.parseInt(text);
						if(seat[no] == 1){
							result.setText(text + "번 이미 예약됨. 다른 자리 선택해주세요");	
							result.setForeground(Color.red);
						}
						else {
							seat[no] = 1; //예약 좌석은 1로 변경
							result.setText(text + "번 예약완료!");
							buttons[no-1].setBackground(Color.gray);
							buttons[no-1].setEnabled(false);
						}
						
					}
				});
			}
			buttons[i].setFont(font);
			buttons[i].setBackground(Color.white);
			f.add(buttons[i]);
			
			
			
		}
		f.add(reset);
		f.add(result);
		
		f.setVisible(true);
	}
}
