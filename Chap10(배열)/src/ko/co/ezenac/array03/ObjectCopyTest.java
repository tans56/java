package ko.co.ezenac.array03;

public class ObjectCopyTest {

	public static void main(String[] args) {
		
		Book[] libray = new Book[5];
		Book[] copyLib = new Book[5];
		
		libray[0] = new Book("Spring Security1", "믹 넛슨");
		libray[1] = new Book("Spring Security2", "믹 넛슨");
		libray[2] = new Book("Spring Security3", "믹 넛슨");
		libray[3] = new Book("Spring Security4", "믹 넛슨");
		libray[4] = new Book("Spring Security5", "믹 넛슨");
		
		System.arraycopy(libray, 0, copyLib, 0, 5);
		
		
		System.out.println("========copy libray========");
		for(Book book : copyLib) {
			book.showInfo();
		}
		
		
	}

}
