package pro43p44;

import java.util.Scanner;

public class Facto2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("숫자를 입력해주세요.");
		int num = in.nextInt();

		int ten = factorial(num);
		System.out.println(num + "!은 " + ten);
	}

	
	// 입력된 숫자까지의 팩토리얼 출력
	public static int factorial(int n) {

		int factoSum = 1;

		for (int i = 2; i <= n; i++) {
			factoSum = factoSum * i;
		}
		return factoSum;
	}

}