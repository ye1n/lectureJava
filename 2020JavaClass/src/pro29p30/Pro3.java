package pro29p30;

import java.util.Scanner;

public class Pro3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("정수를 입력해주세요.");
		int sum = in.nextInt();
		int result = 0;

		// 1부터 입력받은 수까지의 합을 출력
		for (int i = 1; i <= sum; i++) {
			result += i;
		}
		System.out.println("합 : " + result);
	}

}
