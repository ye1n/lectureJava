package pro67p72;

import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class FavorLunch {
	
	// 학교 홈페이지의 4월 급식 리스트 가져와서 사용자로부터 좋아하는 메뉴를 입력받고 해당 메뉴를 포함한 날짜가 몇일 있는지 출력
	// 추가 문제 1 : 해당하는 날의 메뉴도 함께 나오도록 한다.
	// 추가 문제 2 : 년도와 월을 입력받아 해당 월에서 찾는다.
	// 추가 문제 3 : 메뉴를 포함한 날짜도 메뉴와 함께 출력 되도록 한다.
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.println("년도와 월을 입력하세요. ex) 201905");
		String day = in.next();
		String url = "https://y-y.hs.kr/lunch.lunch_list?ym=" + day;

		System.out.println("좋아하는 메뉴를 입력하세요.");
		String menuName = in.next();

		try {
			Document doc = Jsoup.connect(url).get();
			Elements menuList = doc.select(".normal .tabContent > span > a");
			Elements menuDate = doc.select(".normal .dayBox > span");

			int cnt = 0; // 메뉴가 포함된 횟수를 세는 변수
			for (int i = 0; i < menuList.size(); i++) {
				String menu = menuList.get(i).text();
				String date = menuDate.get(i).text();
				if (menu.contains(menuName)) {
					if(Integer.parseInt(date) < 10) {
						System.out.println(day + "0" + date + " : " +  menu);						
					}else {
						System.out.println(day + date + " : " +  menu);
					}
					cnt++;
				}
			}
			if (cnt == 0) { // 메뉴가 안나왔을 경우
				System.out.println("이번달에는 " + menuName + "은(는) 안나옵니다.");
			} else { // 메뉴가 1번이상 나왔을 경우
				System.out.println("이번달에는 " + menuName + "이(가) " + cnt + "번 나옵니다.");
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("값을 가져오는 중 오류 발생");
		}

	}
}