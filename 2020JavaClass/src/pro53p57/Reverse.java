package pro53p57;

import java.util.Scanner;

public class Reverse {

	// 몇개의 숫자를 입력받을지 결정하는 n을 입력받고, n개의 정수를 입력받은 후 입력받은 숫자 거꾸로 출력
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("숫자 n을 입력하세요.");
		int n = in.nextInt();

		int[] arr = new int[n];

		// 정수 n개 입력받는 부분
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}

		// 배열 안에 값 거꾸로 출력 부분
		// 길이 n의 배열 마지막 인덱스 번호는 n-1이므로 n-1부터 1감소하면서 배열 인덱스 0까지 출력
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

}
