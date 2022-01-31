package pro24p25;

import java.util.Scanner;

public class Pro03 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("초를 입력해주세요.");
		int time = in.nextInt();

		int hour = time / 3600; // 1시간은 3600초
		int min = time % 3600 / 60; // 1분은 60초
		int sec = time % 60;

		System.out.println(hour + "시간 " + min + "분 " + sec + "초");
	}
}
