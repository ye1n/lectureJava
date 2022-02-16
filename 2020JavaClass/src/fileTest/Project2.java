package fileTest;

import java.util.Scanner;

public class Project2 {

	// 네이버 웹툰 다운로더
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// 네이버 웹툰의 경우 주소가 다음과 같다
		// https://comic.naver.com/webtoon/detail?titleId=748105&no=151
		String url = "https://comic.naver.com/webtoon/detail?";

		System.out.println("원하는 웹툰의 id를 입력하세요.");
		String id = in.next();
		url += "titleId=" + id;

		System.out.println("원하는 웹툰의 회차를 입력하세요.");
		String no = in.next();
		url += "&no=" + no;

		System.out.println("저장될 경로를 입력하세요.");
		String path = in.next();
		
		Downloader d = new Downloader();
		d.download(url, path);
	}
}
