package pro67p72;

import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NewsList {

	// 싫어하는 신문사를 입력받고, 해당 신문사의 기사는 나오지 않도록 한다.
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("싫어하는 신문사를 입력하세요.");
		String news = in.nextLine();

		try {
			String url = "https://news.google.com/rss?hl=ko&gl=KR";
			Document doc = Jsoup.connect(url).get();
			Elements list = doc.select("item");

			for (int i = 0; i < list.size(); i++) {
				Element item = list.get(i);

				String title = item.selectFirst("title").text();

				if (!title.contains(news)) {
					System.out.println(title);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
 
	}
}