package pro45p48;

import java.util.Scanner;

public class LastDay {

	// 년도와 월을 입력받아 해당 월의 마지막 일자가 몇 일인지 출력
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("년도와 월을 입력하세요 ex) 2019 3");
		int year = in.nextInt();
		int month = in.nextInt();

		// 31일까지 있는 월
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println("31");
		} // 그 외에 월
		else if (month == 2) {
			// 윤년 : 2월이 29일까지 있는 해
			// 년도가 4의 배수이면서 100의 배수가 아니거나, 400의 배수인 경우 윤년이 됨
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.println("29");
			} else {
				System.out.println("28");
			}
		} // 윤년 계산
		else {
			System.out.println("30");
		}

	}
}
