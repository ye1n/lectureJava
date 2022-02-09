package pro53p57;

import java.util.Scanner;

public class Rotation {

	// 숫자 로테이션 출력
	// n개의 숫자가 입력되면 n개의 숫자를 한칸씩 우측으로 돌아간 숫자 출력
	// 입력 :
	// 5
	// 1 2 3 4 5
	// 결과 :
	// 1 2 3 4 5
	// 2 3 4 5 1
	// 3 4 5 1 2
	// 4 5 1 2 3
	// 5 1 2 3 4
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("숫자 n을 입력하세요.");
		int n = in.nextInt();

		// 1 2 3 4 5
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[(i + j) % n] + " ");
			}
			System.out.println("");
		}
	}
}
