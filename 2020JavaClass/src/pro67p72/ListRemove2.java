package pro67p72;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListRemove2 {

	// 사용자로부터 입력받아 해당 문자 삭제하고 사용자가 "종료"를 입력하면 현재 남아있는 값 출력 (단, 없는 값을 삭제하려고 하면 "존재하지 않습니다." 출력)
	// + 출력시 삭제된 리스트도 함께 출력
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// 배열을 리스트로 변경
		String[] arr = { "쯔위", "지효", "사나", "미나", "다현", "채영", "모모", "나연", "정연" };
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));

		// 삭제된 값 담을 remove 리스트
		ArrayList<String> remove = new ArrayList<String>();

		while (true) {
			String str = in.next();
			if (str.equals("종료")) {
				break;

			} else if (list.contains(str)) {
				list.remove(str);
				System.out.println("삭제되었습니다.");
				remove.add(str); // 삭제 후 삭제한 값 remove 리스트에 추가

			} else {
				System.out.println("존재하지 않습니다.");
			}

		}

		System.out.println("리스트 : " + list + " ");
		System.out.println("삭제 리스트 : " + remove + " ");

	}
}