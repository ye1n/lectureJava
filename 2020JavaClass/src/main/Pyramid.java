package main;

public class Pyramid {
	public static void main(String[] args) {
		// 4층 피라미드
		printPyramid(4);

		// 7층 피라미드
		printPyramid(7);
	}

	public static void printPyramid(int level) {
		for (int i = 1; i <= level; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
