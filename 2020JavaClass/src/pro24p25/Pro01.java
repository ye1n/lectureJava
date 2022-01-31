package pro24p25;

import java.util.Scanner;

public class Pro01 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("정수를 입력해주세요.");
		int num = in.nextInt();

		if (num % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}

	}

}