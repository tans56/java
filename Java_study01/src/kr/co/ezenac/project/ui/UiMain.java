package kr.co.ezenac.project.ui;

import kr.co.ezenac.project.library.Book;
import kr.co.ezenac.project.library.Borrow;
import kr.co.ezenac.project.library.Library;
import kr.co.ezenac.project.library.Member;
import kr.co.ezenac.project.library.view.GenerateDisplay;

public class UiMain {
	Library ezenLibrary = Library.getInstance();
	GenerateDisplay display = new GenerateDisplay();
	
	Book book1;
	Book book2;
	Book book3;
	Book book4;
	Book book5;
	
	Member member1;
	Member member2;
	Member member3;
	Member member4;
	Member member5;
	Member member6;
	
	
	public static void main(String[] args) {
		UiMain uiMain = new UiMain();
		
		uiMain.createBook();
		uiMain.createMember();
		uiMain.borrowBook();
	}

	private void createBook() {
		book1 = new Book("1퍼센트 부자의 법칙", 15, 5);
		book2 = new Book("세이노의 가르침", 12, 4);
		book3 = new Book("GPT 제너레이션", 15, 3);
		book4 = new Book("마리 가족", 19, 2);
		book5 = new Book("역행자", 15, 2);
		
		ezenLibrary.addBook(book1);
		ezenLibrary.addBook(book2);
		ezenLibrary.addBook(book3);
		ezenLibrary.addBook(book4);
		ezenLibrary.addBook(book5);
		
	}
	
	private void createMember() {
		member1 = new Member("국연수", 17);
		member2 = new Member("최웅", 17);
		member3 = new Member("김지웅", 23);
		member4 = new Member("이솔이", 13);
		member5 = new Member("구은호", 19);
		member6 = new Member("엔제이", 16);
		
		ezenLibrary.addMember(member1);
		ezenLibrary.addMember(member2);
		ezenLibrary.addMember(member3);
		ezenLibrary.addMember(member4);
		ezenLibrary.addMember(member5);
		ezenLibrary.addMember(member6);
		
	}
	
	private void borrowBook() {
		addBorrowBook(book1, member1, 2);
		addBorrowBook(book1, member2, 1);
		addBorrowBook(book1, member5, 2);
		
		addBorrowBook(book2, member1, 1);
		addBorrowBook(book2, member4, 3);
		addBorrowBook(book2, member6, 2);
		
		addBorrowBook(book3, member5, 4);
		addBorrowBook(book3, member3, 1);
		
		addBorrowBook(book4, member3, 3);
		addBorrowBook(book4, member2, 1);
		addBorrowBook(book4, member5, 1);
		
		addBorrowBook(book5, member1, 3);
		addBorrowBook(book5, member4, 2);		
		addBorrowBook(book5, member6, 4);
	}

	private void addBorrowBook(Book book, Member member, int day) {
		System.out.println("[" + member.getMemberName() + "] 님이 [" + book.getBookName() + "] 책을 검색중 입니다.");
		
		if(book.getMember().size() < book.getNumOfBook()) {
			if(book.getAgeLimit() <= member.getAge()) {
				book.BorrowBook(member);
				member.addborrow(new Borrow(member.getMemberId(), book, day));
				System.out.println("[" + book.getBookName() + "] 책을" + day + "일 동안 빌렸습니다." );
				System.out.println();
			}
			else {
				System.out.println("연령제한이 걸려 빌리지 못하였습니다.");
				System.out.println();
			}
				
		}else {
			System.out.println("[" + book.getBookName() + "] 책이 없어 빌리지 못하였습니다." );
			System.out.println();
		}
		
	}

}




























