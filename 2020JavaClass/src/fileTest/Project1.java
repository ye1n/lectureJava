package fileTest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Project1 {

	// 1. 링크와 타이틀 가져와서 2개의 ArrayList에 저장
	// 2. 2개의 ArrayList 사용해서 HTML문서 만들기
	// 3. NewsItem 클래스 활용하여 NewsFlash 클래스 수정
	public static void main(String[] args) {
//		ArrayList<String> titles = new ArrayList<String>();
//		ArrayList<String> links = new ArrayList<String>();
		ArrayList<NewsItem> newsItemList = new ArrayList<NewsItem>();

		try {

			Document doc = Jsoup.connect("http://fs.jtbc.joins.com//RSS/newsflash.xml").get();
			Elements items = doc.select("item");

			for (int i = 0; i < items.size(); i++) {
				NewsItem item = new NewsItem();
				item.setData(items.get(i));
				
				newsItemList.add(item); // 리스트에 뉴스 아이템을 넣어줌
				
//				String title = item.select("title").first().text();
//				titles.add(title); // title만 가져와서 저장

//				String link = item.select("link").first().text();
//				links.add(link); // link만 가져와서 저장
			}

//			File file = new File("data/flash.html");
//			FileOutputStream fos = new FileOutputStream(file);
			FileOutputStream fos = new FileOutputStream(new File("data/flash.html"));
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);

			for (int i = 0; i < newsItemList.size(); i++) {
//				String aTag = "<a href='" + links.get(i) + "'>" + titles.get(i) + "</a><br>";
				bw.write(newsItemList.get(i).getTagItem());
				bw.newLine();
			}
			bw.flush();
			System.out.println("모든 기록이 완료되었습니다.");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러발생");
		}
	}

}
