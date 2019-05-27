package javaNetwork;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;

import javax.xml.ws.handler.MessageContext.Scope;

public class UDPsender {
	public static void main(String[] args) throws Exception {
		// 네트워크 통신은 socket이 있어야 함
		DatagramSocket socket = new DatagramSocket(); // UDP용 소켓
													  // 보내는 용 socket은  port, ip 지정 필요 없음
		// socket으로 packet을 전송한다.
		String str = "I am a java programmer";
		byte[] data = str.getBytes();	// String을 byte배열로 만듦
		InetAddress ip = InetAddress.getByName("127.0.0.1");	// ip 받기
		
		//					  new DatagramPacket(데이터, 데이터 길이, ip, port);
		DatagramPacket packet = new DatagramPacket(data, data.length, ip, 7000);
		socket.send(packet);
		socket.close();
		
	}
}
