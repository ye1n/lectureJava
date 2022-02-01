package pro43p44;

public class Odd {

	public static void main(String[] args) {
		oddPrint(15);
		oddPrint(10);
	}

	// 매개변수 x가 홀수일때만 출력
	public static void oddPrint(int x) {
		if (x % 2 != 0) {
			System.out.println(x);
		}

	}

}
