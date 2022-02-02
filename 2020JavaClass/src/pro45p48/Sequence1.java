package pro45p48;

import java.util.Scanner;

public class Sequence1 {

	// N을 입력받아 Sn을 출력 방법_1
	// Sn = (1) + (1*2) + (1*2*3) + (1*2*3*4) + ... + (1*2*...*n)
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("N을 입력하세요.");
		int N = in.nextInt();

		long n = 1;
		long sn = 0;

		for (int i = 1; i <= N; i++) {
			n *= i;
			sn += n;
		}
		System.out.println(sn);
	}
}
