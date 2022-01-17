package pro18p19;

import java.util.Scanner;

public class SumOfTwo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("첫번째 수를 입력하세요.");
		int first = in.nextInt();
		
		System.out.println("두번째 수를 입력하세요.");
		int second = in.nextInt();
		
		System.out.println("두 수의 합은 : " + (first + second));
	}

}
