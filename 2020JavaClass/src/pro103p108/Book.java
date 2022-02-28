package pro103p108;

import java.util.Date;

public class Book {
	private String bookName;	// 책이름
	private String auther;		// 저자
	private int bookNum;		// 도서번호(숫자)
	private Date pubDate;		// 출판일(날짜)
	private String description;	// 설명(간단한 책소개)

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	public Date getPubDate() {
		return pubDate;
	}

	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Book(String bookName, String auther, int bookNum, Date pubDate, String description) {
		this.bookName = bookName;
		this.auther = auther;
		this.bookNum = bookNum;
		this.pubDate = pubDate;
		this.description = description;
	}
}