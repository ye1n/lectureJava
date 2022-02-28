package pro103p108;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SaveToonList {
	// 네이버 에서 가져온 웹툰 리스트 데이터를 toondata.txt 파일에 한줄씩 저장
	// 추가과제 : ???
	public static void main(String[] args) {

		String url = "https://comic.naver.com/webtoon/weekday.nhn";
		ArrayList<Toon> list = new ArrayList<Toon>();

		try {

			Document doc = Jsoup.connect(url).get();
			Elements toonList = doc.select(".list_area .col_inner li");

			for (Element item : toonList) {
				String name = item.select("a").attr("title");

				// 추가 과제 이미지 주소 가져오기
				String img = item.select(".thumb a img").attr("src");

				// href에서 titleId 숫자만 잘라낸다.
				String href = item.select("a").attr("href");
				int start = href.indexOf("=");
				int end = href.indexOf("&");
				String id = href.substring(start + 1, end);

				// 리스트에 이미 있는 내용이라면 추가 하지 않는다
				Toon t = new Toon(id, name, img);
//				for (Toon toon : list) {
//					if (toon.toonId == t.toonId) {
//						continue;
//					}
//				}
				list.add(t);
			}

			FileOutputStream fos = new FileOutputStream("toonList.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);

			for (Toon t : list) {
				bw.write(t.toString());
				bw.newLine();
			}
			bw.flush();
			System.out.println("파일 기록이 완료되었습니다.");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생");
		}
	}
}
