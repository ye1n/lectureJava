package pro53p57;

import java.util.Scanner;

public class FillArray2 {

	// n이 입력되면 n X n인 행 우선으로 1부터 n²까지 숫자가 채워진 2차원 배열을 출력
	// 4입력
	//  1  2  3  4
	//  5  6  7  8
	//  9 10 11 12
	// 13 14 15 16
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int[][] array = new int[n][n]; // n X n 크기의 2차원 배열 생성

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = j * n + i + 1;
				//ex)[1][0] = 0 * 4 + 1 + 1
			}
		}

		// 배열 출력 부분
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%2d ", array[i][j]);
			}
			System.out.println();
		}
	}
}
