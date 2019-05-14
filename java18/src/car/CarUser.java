package car;

import java.util.ArrayList;
import java.util.Scanner;

public class CarUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CarDTO dto = new CarDTO();
		CarDAO dao = new CarDAO();

		String id;
		String name;
		String content;
		int price;
		int res = 0; // executeUpdate가 제대로 수행되었는지 확인
		System.out.println("[1]전체 검색  [2]아이디 검색  [3]등록  [4]아이디 삭제  [5]가격 변경\n종료는 0");
		System.out.print("입력 : ");
		int select = sc.nextInt();

		while (select != 0) {
			switch (select) {
			case 1:	// 전체 검색
				ArrayList<CarDTO> list = dao.selectAll();
				System.out.println("아이디\t이름\t차량\t가격");
				for (int i = 0; i < list.size(); i++) {
					id = list.get(i).getId();
					name = list.get(i).getName();
					content = list.get(i).getContent();
					price = list.get(i).getPrice();
					System.out.println(id + "\t" + name + "\t" + content + "\t" + price);
				}
				break;
			case 2:	// 아이디 검색
				System.out.print("검색하실 아이디 입력 : ");
				id = sc.next();
				dto = dao.selectOne(id);
				name = dto.getName();
				content = dto.getContent();
				price = dto.getPrice();
				System.out.println("아이디\t이름\t차량\t가격");
				System.out.println(id + "\t" + name + "\t" + content + "\t" + price);
				break;
			case 3:	// 등록
				System.out.print("등록하실 아이디 입력 : ");
				dto.setId(sc.next());
				System.out.print("등록하실 이름 입력 : ");
				dto.setName(sc.next());
				System.out.print("등록하실 차량 입력 : ");
				dto.setContent(sc.next());
				System.out.print("등록하실 가격 입력 : ");
				dto.setPrice(sc.nextInt());
				res = dao.insertOne(dto);
				if (res == 0) {
					System.out.println("등록이 수행되지 못했습니다.\n항목별 내용 기입을 다시 확인해주세요.");
				} else {
					System.out.println("등록이 완료되었습니다.");
				}
				break;
			case 4:	// 아이디 삭제
				System.out.print("삭제하실 아이디 입력 : ");
				id = sc.next();
				res = dao.deleteOne(id);
				if (res == 0) {
					System.out.println("삭제가 수행되지 못했습니다.\n아이디를 다시 확인해주세요.");
				} else {
					System.out.println("삭제가 완료되었습니다.");
				}
				break;
			case 5:	// 가격 변경
				System.out.print("가격 변경 대상 아이디 입력 : ");
				id = sc.next();
				System.out.print("변경할 가격을 입력 : ");
				price = sc.nextInt();
				res = dao.updatePrice(id, price);
				if (res == 0) {
					System.out.println("가격 변경이 수행되지 못했습니다.\n아이디를 다시 확인해주세요.");
				} else {
					System.out.println("가격 변경이 완료되었습니다.");
				}
				break;
			default:
			}
			System.out.println();
			System.out.println("[1]전체 검색  [2]아이디 검색  [3]등록  [4]아이디 삭제  [5]가격 변경\n종료는 0");
			System.out.print("입력 : ");
			select = sc.nextInt();
		}
		sc.close();
	}
}
