package pro53p57;

import java.util.Scanner;

public class Braket {

	// 문자열의 i번째 위치를 참조하여 해당 문자열에 있는 여는 괄호, 닫는 괄호의 갯수 맞추기
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("문자열을 입력하세요.");
		String braket = in.nextLine();

		int open = 0; // 여는 괄호 갯수 저장 변수
		int close = 0; // 닫는 괄호 갯수 저장 변수

		for (int i = 0; i < braket.length(); i++) {
			if (braket.charAt(i) == '(') {
				open++;
			} else if (braket.charAt(i) == ')') {
				close++;
			}
		}

		System.out.println(open + ", " + close);
	}

}
