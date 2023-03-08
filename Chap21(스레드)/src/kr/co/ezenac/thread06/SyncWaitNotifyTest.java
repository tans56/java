package kr.co.ezenac.thread06;

import java.util.ArrayList;

class EzenBooks {
	
	public ArrayList<String> shelf = new ArrayList<>();
	
	public EzenBooks() {
		shelf.add("딥러닝 초보자를 위한 엔비디아 가이드북1");
		shelf.add("딥러닝 초보자를 위한 엔비디아 가이드북2");
		shelf.add("딥러닝 초보자를 위한 엔비디아 가이드북3");
		
	}
	
	public synchronized String lendBook() throws InterruptedException {
		
		while(shelf.size() == 0) {
			System.out.println(Thread.currentThread().getName() + " 빌리는 것을 기다림 시작");
			
			wait();
			System.out.println(Thread.currentThread().getName() + " 빌리는 것을 기다림 종료");
		}
		
		String book = shelf.remove(0);
		System.out.println(Thread.currentThread().getName() +" : "+ book + " 빌림" );
		return book;
	}
	
	public synchronized void returnBook(String book ) {
		shelf.add(book);
		notifyAll();
		System.out.println(Thread.currentThread().getName() +" : "+ book + " 반납함");
		
	}
	
}

class person extends Thread{
	@Override
	public void run() {
		
		try {
		String title = SyncWaitNotifyTest.ezenBooks.lendBook();
		if(title == null) {
			System.out.println(Thread.currentThread().getName() + " : " + " 책 못 빌림");
			return;
		} 		
		Thread.sleep(5000);
		SyncWaitNotifyTest.ezenBooks.returnBook(title);
		} catch (InterruptedException e) {e.printStackTrace();}
	}
	
}


public class SyncWaitNotifyTest {
	public static EzenBooks ezenBooks = new EzenBooks();
	
	public static void main(String[] args) {
		person person1 = new person();
		person person2 = new person();
		person person3 = new person();
		person person4 = new person();
		person person5 = new person();
		person person6 = new person();
		
		person1.start();
		person2.start();
		person3.start();
		person4.start();
		person5.start();
		person6.start();
	}
}




































