package 네트워크프로그램;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class 메신저B extends JFrame {

	DatagramSocket socket;
	JTextArea list;
	JTextField input;

	public 메신저B() throws Exception {
		socket = new DatagramSocket(5555); // 받는 소켓
		setTitle("메신저 B");
		setSize(350, 500);
		setLayout(new BorderLayout());
		Font font = new Font("맑은 고딕", 1, 15);
		list = new JTextArea();
		list.setFont(font);

		JScrollPane scroll = new JScrollPane(list);
		//scroll.getViewport().setBackground(Color.red);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		//scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		
		JScrollBar verticalBar = scroll.getVerticalScrollBar();
//		verticalBar.setOpaque(false); 투명하게 하기
//		verticalBar.setBackground(new Color(186, 206, 224));
		
		// 스크롤바의 테두리 없애기
		verticalBar.setBorder(BorderFactory.createEmptyBorder());
		// JScrollPane의 테두리 없애기
		scroll.setBorder(BorderFactory.createEmptyBorder());
		scroll.setOpaque(false);
		// 스크롤바에 대한 설정은 생성 후에 해야함
		scroll.setVerticalScrollBar(verticalBar);

		list.setEditable(false); // 편집막기 내용못바꾸게
		list.setBackground(new Color(186, 206, 224)); // 베이비블루색
		list.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // 패딩 값 주기
		
		input = new JTextField();
		input.setFont(font);
		//input.setBorder(null);
		input.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		input.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// textfield에 입력한 문자열 갖고오기
				String s = input.getText();

				// 아래에 UDP용 소켓만들기
				try {
					DatagramSocket socket = new DatagramSocket();

					// UDP용 패킷이 있어야 함. (데이터, 데이터의 크기, ip, port)
					byte[] data = s.getBytes();
					InetAddress ip = InetAddress.getByName("127.0.0.1");
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, 7777);

					// 소켓을 이용해서 패킷을 보낸다
					list.append("나>> " + s + "\n");
					socket.send(packet);
					socket.close(); // 통신끊기
					input.setText("");
				} catch (SocketException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnknownHostException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		add(scroll, BorderLayout.CENTER);
		add(input, BorderLayout.SOUTH);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// 받는 부분을 무한루프로 먼저 실행해야 함.
	// 받는 부분을 무한루프 먼저 실행해야한다.
	public void process() {
		while (true) {
			try {
				// 1. 받는 소켓있어야 한다. (port)
				System.out.println("받을 준비중....");
				// 2. 패킷으로 보냈기 때문에 빈 패킷을 만들어두면,
				// 빈 패킷안에는 빈 byte[]이 있어야 한다.
				byte[] data = new byte[256];
				DatagramPacket packet = new DatagramPacket(data, data.length);

				// 3. 소켓이 받아서 빈 패킷에 넣는다.
				socket.receive(packet);

				// 4. byte[]에 있는 String으로 바꾸어준다.
				list.append("너>>" + new String(data) + "\n");
			} catch (SocketException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws Exception {
		메신저A a = new 메신저A();
		a.process();
	}

}
