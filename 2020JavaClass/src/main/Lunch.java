package main;

import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Lunch {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("날짜를 입력하세요. ex) 20200101");
		
		String date = in.nextLine();
		String url = "https://y-y.hs.kr/lunch.view?date=" + date;

		try {
			Document doc = Jsoup.connect(url).get(); // url 주소로 접속하여 결과를 받아 doc에 저장
			
			//System.out.println(doc.html()); 웹페이지의 코드를 html형식으로 출력
			
			Element span = doc.selectFirst("#morning .menuName span");
			System.out.println(span.html());
			
		} catch (Exception e) {
			System.out.println("통신 중 오류 발생");
		}
	}
}
