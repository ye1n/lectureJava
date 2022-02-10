package pro67p72;

import java.util.ArrayList;
import java.util.Scanner;

public class ListInput1 {

	// 사용자로부터 정수 입력받고 0 입력시 입력 종료 후 모두 출력
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		ArrayList<Integer> myList = new ArrayList<Integer>();
		int num = 0;

		while (true) {
			num = in.nextInt();
			if (num == 0) {
				break;
			}
			myList.add(num);
		}

		for (Integer n : myList) {
			System.out.print(n + " ");
		}

		in.close();
	}
}
