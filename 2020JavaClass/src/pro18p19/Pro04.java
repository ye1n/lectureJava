package pro18p19;

import java.util.Scanner;

public class Pro04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("넓이를 구할 원의 반지름을 입력하세요.");
		float radius = in.nextFloat();

		System.out.println("원의 넓이는" + radius * radius * 3.14 + "입니다.");
	}
}
