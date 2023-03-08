package kr.co.ezenac.project.library;

import java.util.ArrayList;

public class Book {
	public static int code = 0;
	
	private int bookCode;
	private String bookName;
	private int ageLimit;
	private int numOfBook;
	private ArrayList<Member> member = new ArrayList<>();
	
	public Book(String bookName, int ageLimit, int numOfBook) {
		this.bookName = bookName;
		this.ageLimit = ageLimit;
		this.numOfBook = numOfBook;
		bookCode = ++code;
	}

	public int getBookCode() {
		return bookCode;
	}

	public String getBookName() {
		return bookName;
	}

	public int getAgeLimit() {
		return ageLimit;
	}

	public int getNumOfBook() {
		return numOfBook;
	}

	public ArrayList<Member> getMember() {
		return member;
	}
	
	public void BorrowBook (Member m) {
		member.add(m);
	}
}
