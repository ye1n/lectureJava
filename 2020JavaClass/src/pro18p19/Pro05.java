package pro18p19;

import java.util.Scanner;

public class Pro05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("변환하실 화씨온도를 입력하세요.");
		double fahrenheit = in.nextFloat();
		double celsius = (5*(fahrenheit-32))/9;
		
		System.out.println("입력하신 화씨온도의 섭씨온도는 " + celsius + "입니다.");

	}

}
