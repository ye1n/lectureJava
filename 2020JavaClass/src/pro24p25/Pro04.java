package pro24p25;

import java.util.Scanner;

public class Pro04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		System.out.println("등수를 입력해주세요.");
		int num = in.nextInt();
	
		if(num == 1){
			System.out.println("아주 잘했어요.");
		}
		else if(num <= 3){
			System.out.println("잘했네요.");
		}
		else if(num <= 6){
			System.out.println("보통입니다.");
		}
		else if(num <= 19){
			System.out.println("노력이 필요합니다.");
		}
		else{
			System.out.println("잘못된 등수입니다.");
		}
	}
}
