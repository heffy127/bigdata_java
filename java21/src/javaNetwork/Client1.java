package javaNetwork;

import java.net.Socket;

public class Client1 {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost",9100); // ip는 로컬호스트 port는 9100번
		System.out.println("client 1 : 서버와 연결 성공");
	}
}
