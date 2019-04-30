package diary;

import java.io.FileWriter;

import javax.swing.JOptionPane;

// 파일에 저장 
// 메소드 사용(호출)
public class UseFile2 {
														// Add throw <- 호출한 메소드에게 떠넘기기
														// try ~ catch <- 직접 예외 처리하기
	public static void main(String[] args) throws Exception {	
		// 객체 생성
		String name = JOptionPane.showInputDialog("이름 입력");
		String tel = JOptionPane.showInputDialog("전화번호 입력");
		String addr = JOptionPane.showInputDialog("주소 입력");
		
		FileWriter w = new FileWriter("start.txt");
		w.write(name + "\n");
		w.write(tel + "\n");
		w.write(addr + "\n");
		
		w.close(); // 자원을 사용한 뒤 반드시 닫아주어야함
	}
}
