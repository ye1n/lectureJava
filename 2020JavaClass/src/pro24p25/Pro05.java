package pro24p25;

import java.util.Scanner;

public class Pro05 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("첫번째 수를 입력해주세요.");
		int num1 = in.nextInt();

		System.out.println("두번째 수를 입력해주세요.");
		int num2 = in.nextInt();

		if (num1 >= num2) {
			System.out.println("큰수 : " + num1 + " 작은수 : " + num2);
		} else {
			System.out.println("큰수 : " + num2 + " 작은수 : " + num1);
		}

	}

}
