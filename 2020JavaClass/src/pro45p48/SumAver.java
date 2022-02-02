package pro45p48;

import java.util.Scanner;

public class SumAver {

	// 정수를 입력받다가 0이 되면 입력 종료 후 입력된 값의 평균과 합 출력
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("숫자를 입력하세요. 0 입력시 종료됩니다.");

		int num = 0;
		float sum = 0;
		float aver = 0;
		float count = 0;

		while (num >= 0) {

			count++;
			num = in.nextInt();

			if (num == 0) {
				break;
			}

			sum += num;
			aver = sum / count;
		}

		System.out.println("합계 : " + sum + " 평균 : " + aver);

	}

}