package pro103p108;

import java.util.ArrayList;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ToonList {

	// 사용자에게 웹툰 제목을 입력받고 해당 문자열을 포함하는 제목의 네이버 웹툰 리스트 가져오기
	// 추가과제 1 : 단, 중복되는 웹툰은 한번만 가져올것
	// 추가과제 2 : 썸네일 이미지 주소도 함께 가져와서 출력되도록 작성
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
				boolean bool = true;
				for (Toon toon : list) {
					if (Integer.parseInt(toon.toonId) == Integer.parseInt(t.toonId)) {
						bool = false;
					}
				}
				if (bool) {
					list.add(t);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("웹툰 파싱 중 오류 발생");
		}

		Scanner in = new Scanner(System.in);
		System.out.println("검색하고자 하는 웹툰의 제목을 입력하세요.");
		String name = in.nextLine(); // 검색하려는 웹툰의 단어를 입력

		for (Toon toon : list) {
			if (toon.checkContain(name)) {
				System.out.println(toon.toString());
			}
		}
	}
}
