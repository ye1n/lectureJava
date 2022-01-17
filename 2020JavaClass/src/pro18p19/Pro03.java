package pro18p19;

import java.util.Scanner;

public class Pro03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		String name = in.next();
		
		System.out.println("나이를 입력하세요.");
		String age = in.next();
		
		System.out.println("당신의 이름은 " + name + "이고 나이는 " + age + "입니다.");
	}

}
