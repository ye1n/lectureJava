package pro67p72;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ListInput2 {

	// 사용자로부터 정수 입력받고 0 입력시 입력 종료 후 모두 출력 (단, 오른차순 정렬 출력)
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

		// 오름차순 정렬
		for (int i = 0; i < myList.size(); i++) {
			for (int j = i + 1; j < myList.size(); j++) {
				if(myList.get(i) > myList.get(j)) {
					int result = myList.get(i);
					myList.set(i, myList.get(j));
					myList.set(j, result);
				}
			}
		}

		// 다른방법 :
		// Collections.sort(myList);

		for (Integer n : myList) {
			System.out.print(n + " ");
		}

		in.close();
	}
}
