package pro53p57;

import java.util.Scanner;

public class Alphabet {

	// 영어 문장을 입력받아 문장속 각 알파벳이 나온 횟수를 출력 (단, 알파벳이 하나도 안나온 경우는 출력 X)
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("문장을 입력하세요.");
		String str = in.nextLine();

		char[] alphas = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };
		int[] cnts = new int[alphas.length];

		// alphas[i]번째 알파벳이 나왔다면 cnts[i]번째 에 횟수 추가
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			// 아스키코드에서 영어소문자는
			// 97 = 'a'부터 122 = 'z' 까지
			// 입력한 알파벳의 아스키 코드가 97 ~ 122 사이일경우
			if (c - 'a' >= 0 && c - 'a' < alphas.length) { 
				cnts[c - 'a']++;
			}
		}
		
		// 출력 부분
		for (int i = 0; i < cnts.length; i++) {
			// 알파벳이 하나라도 나왔을 경우 출력
			if (cnts[i] > 0) {
				System.out.println(alphas[i] + " : " + cnts[i] + "개");
			}
		}
	}
}
