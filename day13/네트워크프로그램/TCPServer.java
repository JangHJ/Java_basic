package 네트워크프로그램;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		//1. 승인용 소켓을 만들어주자
		//2. 서버는 계속 살아있게 하기 위해서 무한루프를 돌린다.
		//3. 요청이 있으면 승인을 해주고, 통신할 수 있는 소켓 만들어주기
		int count = 0;
		ServerSocket server = new ServerSocket(9100); //port
		System.out.println("승인용 서버 소켓이 시작됨.");
		System.out.println("클라이언트 연결을 기다리는 중");
		while(true) {
			Socket socket = server.accept();	//socket
			count++;
			System.out.println("연결된 클라이언트 수: " + count);
			System.out.println("클라이언트와 연결 성공!");
//			System.out.println("서버가 " + count + "개의 클라이언트 요청을 승인함.");
//			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
//			String date = String.valueOf(new Date());
//			out.print(date);
//			out.close();
//			socket.close();
			
		}
		
	}

}
