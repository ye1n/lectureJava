package fileTest;

import org.jsoup.nodes.Element;

public class NewsItem {
	private String title;
	private String link;
	private String description;
	private String pubDate;

	// Element를 받아서 해당 엘레멘트에 이는 title을 비롯한 태그들의 값을 빼서 멤버 변수에 넣어준다.
	public void setData(Element item) {
		Element titleElement = item.selectFirst("title");
		if(titleElement != null) {title = titleElement.text();} else {title = ""; }
		
		Element linkElement = item.selectFirst("link");
		if(linkElement != null) {link = linkElement.text();} else {link = ""; }
		
		Element desElement = item.selectFirst("description");
		if(desElement != null) {description = desElement.text();} else {description = ""; }
		
		Element pubElement = item.selectFirst("pubDate");
		if(pubElement != null) {pubDate = pubElement.text();} else {pubDate = ""; }
	}
	
	// 주어진 데이터를 기반으로 태그를 만들어서 반환
	public String getTagItem() {
		String tagItem = "<div class='item'>";
		tagItem += "<a href='" + link + "'>";
		tagItem += title + "[" + pubDate + "]" + "</a>";
		tagItem += "<p>" + description + "</p></div>";

		return tagItem;
	}
}
