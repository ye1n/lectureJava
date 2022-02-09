package main;

import java.util.Scanner;

public class Input10 {

	// 사용자로부터 10개 정수를 입력받아 배열에 저장후
	// 다시 0 ~ 9 사이의 정수를 입력받아 해당 인덱스의 수가 10개의 숫자 중 몇번째로 큰지 출력
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// 공간 10개를 가진 numbers 배열 생성
		int[] numbers = new int[10];

		// 10개 정수 입력받아 배열에 저장
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = in.nextInt();
		}

		// 다시 0 ~ 9 사이의 정수 입력 받음
		int index = in.nextInt();
		int cnt = 1;
		
		// 해당 인덱스의 수가 10개 숫자 중 몇번째로 큰지 구하는 for문
		// cnt는 1에서 시작해서 더 큰 숫자가 있다면 순위가 뒤로 밀리기 때문에 1증가
		// numbers[index]가 numbers[i]가 작다면 cnt에 1 증가
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[index] < numbers[i]) {
				cnt++;
			}
		}
		System.out.println(index + "은(는) " + cnt + "번째로 큰 수입니다.");
	}
}
