package pro45p48;

import java.util.Scanner;

public class Time {

	// 초 단위 정수 입력받고 시간, 분, 초 출력
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("초를 입력해주세요.");
		int time = in.nextInt();

		int hour = time / 3600;
		int min = time % 3600 / 60;
		int sec = time % 60;

		System.out.println(hour + "시 " + min + "분 " + sec + "초");
	}
}
