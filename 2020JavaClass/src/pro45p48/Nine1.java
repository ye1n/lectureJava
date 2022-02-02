package pro45p48;

import java.util.Scanner;

public class Nine1 {

	// 구구단 입력한 단 출력
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("출력을 원하는 단수를 입력하세요.");
		int n = in.nextInt();
		
		int result = 0;

		System.out.println(n + "단 출력");

		for (int i = 1; i <= 9; i++) {
			result = n * i;
			System.out.println(n + " X " + i + " = " + result);
		}
	}
}
