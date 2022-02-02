package pro45p48;

import java.util.Scanner;

public class MaxValue {

	// 양의 정수 입력받다가 음의 정수 입력되면 입력종료, 입력받은 숫자중 가장 큰 숫자 출력
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("양의 정수를 입력해주세요.");
		int max = 0; // 최대값 저장 변수

		while (true) {
			int num = in.nextInt();

			// 입력한 숫자가 max보다 클 경우 입력한 숫자를 max에 저장
			if (num > max) {
				max = num;
			}
			if (num < 0) {
				break;
			}
		}
		System.out.println("입력하신 숫자 중 가장 큰 숫자는  " + max + " 입니다.");
	}
}
