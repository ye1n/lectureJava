package pro29p30;

import java.util.Scanner;

public class Pro7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("1부터 30까지의 정수 하나를 입력해주세요.");
		int num = in.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println("*****");
		}

	}

}
