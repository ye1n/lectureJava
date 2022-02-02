package pro45p48;

import java.util.Scanner;

public class Pyramid {

	// 층수 N을 입력받아 입력에 따른 피라미드 출력
	// N = 3일 경우
	//   *   -> 공백 2 별 1
	//  ***  -> 공백 1 별 3
	// ***** -> 공백 0 별 5
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("피라미드 층수를 입력하세요.");
		int n = in.nextInt();

		for (int i = 1; i <= n; i++) {

			// 앞 공백 출력 코드
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			// 별 출력 코드
			for (int j = 1; j < 2 * i; j++) {
				System.out.print("*");
			}

			System.out.println(""); // 다음 줄
		}
		in.close();
	}
}
