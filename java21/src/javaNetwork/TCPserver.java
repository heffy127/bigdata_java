package javaNetwork;

import java.net.ServerSocket;
import java.net.Socket;

public class TCPserver {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(9100); // 서버 만들기만하는 소켓 (포트번호 9100으로 설정함)
		System.out.println("TCP 서버 소켓 시작됨..");
		System.out.println("클라이언트 연결을 기다리는 중");
		while (true) { // 클라이언트 요청 받도록 서버가 계속 살아있어야함
			Socket socket = server.accept(); // 데이터 전송용 소켓
			System.out.println("클라이언트와 연결 성공");
		}
	}
}
