package 제어문문제;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class 회원가입화면 {
	public static void main(String[] args) {
		// 자주 사용하지 않는 부품을 만들어보자.
		//틀!!이 있어서 그 틀을 가지고 찍어서 필요한 부품을 만들어 CPU가 조립!
		//new: 틀을 가지고 찍어낼때 사용
		//new JFrame()는 JFrame이라는 틀을 이용해서 부품을 찍어내라!
		//만든 부품은 모두다 ram에 저장되어야 되어야 한다.
		//f변수 만들어서 부품을 넣어주세요.
		//f에는 JFrame이 저장되어야 함.
		JFrame f = new JFrame();
		f.setSize(400, 600);
		
		//물흐르듯이 순서대로 배치해주는 부품을 램에 복사해서 가져다 놓아야 함.
		//FlowLayout
		FlowLayout flow = new FlowLayout();
		
		//f에 물흐르듯이 배치해주는 부품을 쓰겠다라고 조립(설정)
		f.setLayout(flow);

		JButton b1 = new JButton();
		//JButton b2 = new JButton();
		b1.setText("회원가입 처리");
		
		JLabel text1 = new JLabel(); //글씨
		text1.setText("아이디");
		
		JLabel text2 = new JLabel(); //글씨
		text2.setText("패스워드");
		
		JLabel text3 = new JLabel(); //글씨
		text3.setText("이름 입력");
		
		JLabel text4 = new JLabel(); //글씨
		text4.setText("전화번호");
		
		
		//글자 넣는 곳..
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		JTextField input3 = new JTextField(10);
		JTextField input4 = new JTextField(10);
		
		//import가 안된 경우 Font위에 마우스를 올리면(또는 F2)
		//import Font~~를 클릭!!
		//단축키로는 컨트롤 + 쉬프트 + o
		Font font = new Font("궁서", 1, 30);
		
		text1.setFont(font);
		text2.setFont(font);
		text3.setFont(font);
		text4.setFont(font);
		input1.setFont(font);
		input2.setFont(font);
		input3.setFont(font);
		input4.setFont(font);
		b1.setFont(font);
		
		input1.setBackground(Color.yellow); //배경색
		input1.setForeground(Color.red); //버튼의 위색, 글자색
		input2.setBackground(Color.yellow); //배경색
		input2.setForeground(Color.red); //버튼의 위색, 글자색
		input3.setBackground(Color.yellow); //배경색
		input3.setForeground(Color.red); //버튼의 위색, 글자색
		input4.setBackground(Color.yellow); //배경색
		input4.setForeground(Color.red); //버튼의 위색, 글자색
		
		
		text1.setForeground(Color.blue);
		text2.setForeground(Color.blue);
		text3.setForeground(Color.blue);
		text4.setForeground(Color.blue);
		b1.setBackground(Color.pink); //배경색
		b1.setForeground(Color.blue); //버튼의 위색, 글자색
		
		//no.png 파일명을 쓰면 java02프로젝트 바로 아래 있는 것으로 인식!
		//ImageIcon icon = new ImageIcon("login.png");
		
		//b1.setIcon(icon);
		
		f.add(text1);
		f.add(input1);
		f.add(text2);
		f.add(input2);
		f.add(text3);
		f.add(input3);
		f.add(text4);
		f.add(input4);
		f.add(b1);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//b1 클릭했을 때
				String id = input1.getText();
				String pw = input2.getText();
				String name = input3.getText();
				String tel = input4.getText();
				
				String result = "아이디 : " + id + "\n" + "비밀번호 : " + pw + "\n" + "이름 : " + name + "\n" + "전화번호 : " + tel;
				
				JOptionPane.showMessageDialog(f, result);
			}
		});
		//보여주는 것은 맨 끝으로!!
		f.setVisible(true);
	}
}