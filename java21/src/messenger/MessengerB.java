package messenger;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MessengerB extends JFrame {
	JTextArea list;
	JTextField input;
	DatagramSocket socket;

	public MessengerB() throws Exception {
		socket = new DatagramSocket(7000); // 패킷 받는 소켓
		list = new JTextArea(10, 50);
		list.setTabSize(20);
		list.setBackground(Color.CYAN);
		input = new JTextField();
		input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String str = input.getText();
				list.append("내가 입력>> " + str + "\n");
				input.setText("");

				// 네트워크 통신은 socket이 있어야 함
				DatagramSocket socket;
				try {
					socket = new DatagramSocket();
					// socket으로 packet을 전송한다.
					byte[] data = str.getBytes(); // String을 byte배열로 만듦
					InetAddress ip = InetAddress.getByName("localhost"); // ip 받기

					DatagramPacket packet = new DatagramPacket(data, data.length, ip, 8000);
					socket.send(packet);
					socket.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		input.setFont(new Font("굴림", Font.PLAIN, 14));
		input.setBackground(Color.ORANGE);
		setTitle("MessengerB 화면");
		getContentPane().add(list, BorderLayout.CENTER);
		getContentPane().add(input, BorderLayout.SOUTH);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void process() throws Exception {
		// 무한 루프로 패킷 받는 코드 (한번 받고 끝내지 않음)
		while (true) {
			byte[] data = new byte[256];
			DatagramPacket packet = new DatagramPacket(data, data.length);// 받는 패킷이라 ip랑 port 필요 없음
			socket.receive(packet);
			list.append("네가 입력 >> " + new String(data) + "\n");
		}
	}

	public static void main(String[] args) throws Exception {
		MessengerB a = new MessengerB();
		a.process();// 보내기 전에 받는 코드가 먼저 돌아가야 함
	}
}
