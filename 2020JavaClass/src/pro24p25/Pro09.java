package pro24p25;

import java.util.Scanner;

public class Pro09 {

	public static void main(String[] args) {

		// 3자리인 경우 숫자 뒤집어서 출력
		// 2자리인 경우 각 자리의 합 출력
		Scanner in = new Scanner(System.in);
		System.out.print("2자리 또는 3자리 수의 정수를 입력해주세요.");
		int num = in.nextInt();

		// 각 자리 수 자르기 321
		int n1 = num / 100;
		int n2 = num % 100 / 10;
		int n3 = num % 10;

		if (Integer.toString(num).length() == 3) {
			System.out.println("세자리 수를 입력하셨습니다.");
			System.out.println(n3 + "" + n2 + n1);
		} else if (Integer.toString(num).length() == 2) {
			System.out.println("두자리 수를 입력하셨습니다.");
			System.out.println(n2 + n3);
		} else {
			System.out.println("2자리 수도 3자리 수도 아닙니다.");
		}
	}
}