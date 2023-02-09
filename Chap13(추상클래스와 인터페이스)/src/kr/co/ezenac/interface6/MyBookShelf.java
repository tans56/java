package kr.co.ezenac.interface6;

public class MyBookShelf extends BookShelf implements Queue{

	@Override
	public void enQueue(String title) {
		bookshelf.add(title);
		
	}

	@Override
	public String deQueue() {
		return bookshelf.remove(0);
	}

}
