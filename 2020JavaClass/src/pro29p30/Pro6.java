package pro29p30;

public class Pro6 {

	public static void main(String[] args) {
		
		// 1 ~ 100 중에서 소수(약수가 1과 자신뿐인 수) 출력
		for (int i = 2; i <= 100; i++) {

			boolean isPrime = true;
			
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				System.out.println(i);
			}
		}
	}
}
