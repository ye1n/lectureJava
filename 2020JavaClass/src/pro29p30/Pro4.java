package pro29p30;

import java.util.Scanner;

public class Pro4 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int num = 0;
		int sum = 0;
		int count = 0;

		// 정수를 입력받다가 0이 입력되면 종료하고 합과 평균 출력
		while (true) {
			System.out.println("정수를 입력해주세요.");
			num = in.nextInt();

			if (num == 0) break;
			
			sum += num;
			count++;
		}
		System.out.println("합 : " + sum + " 평균 : " + sum / count);
	}

}
