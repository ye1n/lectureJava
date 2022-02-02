package pro45p48;

import java.util.Scanner;

public class Nine2 {

	// 1단부터 입력한 단수까지 한 행에 5단씩 출력되는 구구단 프로그램 작성
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);

		System.out.println("출력할 단수를 입력하세요.");
		int num = in.nextInt();

		// 1단부터 시작, 다음 줄은 1 + 5 = 6단 부터 시작
		for (int i = 1; i <= num; i += 5) {
			// n X 1~9 출력 역할 ( 5단씩 마다 9줄씩 출력 )
			for (int j = 1; j <= 9; j++) {
				// i에서 시작해서 i + 5까지 총 5단 출력
				for (int k = i; k < i + 5; k++) {
					// 단, k는 입력한 num을 넘지 않게
					if (k <= num) {
						System.out.printf(k + " X " + j + " = " + k * j + "\t");					
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
