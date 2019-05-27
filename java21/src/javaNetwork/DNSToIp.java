package javaNetwork;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class DNSToIp {
	public static void main(String[] args) {
		String dns = "www.naver.com";
		try {
			InetAddress addr = InetAddress.getByName(dns);// 네이버의 도메인/IP주소 가져오기
			System.out.println(addr);
			System.out.println("ip주소 : " + addr.getHostAddress()); // 네이버의 IP주소 가져오기
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println("도메인 네임이 존재하지 않습니다.");
			System.out.println("올바른 도메인을 입력해주세요.");
		}
	}
}