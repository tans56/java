package ko.co.ezenac.arraylist02;

import java.util.ArrayList;

import ko.co.ezenac.array03.Book;

public class Student {
	private int studentId;
	private String studentName;
	ArrayList<Book> bookList;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName= studentName;
		bookList = new ArrayList<>();		
	}
	
	public void addBook(String title, String auther) {
		Book book = new Book();
		book.setTitle(title);				//set으로 파리미터 불러옴
		book.setAuthor(auther);
		
		bookList.add(book);
	
	}
	
	public void showInfo() {
		System.out.println(this.studentName + "학생이 읽은 책은 : ");
		for(Book book : bookList) {
			System.out.print(book.getTitle() + " ");
			System.out.println(" 입니다.");
		}
		
	}

}
