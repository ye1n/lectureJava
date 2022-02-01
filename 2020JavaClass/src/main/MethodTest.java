package main;

public class MethodTest {

	public static void main(String[] args) {
	
		echo("안녕하세요.", 2);

	}
	
	public static void echo(String msg , int cnt) {
		
		// msg를 cnt번 반복 출력
		for(int i = 0 ; i < cnt ; i ++) {
			System.out.println(msg);
		}

	}

}
