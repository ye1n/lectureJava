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

public class NewsFlash {

	// JTBC RSS에서 최신 기사를 가져와서 파일에 저장하는 프로그램을 작성
	// JTBC의 속보 RSS의 주소는 http://fs.jtbc.joins.com//RSS/newsflash.xml
	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<String>();
		File file = new File("data/newsflash.txt");

		try {
			String url = "http://fs.jtbc.joins.com//RSS/newsflash.xml";
			Document doc = Jsoup.connect(url).get();
			Elements list = doc.select("item");

			for (Element item : list) {
				String title = item.selectFirst("title").text(); // 뉴스 중에서 title만 선택해서 text를 저장
				arr.add(title); // arrayList에 넣어준다.
			}

			FileOutputStream fos = new FileOutputStream(file);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);

			for (String title : arr) {
				bw.write(title);
				bw.newLine();
			}

			bw.close();
			osw.close();
			fos.close();

			System.out.println("파일에 저장 되었습니다.");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러 발생");
		}
	}

}
