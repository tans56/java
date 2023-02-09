package kr.co.ezenac.Object;

class Book {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
//	@Override
//	public String toString() {
//		return title + ", "+ author;
//	}
	
	@Override
	public int hashCode() {
		System.out.println("hash code!");
		return super.hashCode();
	}
	
}

public class BookTest {

	public static void main(String[] args) {
		Book book = new Book("개발자 원칙", "박성철");
		System.out.println(book);
	}
}























