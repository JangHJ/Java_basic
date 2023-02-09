package 제어문문제;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 케이팝인기투표 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		JLabel title = new JLabel();
		JLabel list1 = new JLabel();
		JLabel vote1 = new JLabel();
		JLabel list2 = new JLabel();
		JLabel vote2 = new JLabel();
		JLabel list3 = new JLabel();
		JLabel vote3 = new JLabel();
		ImageIcon icon1 = new ImageIcon("album1.jpg");
		ImageIcon icon2 = new ImageIcon("album2.jpg");
		ImageIcon icon3 = new ImageIcon("album3.jpg");
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		
		Font listfont = new Font("굴림", 1, 20);	
		Font votefont = new Font("굴림", 1, 30);	
		Font titlefont = new Font("굴림", 1, 50);
		
		title.setText("K-pop 인기 투표");
		list1.setText("1. 아이유-라일락");
		list2.setText("2. 프로미스나인-we go");
		list3.setText("3. 스테이씨-ASAP");
		b1.setIcon(icon1);
		b2.setIcon(icon2);
		b3.setIcon(icon3);
		
		title.setFont(titlefont);
		list1.setFont(listfont);
		list2.setFont(listfont);
		list3.setFont(listfont);
		vote1.setFont(votefont);
		vote2.setFont(votefont);
		vote3.setFont(votefont);
		
		f.setSize(600, 900);
		int num1 = 0, num2 = 0, num3 = 0; // num1 : 아이유, num2 : 프로미스나인, num3 : 스테이씨
		int reply = 0; // 입력받은 정수
		while (true){
			String r = JOptionPane.showInputDialog("1)아이유-라일락 2)프로미스나인-wego 3)스테이씨-ASAP 4)종료");
			reply = Integer.parseInt(r);
			
			if(reply == 4) // 4 종료 입력시 투표 끝내기
			{
				//JOptionPane.showMessageDialog(null, "시스템을 종료합니다.");
				System.out.println("시스템을 종료합니다.");
				break;
			}
			
			switch (reply) {
			case 1: // 입력된 값이 1이라면 num1 증가 (투표수 증가)
				num1++;
				break;
			case 2:
				num2++;
				break;
			case 3:
				num3++;
				break;
			default:
				JOptionPane.showMessageDialog(null, "잘못된 입력입니다. 다시 입력해주세요");
				//System.out.println("잘못된 입력입니다. 다시 입력해주세요"); // 1,2,3,4가 아닌 다른 숫자의 경우 다시 입력받도록 함.
				break;
			}
		}
		//루프문 종료 후 결과 출력
		vote1.setText(num1 + "표");
		vote2.setText(num2 + "표");
		vote3.setText(num3 + "표");
		f.add(title);
		f.add(b1);
		f.add(list1);
		f.add(vote1);
		f.add(b2);
		f.add(list2);
		f.add(vote2);
		f.add(b3);
		f.add(list3);
		f.add(vote3);
		f.setVisible(true);
		//sc.close();
	}
}