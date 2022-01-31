package pro29p30;

public class Pro2 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		// 2의 배수는 더하고 3의 배수는 빼고 결과를 출력
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
			if (i % 3 == 0) {
				sum -= i;
			}
		}
		System.out.println("결과 : " + sum);
	}
}
