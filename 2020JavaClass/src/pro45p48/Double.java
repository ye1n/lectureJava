package pro45p48;

import java.util.Scanner;

public class Double {

	// 사용자로부터 숫자 5개 입력받아 짝수의 합만 출력
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("숫자 5개를 입력하세요.");

		int result = 0;
		int num = 0;

		for (int count = 1; count <= 5; count++) {
			num = in.nextInt();

			if (num % 2 == 0) {
				result += num;
			}
		}
		System.out.println(result);
	}
}
