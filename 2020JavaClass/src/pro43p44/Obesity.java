package pro43p44;

import java.util.Scanner;

public class Obesity {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("키를 입력해주세요.");
		double height = in.nextDouble();

		System.out.println("몸무게를 입력해주세요.");
		double weight = in.nextDouble();

		double stdWeight = (height - 100) * 0.9;
		double obesity = (weight - stdWeight) * 100 / stdWeight;

		if (obesity <= 10) {
			System.out.println("정상입니다.");
		} else if (obesity <= 20) {
			System.out.println("과체중입니다.");
		} else {
			System.out.println("비만입니다.");
		}

		System.out.println(obesity);
	}
}
