package pro29p30;

import java.util.Scanner;

public class Pro5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int num = 0;
		int sum = 0;

		// 정수 5개 입력 받고 이 중 양수만을 더한 값 출력
		for (int i = 1; i <= 5; i++) {
			System.out.println("정수를 입력해주세요.");
			num = in.nextInt();

			if (num > 0) sum += num;
		}

		System.out.println("양수만 더한 값 : " + sum);
	}
}
