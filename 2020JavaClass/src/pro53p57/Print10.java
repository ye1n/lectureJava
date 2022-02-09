package pro53p57;

import java.util.Scanner;

public class Print10 {

	// 사용자로부터 10개 정수 입력받아 배열에 저장 후 출력 (단, 중복되어서는 안되며 중복 입력시 다시 입력받아야 한다)
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int[] number = new int[10]; // 길이가 10인 배열 생성

		for (int i = 0; i < number.length; i++) {

			while (true) {
				number[i] = in.nextInt(); // 배열의 i번째에 값 입력받기

				boolean find = false;

				for (int j = 0; j < i; j++) {
					// numbers 배열의 j번째와 i번째가 같으면
					if (number[i] == number[j]) {
						find = true;
					}
				}

				if (!find) {
					break;
				} else {
					System.out.println("중복입니다. 다시 입력하세요.");
				}
			}
		}

		System.out.println("입력된 수는 다음과 같습니다.");

		// 배열 출력
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i] + " ");
		}
	}
}
