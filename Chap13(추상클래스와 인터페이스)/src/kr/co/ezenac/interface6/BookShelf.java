package kr.co.ezenac.interface6;

import java.util.ArrayList;

/*
 * * 책이 순서대로 대여가 되는 책장구현
 * 	- 책을 보관하는 자료 구조(Data Structure)가 구현됨 (ArrayList) 
 * 	- Queue 인터페이스를 구현 
 * 
 */
public class BookShelf {

	protected ArrayList<String> bookshelf;
	
	public BookShelf() {
		bookshelf = new ArrayList<>();
	}
	
	public ArrayList<String> getBookshelf(){
		return bookshelf;
	}
	
	public int getCount() {
		return bookshelf.size();
	}
	
}






















