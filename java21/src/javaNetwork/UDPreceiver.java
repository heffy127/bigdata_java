package javaNetwork;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPreceiver {
	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket(7000);
		System.out.println("받는 쪽 소켓 시작");
		System.out.println("받을 준비 끝..");
		byte[] data = new byte[256];
		DatagramPacket packet = new DatagramPacket(data, data.length);// 받는 패킷이라 ip랑 port 필요 없음
		socket.receive(packet);
		System.out.println(new String(data));
		socket.close();
	}
}
