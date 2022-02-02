package pro45p48;

import java.util.Scanner;

public class Pencil {

	// 연필의 개수와 나눠 줄 학생 수를 입력받아 연필을 학생들에게 똑같은 개수로 나누어 줄 때,
	// 학생 당 가질 수 있는 연필의 개수와 나눠 주고 난 후의 나머지 출력
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("연필의 갯수는 ?");
		int pencil = in.nextInt();

		System.out.println("학생의 수는 ?");
		int stu = in.nextInt();

		int q = pencil / stu;
		int r = pencil % stu;

		System.out.println(stu + "명의 학생에게 연필을 " + q + "개씩 나눠주고 " + r + "개 만큼 남습니다.");

	}

}
