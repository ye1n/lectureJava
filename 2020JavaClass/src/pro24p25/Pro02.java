package pro24p25;

import java.util.Scanner;

public class Pro02 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("이름을 입력해주세요.");
		String name = in.nextLine();
		
		if (name.length() > 5) {
			System.out.println("너무 깁니다.");
		}else {
			System.out.println(name + "님 안녕하세요.");
		}
	}
}
