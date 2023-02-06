package ko.co.ezenac.array03;

public class ObjectCopyTest {

	public static void main(String[] args) {			//얕은 복사
		
		Book[] libray = new Book[5];
		Book[] copyLib = new Book[5];
		
		libray[0] = new Book("Spring Security1", "믹 넛슨");
		libray[1] = new Book("Spring Security2", "믹 넛슨");
		libray[2] = new Book("Spring Security3", "믹 넛슨");
		libray[3] = new Book("Spring Security4", "믹 넛슨");
		libray[4] = new Book("Spring Security5", "믹 넛슨");
		
		System.arraycopy(libray, 0, copyLib, 0, 5);
		
		
//		System.out.println("======== libray========");
//		for(Book book : libray) {
//			book.showInfo();
//		}
//		System.out.println();
//		
//		System.out.println("========copy libray========");
//		for(Book book : copyLib) {
//			book.showInfo();
//		
//		}
		
		libray[0].setTitle("그래프 머신러닝");
		libray[0].setAuthor("클라우디오 스타밀레");
		
		System.out.println("======== libray========");
		for(Book book : libray) {
			book.showInfo();
		}
		System.out.println();
		
		System.out.println("========copy libray========");
		for(Book book : copyLib) {
			book.showInfo();
		
		}
		
	}

}





















