package pro24p25;

import java.util.Scanner;

public class Pro08 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("숫자를 입력해주세요.");
		double num = in.nextDouble();

		if (num % 1 == 0) {
			System.out.println("정수입니다.");
		} else {
			System.out.println("실수입니다.");
		}

	}
}