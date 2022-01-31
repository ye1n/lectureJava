package pro29p30;

import java.util.Scanner;

public class Pro8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("1부터 30까지의 정수 하나를 입력해주세요.");
		int num = in.nextInt();

		for (int i = 1; i <= num; i++) {
			if (1 <= num && num <= 30) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}else {
				System.out.println("1부터 30까지의 정수를 입력해주세요.");
			}
		}
	}
}
