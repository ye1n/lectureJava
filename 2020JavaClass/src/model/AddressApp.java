package model;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressApp {

	// 과제 1 : 2번을 입력해 사용자 입력을 선택한다면 사용자 정보 입력을 받고 해당 유저가 list 변수가 추가되게 코드를 작성
	// 과제 2 : 1번을 입력해 검색으로 들어가면 이름을 입력받고 해당 검색어가 포함된 모든 사용자를 가져와 출력하는 코드를 작성
	// 과제 3 : 정확하게 한 사람만 삭제되는 사용자 삭제기능을 구현
	// 추가 발전 과제 : 프로그램 종료시 입력했던 내용을 파일에 저장하고, 프로그램 재 실행시 기존에 저장된 내용을 읽어오도록 수정
	public static void main(String[] args) {
		ArrayList<Friend> list = new ArrayList<Friend>();
		Scanner in = new Scanner(System.in);

		int menuNo = 0;
		while (menuNo != 5) {
			System.out.println("*********** <메뉴 검색> **********");
			System.out.println("* 1. 사용자 검색                                       *");
			System.out.println("* 2. 사용자 입력                                       *");
			System.out.println("* 3. 사용자 삭제                                       *");
			System.out.println("* 4. 사용자 출력                                       *");
			System.out.println("* 5. 프로그램 종료                                    *");
			System.out.println("*******************************");
			menuNo = in.nextInt();

			if (menuNo == 1) {
				System.out.println("검색할 사용자의 이름을 입력하세요.");
				String word = in.next();
				for (Friend friend : list) {
					if (friend.getName().contains(word)) {
						System.out.println(friend.getName() + "\t" + friend.getPhone() + "\t" + friend.getNick() + "\t"
								+ friend.getCode() + "\t" + friend.getAge());
					}
				}

			} else if (menuNo == 2) {
				Friend friend = new Friend();
				System.out.println("사용자 이름을 입력하세요.");
				String name = in.next();
				friend.setName(name);
				System.out.println("휴대폰 번호를 입력하세요.");
				String phone = in.next();
				friend.setPhone(phone);
				System.out.println("별명을 입력하세요.");
				String nick = in.next();
				friend.setNick(nick);
				System.out.println("학번을 입력하세요.");
				String code = in.next();
				friend.setCode(code);
				System.out.println("나이를 입력하세요.");
				int age = in.nextInt();
				friend.setAge(age);

				list.add(friend);
				System.out.println("사용자가 추가되었습니다.");

			} else if (menuNo == 3) {
				System.out.println("삭제할 사용자의 이름을 입력하세요.");
				String word = in.next();
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getName().contains(word)) {
						list.remove(i);
						System.out.println("삭제되었습니다");
					}
				}
			} else if (menuNo == 4) {
				for (Friend friend : list) {
					System.out.println(friend.getName() + "\t" + friend.getPhone() + "\t" + friend.getNick() + "\t"
							+ friend.getCode() + "\t" + friend.getAge());
				}
			} else {
				System.out.println("잘못된 메뉴입니다.");
			}
		}

		System.out.println("프로그램이 종료됩니다.");
	}

}
