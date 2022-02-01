package pro43p44;

import java.util.Scanner;

public class Sequence {
	public static void main(String[] args) {

		// 양의 정수를 입력받아 해당 숫자가 소수인지 아닌지 판별하는 프로그램 작성
		Scanner in = new Scanner(System.in);

		System.out.println("양의 정수를 입력해주세요.");
		int num = in.nextInt();
		
		Boolean isPrime = true;

		if(num <= 1) {
			isPrime = false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println("입력하신 숫자는 소수입니다.");
		}else {
			System.out.println("입력하신 숫자는 소수가 아닙니다.");
		}
	}
}
