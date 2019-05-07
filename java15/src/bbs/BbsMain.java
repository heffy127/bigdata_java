package bbs;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class BbsMain {
	private JTextField textId;
	private JTextField textTitle;
	private JTextField textContent;
	private JTextField textEtc;
	public BbsMain(){
		JFrame f = new JFrame("나의 게시판 만들기");
		f.getContentPane().setBackground(Color.CYAN);
		f.setSize(233,437);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JLabel lblNewLabel = new JLabel("<<아이디>>");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 18));
		f.getContentPane().add(lblNewLabel);
		
		textId = new JTextField();
		textId.setFont(new Font("굴림", Font.PLAIN, 18));
		f.getContentPane().add(textId);
		textId.setColumns(10);
		
		JLabel label = new JLabel("<<타이틀>>");
		label.setForeground(new Color(34, 139, 34));
		label.setFont(new Font("굴림", Font.BOLD, 18));
		f.getContentPane().add(label);
		
		textTitle = new JTextField();
		textTitle.setFont(new Font("굴림", Font.PLAIN, 18));
		textTitle.setColumns(10);
		f.getContentPane().add(textTitle);
		
		JLabel label_1 = new JLabel("<<내용>>");
		label_1.setForeground(new Color(255, 255, 0));
		label_1.setFont(new Font("굴림", Font.BOLD, 18));
		f.getContentPane().add(label_1);
		
		textContent = new JTextField();
		textContent.setFont(new Font("굴림", Font.PLAIN, 18));
		textContent.setColumns(10);
		f.getContentPane().add(textContent);
		
		JLabel label_2 = new JLabel("<<그외>>");
		label_2.setForeground(new Color(148, 0, 211));
		label_2.setFont(new Font("굴림", Font.BOLD, 18));
		f.getContentPane().add(label_2);
		
		textEtc = new JTextField();
		textEtc.setFont(new Font("굴림", Font.PLAIN, 18));
		textEtc.setColumns(10);
		f.getContentPane().add(textEtc);
		
		JButton buttonSearch = new JButton("검색하기");
		buttonSearch.setFont(new Font("굴림", Font.PLAIN, 19));
		buttonSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String inputId = textId.getText();
				BbsDAO dao = new BbsDAO();
				BbsDTO dto = dao.select(inputId);
				String id = dto.getId();
				String title = dto.getTitle();
				String content = dto.getContent();
				String etc = dto.getEtc();
				
				textId.setText(id);
				textTitle.setText(title);
				textContent.setText(content);
				textEtc.setText(etc);
			}
		});
		f.getContentPane().add(buttonSearch);
		
		JButton buttonInsert = new JButton("삽입하기");
		buttonInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BbsDTO dto = new BbsDTO();
				dto.setId(textId.getText());
				dto.setTitle(textTitle.getText());
				dto.setContent(textContent.getText());
				dto.setEtc(textEtc.getText());
				BbsDAO dao = new BbsDAO();
				dao.insert(dto);
				JOptionPane.showMessageDialog(null, "삽입완료");
				
			}
		});
		buttonInsert.setFont(new Font("굴림", Font.PLAIN, 19));
		f.getContentPane().add(buttonInsert);
		
		JButton buttonDelete = new JButton("삭제하기");
		buttonDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BbsDAO dao = new BbsDAO();
				String id = textId.getText();
				dao.delete(id);
				JOptionPane.showMessageDialog(null, "삭제완료");
			}
		});
		buttonDelete.setFont(new Font("굴림", Font.PLAIN, 19));
		f.getContentPane().add(buttonDelete);
		
		JButton buttonUpdate = new JButton("수정하기");
		buttonUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BbsDTO dto = new BbsDTO();
				dto.setId(textId.getText());
				dto.setTitle(textTitle.getText());
				dto.setContent(textContent.getText());
				dto.setEtc(textEtc.getText());
				BbsDAO dao = new BbsDAO();
				dao.update(dto);
				JOptionPane.showMessageDialog(null, "수정완료");
			}
		});
		buttonUpdate.setFont(new Font("굴림", Font.PLAIN, 19));
		f.getContentPane().add(buttonUpdate);
		
		
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		BbsMain name = new BbsMain();
	}
}
