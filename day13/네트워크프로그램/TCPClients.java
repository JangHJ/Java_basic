package 네트워크프로그램;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClients {

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 500; i++) {
			// 서버와 클라이언트
			// 양쪽에 전화기 역할을 하는 소켓이 있어야함.
			// 클라이언트에서 소켓을 만들어주면, 서버소켓으로 승인요청을 보냄.
			Socket socket = new Socket("localhost", 9100);
			System.out.println("클라이언트 승인요청 보냄!");
		}
		
	}

}
