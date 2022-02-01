package pro43p44;

public class Facto1 {

	public static void main(String[] args) {
		
		int ten = factorial(10);
		int hund = factorial(15);

		System.out.println("10!은 " + ten);
		System.out.println("15!은 " + hund);
	}

	// 입력된 매개변수 n까지의 팩토리얼 값 출력
	public static int factorial(int n) {
		
		int factoSum = 1;

		// 4 -> 1*2*3*4
		// 2 -> 1*2
		for (int i = 1; i <= n; i++) {
			factoSum = factoSum * i;
		}

		return factoSum;
	}

}
