package pro29p30;

public class Pro1 {

	public static void main(String[] args) {

		// 2의 배수이면서 3의 배수는 아닌 수 출력
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 && i % 3 != 0) {
				System.out.println(i);
			}
		}
	}
}
